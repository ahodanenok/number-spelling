package ahodanenok.number.spelling;

/**
 * Генерирует словесное название числа на русском языке
 * Например: 321 - > триста двадцать один
 */
public final class NumberSpelling {

    private final Spellings spellings;

    public NumberSpelling() {
        spellings = new Spellings();
    }

    public String generate(int n) {
        return generate(n, SpellingContext.DEFAULT);
    }

    public String generate(int n, SpellingContext context) {
        StringBuilder sb = new StringBuilder();

        int hundreds = (n / 100) * 100;
        if (hundreds != 0) {
            sb.append(defaultIfNull(spellings.get(hundreds, context), hundreds));
        }

        int tensWithOnes = n % 100;
        String tensWithOnesSpelling;
        if (tensWithOnes != 0 && (tensWithOnesSpelling = spellings.get(tensWithOnes, context)) != null) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(tensWithOnesSpelling);
        } else {
            int tens = (tensWithOnes / 10) * 10;
            if (tens != 0) {
                if (sb.length() > 0) sb.append(' ');
                sb.append(defaultIfNull(spellings.get(tens, context), tens));
            }

            int ones = tensWithOnes % 10;
            if (ones != 0 || n == 0) {
                if (sb.length() > 0) sb.append(' ');
                sb.append(defaultIfNull(spellings.get(ones, context), ones));
            }
        }

        return sb.toString();
    }

    private String defaultIfNull(String value, int n) {
        return value != null ? value : String.valueOf(n);
    }
}
