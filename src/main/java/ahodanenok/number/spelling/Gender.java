package ahodanenok.number.spelling;

/**
 * Род
 */
public enum Gender implements Abbreviated {

    /**
     * Мужской
     */
    MASCULINE("m"),

    /**
     * Женский
     */
    FEMININE("f"),

    /**
     * Средний
     */
    NEUTER("n");

    private final String abbrev;

    Gender(String abbrev) {
        this.abbrev = abbrev;
    }

    public String getAbbrev() {
        return abbrev;
    }
}
