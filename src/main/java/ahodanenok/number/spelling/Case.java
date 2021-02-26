package ahodanenok.number.spelling;

/**
 * Падеж
 */
public enum Case implements Abbreviated {

    /**
     * Именительный
     */
    NOMINATIVE("nom"),

    /**
     * Родительный
     */
    GENITIVE("gen"),

    /**
     * Дательный
     */
    DATIVE("dat"),

    /**
     * Винительный
     */
    ACCUSATIVE("acc"),

    /**
     * Творительный
     */
    INSTRUMENTAL("inst"),

    /**
     * Предложный
     */
    PREPOSITIONAL("pre");

    private final String abbrev;

    Case(String abbrev) {
        this.abbrev = abbrev;
    }

    public String getAbbrev() {
        return abbrev;
    }
}
