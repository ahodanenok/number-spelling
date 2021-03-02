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

    String forNumber(int n, SpellingContext context) {
        return get(String.valueOf(n), context);
    }

    String forExponent(int exp, SpellingContext context) {
        return get("10^" + exp, context);
    }

    /**
     * Поиск названия в следующем порядке:<br>
     * 1. prefix.case.count.animacy.gender<br>
     * 2. prefix.case.count.animacy<br>
     * 3. prefix.case.count.gender<br>
     * 4. prefix.case.animacy.gender<br>
     * 5. prefix.case.animacy<br>
     * 6. prefix.case.gender<br>
     * 7. prefix.case.count<br>
     * 8. prefix.case<br>
     * 9. prefix<br>
     * <br>
     * Если не найден - возвращает null
     */
    private String get(String prefix, SpellingContext context) {
        Case _case = context.getCase();

        if (_case == null) {
            return spellings.getProperty(prefix, prefix);
        }

        Count count = context.getCount();
        Animacy animacy = context.getAnimacy();
        Gender gender = context.getGender();

        String spelling;
        if (count != null
                && animacy != null
                && gender != null
                && (spelling = spellings.getProperty(key(prefix, _case, count, animacy, gender))) != null) {
            return spelling;
        }

        if (count != null
                && animacy != null
                && (spelling = spellings.getProperty(key(prefix, _case, count, animacy))) != null) {
            return spelling;
        }

        if (count != null
                && gender != null
                && (spelling = spellings.getProperty(key(prefix, _case, count, gender))) != null) {
            return spelling;
        }

        if (animacy != null
                && gender != null
                && (spelling = spellings.getProperty(key(prefix, _case, animacy, gender))) != null) {
            return spelling;
        }

        if (animacy != null
                && (spelling = spellings.getProperty(key(prefix, _case, animacy))) != null) {
            return spelling;
        }

        if (gender != null
                && (spelling = spellings.getProperty(key(prefix, _case, gender))) != null) {
            return spelling;
        }

        if (count != null
                && (spelling = spellings.getProperty(key(prefix, _case, count))) != null) {
            return spelling;
        }

        if ((spelling = spellings.getProperty(key(prefix, _case))) != null) {
            return spelling;
        }

        return spellings.getProperty(prefix);
    }

    private String key(String firstPart, Abbreviated... objects) {
        StringBuilder k = new StringBuilder(firstPart);
        for (Abbreviated obj : objects) {
            k.append(".").append(obj.getAbbrev());
        }

        return k.toString();
    }
}
