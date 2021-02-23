package ahodanenok.number.spelling;

import java.io.*;
import java.util.Properties;

import static java.nio.charset.StandardCharsets.UTF_8;

public class NumberSpelling {

    private Properties names;

    public NumberSpelling() {
        names = new Properties();
        try (BufferedReader in = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("names.properties"), UTF_8))) {
            names.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String generate(int n) {
        StringBuilder sb = new StringBuilder();

        int hundreds = (n / 100) * 100;
        if (hundreds != 0) {
            sb.append(names.getProperty(hundreds + ""));
        }

        int tensWithOnes = n % 100;
        if (tensWithOnes != 0 && names.containsKey(tensWithOnes + "")) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(names.getProperty(tensWithOnes + ""));
        } else {
            int tens = (tensWithOnes / 10) * 10;
            if (tens != 0) {
                if (sb.length() > 0) sb.append(' ');
                sb.append(names.getProperty(tens + ""));
            }

            int ones = tensWithOnes % 10;
            if (ones != 0 || n == 0) {
                if (sb.length() > 0) sb.append(' ');
                sb.append(names.getProperty(ones + ""));
            }
        }

        return sb.toString();
    }
}
