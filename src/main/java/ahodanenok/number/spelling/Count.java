package ahodanenok.number.spelling;

/**
 * Число
 */
public enum Count implements Abbreviated {

    /**
     * Единственное число
     */
    SINGULAR("s"),

    /**
     * Множественное
     */
    PLURAL("pl");

    private final String abbrev;

    Count(String abbrev) {
        this.abbrev = abbrev;
    }

    public String getAbbrev() {
        return abbrev;
    }
}
