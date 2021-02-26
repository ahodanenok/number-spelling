package ahodanenok.number.spelling;

/**
 * Одушевленность
 */
public enum Animacy implements Abbreviated {

    /**
     * Одушевлен
     */
    ANIMATE("ani"),

    /**
     * Неодушевлен
     */
    INANIMATE("ina");

    private final String abbrev;

    Animacy(String abbrev) {
        this.abbrev = abbrev;
    }

    @Override
    public String getAbbrev() {
        return null;
    }
}
