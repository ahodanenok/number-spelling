package ahodanenok.number.spelling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.nio.charset.StandardCharsets.UTF_8;

final class Spellings {

    private final Properties spellings;

    Spellings() {
        spellings = new Properties();
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(getClass().getResourceAsStream("spellings.properties"), UTF_8))) {
            spellings.load(in);
        } catch (IOException e) {
            // todo: handle error
            e.printStackTrace();
        }
    }

    /**
     * Поиск названия в следующем порядке:<br>
     * 1. n.case.count.animacy.gender<br>
     * 2. n.case.count.animacy<br>
     * 3. n.case.count.gender<br>
     * 4. n.case.animacy.gender<br>
     * 5. n.case.animacy<br>
     * 6. n.case.gender<br>
     * 7. n.case.count<br>
     * 8. n.case<br>
     * 9. n<br>
     * <br>
     * Если не найден - возвращает null
     */
    String get(int n, SpellingContext context) {
        String nStr = String.valueOf(n);
        Case _case = context.getCase();

        if (_case == null) {
            return spellings.getProperty(nStr, nStr);
        }

        Count count = context.getCount();
        Animacy animacy = context.getAnimacy();
        Gender gender = context.getGender();

        String spelling;
        if (count != null
                && animacy != null
                && gender != null
                && (spelling = spellings.getProperty(key(nStr, _case, count, animacy, gender))) != null) {
            return spelling;
        }

        if (count != null
                && animacy != null
                && (spelling = spellings.getProperty(key(nStr, _case, count, animacy))) != null) {
            return spelling;
        }

        if (count != null
                && gender != null
                && (spelling = spellings.getProperty(key(nStr, _case, count, gender))) != null) {
            return spelling;
        }

        if (animacy != null
                && gender != null
                && (spelling = spellings.getProperty(key(nStr, _case, animacy, gender))) != null) {
            return spelling;
        }

        if (animacy != null
                && (spelling = spellings.getProperty(key(nStr, _case, animacy))) != null) {
            return spelling;
        }

        if (gender != null
                && (spelling = spellings.getProperty(key(nStr, _case, gender))) != null) {
            return spelling;
        }

        if (count != null
                && (spelling = spellings.getProperty(key(nStr, _case, count))) != null) {
            return spelling;
        }

        if ((spelling = spellings.getProperty(key(nStr, _case))) != null) {
            return spelling;
        }

        return spellings.getProperty(nStr);
    }

    private String key(String firstPart, Abbreviated... objects) {
        StringBuilder k = new StringBuilder(firstPart);
        for (Abbreviated obj : objects) {
            k.append(".").append(obj.getAbbrev());
        }

        return k.toString();
    }
}
