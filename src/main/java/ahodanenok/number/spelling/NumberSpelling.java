package ahodanenok.number.spelling;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

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
        if (n < 1000) {
            return forThousand(n, context);
        }

        List<String> parts = new ArrayList<>();

        int r = n;
        int exp = 0;
        while (r > 0) {
            if (exp > 0) {
                int preceding = r % 100;
                int ending = preceding % 10;

                SpellingContext localContext = null;
                if (preceding != 11 && preceding % 10 == 1) {
                    // pl -> s
                    if (context.getCount() != Count.SINGULAR) {
                        localContext = context.withCount(Count.SINGULAR);
                    }
                } else if (preceding != 12 && ending == 2
                        || preceding != 13 && ending == 3
                        || preceding != 14 && ending == 4) {
                    // s -> pl
                    if (context.getCount() != Count.PLURAL) {
                        localContext = context.withCount(Count.PLURAL);
                    }
                } else {
                    // s -> pl
                    if (context.getCount() != Count.PLURAL) {
                        localContext = context.withCount(Count.PLURAL);
                    }
                    // acc, nom -> gen
                    if (context.getCase() == Case.NOMINATIVE || context.getCase() == Case.ACCUSATIVE) {
                        localContext = localContext != null
                                ? localContext.withCase(Case.GENITIVE)
                                : context.withCase(Case.GENITIVE);
                    }
                }

                if (localContext == null) {
                    localContext = context;
                }

                String spelling = spellings.forExponent(exp, localContext);
                parts.add(spelling != null ? spelling : String.valueOf((int) Math.pow(10, exp)));
            }

            int a = r % 1000;
            if (a != 0) {
                SpellingContext localContext;
                // тут неявно подразумевается, что название для 1000 будет женского рода, т.е тысяча
                if (exp == 3 && context.getGender() != Gender.FEMININE) {
                    localContext = context.withGender(Gender.FEMININE);
                } else {
                    localContext = context;
                }

                int ending = a % 100;
                if (localContext.getCount() != Count.SINGULAR && ending != 11 && ending % 10 == 1) {
                    // pl -> s
                    localContext = localContext.withCount(Count.SINGULAR);
                }

                parts.add(forThousand(a, localContext));
            }

            r /= 1000;
            exp += 3;
        }

        StringJoiner joiner = new StringJoiner(" ");
        for (int i = parts.size() - 1; i >= 0; i--) {
            joiner.add(parts.get(i));
        }

        return joiner.toString();
    }

    private String forThousand(int n, SpellingContext context) {
        StringBuilder sb = new StringBuilder();

        int hundreds = (n / 100) * 100;
        if (hundreds != 0) {
            sb.append(defaultIfNull(spellings.forNumber(hundreds, context), hundreds));
        }

        int tensWithOnes = n % 100;
        String tensWithOnesSpelling;
        if (tensWithOnes != 0 && (tensWithOnesSpelling = spellings.forNumber(tensWithOnes, context)) != null) {
            if (sb.length() > 0) sb.append(' ');
            sb.append(tensWithOnesSpelling);
        } else {
            int tens = (tensWithOnes / 10) * 10;
            if (tens != 0) {
                if (sb.length() > 0) sb.append(' ');
                sb.append(defaultIfNull(spellings.forNumber(tens, context), tens));
            }

            int ones = tensWithOnes % 10;
            if (ones != 0 || n == 0) {
                if (sb.length() > 0) sb.append(' ');
                sb.append(defaultIfNull(spellings.forNumber(ones, context), ones));
            }
        }

        return sb.toString();
    }

    private String defaultIfNull(String value, int n) {
        return value != null ? value : String.valueOf(n);
    }
}
