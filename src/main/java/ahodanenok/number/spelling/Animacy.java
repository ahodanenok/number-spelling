package ahodanenok.number.spelling;

/**
 * Одушевленность
 */
public enum Animacy implements Abbreviated {

    /**
     * Одушевленный
     */
    ANIMATE("ani"),

    /**
     * Неодушевленный
     */
    INANIMATE("ina");

    private final String abbrev;

    Animacy(String abbrev) {
        this.abbrev = abbrev;
    }

    @Override
    public String getAbbrev() {
        return abbrev;
    }
}
