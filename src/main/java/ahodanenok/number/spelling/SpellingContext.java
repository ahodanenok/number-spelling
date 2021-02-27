package ahodanenok.number.spelling;

/**
 * Информация для генерации названия числа с корректными окончаниями
 */
public final class SpellingContext {

    public static final SpellingContext DEFAULT = SpellingContext.builder().build();

    public static Builder builder() {
        return new Builder();
    }

    private final Case _case;
    private final Count count;
    private final Animacy animacy;
    private final Gender gender;

    private SpellingContext(Case _case, Count count, Animacy animacy, Gender gender) {
        this._case = _case;
        this.count = count;
        this.animacy = animacy;
        this.gender = gender;
    }

    public Case getCase() {
        return _case;
    }

    public Count getCount() {
        return count;
    }

    public Gender getGender() {
        return gender;
    }

    public Animacy getAnimacy() {
        return animacy;
    }

    public static class Builder {

        private Case _case = Case.NOMINATIVE;
        private Count count = Count.SINGULAR;
        private Gender gender = Gender.MASCULINE;
        private Animacy animacy = Animacy.INANIMATE;

        private Builder() { }

        public Builder withCase(Case _case) {
            this._case = _case;
            return this;
        }

        public Builder withCount(Count count) {
            this.count = count;
            return this;
        }

        public Builder withGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Builder withAnimacy(Animacy animacy) {
            this.animacy = animacy;
            return this;
        }

        public SpellingContext build() {
            return new SpellingContext(_case, count, animacy, gender);
        }
    }
}
