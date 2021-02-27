package ahodanenok.number.spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSpelling_Animacy_2_Test {

    private NumberSpelling spelling = new NumberSpelling();

    @Test
    public void check_Nom_Inanimate_Masculine() {
        SpellingContext context = SpellingContext.builder().build();
        assertEquals("два", spelling.generate(2, context));
    }

    @Test
    public void check_Nom_Animate_Masculine() {
        SpellingContext context = SpellingContext.builder().withAnimacy(Animacy.ANIMATE).build();
        assertEquals("два", spelling.generate(2, context));
    }

    @Test
    public void check_Gen_Inanimate_Masculine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.GENITIVE).build();
        assertEquals("двух", spelling.generate(2, context));
    }

    @Test
    public void check_Gen_Animate_Masculine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.GENITIVE).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("двух", spelling.generate(2, context));
    }

    @Test
    public void check_Dat_Inanimate_Masculine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.DATIVE).build();
        assertEquals("двум", spelling.generate(2, context));
    }

    @Test
    public void check_Dat_Animate_Masculine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.DATIVE).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("двум", spelling.generate(2, context));
    }

    @Test
    public void check_Acc_Inanimate_Masculine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.ACCUSATIVE).build();
        assertEquals("два", spelling.generate(2, context));
    }

    @Test
    public void check_Acc_Animate_Masculine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.ACCUSATIVE).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("двух", spelling.generate(2, context));
    }

    @Test
    public void check_Inst_Inanimate_Masculine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.INSTRUMENTAL).build();
        assertEquals("двумя", spelling.generate(2, context));
    }

    @Test
    public void check_Inst_Animate_Masculine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.INSTRUMENTAL).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("двумя", spelling.generate(2, context));
    }

    @Test
    public void check_Pre_Inanimate_Masculine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.PREPOSITIONAL).build();
        assertEquals("двух", spelling.generate(2, context));
    }

    @Test
    public void check_Pre_Animate_Masculine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.PREPOSITIONAL).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("двух", spelling.generate(2, context));
    }

    @Test
    public void check_Nom_Inanimate_Neuter() {
        SpellingContext context = SpellingContext.builder().withGender(Gender.NEUTER).build();
        assertEquals("два", spelling.generate(2, context));
    }

    @Test
    public void check_Nom_Animate_Neuter() {
        SpellingContext context = SpellingContext.builder().withAnimacy(Animacy.ANIMATE).withGender(Gender.NEUTER).build();
        assertEquals("два", spelling.generate(2, context));
    }

    @Test
    public void check_Gen_Inanimate_Neuter() {
        SpellingContext context = SpellingContext.builder().withCase(Case.GENITIVE).withGender(Gender.NEUTER).build();
        assertEquals("двух", spelling.generate(2, context));
    }

    @Test
    public void check_Gen_Animate_Neuter() {
        SpellingContext context = SpellingContext.builder().withCase(Case.GENITIVE).withAnimacy(Animacy.ANIMATE).withGender(Gender.NEUTER).build();
        assertEquals("двух", spelling.generate(2, context));
    }

    @Test
    public void check_Dat_Inanimate_Neuter() {
        SpellingContext context = SpellingContext.builder().withCase(Case.DATIVE).withGender(Gender.NEUTER).build();
        assertEquals("двум",spelling.generate(2, context));
    }

    @Test
    public void check_Dat_Animate_Neuter() {
        SpellingContext context = SpellingContext.builder().withCase(Case.DATIVE).withAnimacy(Animacy.ANIMATE).withGender(Gender.NEUTER).build();
        assertEquals("двум",spelling.generate(2, context));
    }

    @Test
    public void check_Acc_Inanimate_Neuter() {
        SpellingContext context = SpellingContext.builder().withCase(Case.ACCUSATIVE).withGender(Gender.NEUTER).build();
        assertEquals("два",spelling.generate(2, context));
    }

    @Test
    public void check_Acc_Animate_Neuter() {
        SpellingContext context = SpellingContext.builder().withCase(Case.ACCUSATIVE).withAnimacy(Animacy.ANIMATE).withGender(Gender.NEUTER).build();
        assertEquals("двух",spelling.generate(2, context));
    }

    @Test
    public void check_Inst_Inanimate_Neuter() {
        SpellingContext context = SpellingContext.builder().withCase(Case.INSTRUMENTAL).withGender(Gender.NEUTER).build();
        assertEquals("двумя", spelling.generate(2, context));
    }

    @Test
    public void check_Inst_Animate_Neuter() {
        SpellingContext context = SpellingContext.builder().withCase(Case.INSTRUMENTAL).withAnimacy(Animacy.ANIMATE).withGender(Gender.NEUTER).build();
        assertEquals("двумя", spelling.generate(2, context));
    }

    @Test
    public void check_Pre_Inanimate_Neuter() {
        SpellingContext context = SpellingContext.builder().withCase(Case.PREPOSITIONAL).withGender(Gender.NEUTER).build();
        assertEquals("двух", spelling.generate(2, context));
    }

    @Test
    public void check_Pre_Animate_Neuter() {
        SpellingContext context = SpellingContext.builder().withCase(Case.PREPOSITIONAL).withAnimacy(Animacy.ANIMATE).withGender(Gender.NEUTER).build();
        assertEquals("двух", spelling.generate(2, context));
    }

    @Test
    public void check_Nom_Inanimate_Feminine() {
        SpellingContext context = SpellingContext.builder().withGender(Gender.FEMININE).build();
        assertEquals("две", spelling.generate(2, context));
    }

    @Test
    public void check_Nom_Animate_Feminine() {
        SpellingContext context = SpellingContext.builder().withAnimacy(Animacy.ANIMATE).withGender(Gender.FEMININE).build();
        assertEquals("две", spelling.generate(2, context));
    }

    @Test
    public void check_Gen_Inanimate_Feminine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.GENITIVE).withGender(Gender.FEMININE).build();
        assertEquals("двух", spelling.generate(2, context));
    }

    @Test
    public void check_Gen_Animate_Feminine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.GENITIVE).withAnimacy(Animacy.ANIMATE).withGender(Gender.FEMININE).build();
        assertEquals("двух",spelling.generate(2, context));
    }

    @Test
    public void check_Dat_Inanimate_Feminine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.DATIVE).withGender(Gender.FEMININE).build();
        assertEquals("двум",spelling.generate(2, context));
    }

    @Test
    public void check_Dat_Animate_Feminine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.DATIVE).withAnimacy(Animacy.ANIMATE).withGender(Gender.FEMININE).build();
        assertEquals("двум",spelling.generate(2, context));
    }

    @Test
    public void check_Acc_Inanimate_Feminine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.ACCUSATIVE).withGender(Gender.FEMININE).build();
        assertEquals("две",spelling.generate(2, context));
    }

    @Test
    public void check_Acc_Animate_Feminine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.ACCUSATIVE).withAnimacy(Animacy.ANIMATE).withGender(Gender.FEMININE).build();
        assertEquals("двух", spelling.generate(2, context));
    }

    @Test
    public void check_Inst_Inanimate_Feminine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.INSTRUMENTAL).withGender(Gender.FEMININE).build();
        assertEquals("двумя", spelling.generate(2, context));
    }

    @Test
    public void check_Inst_Animate_Feminine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.INSTRUMENTAL).withAnimacy(Animacy.ANIMATE).withGender(Gender.FEMININE).build();
        assertEquals("двумя", spelling.generate(2, context));
    }

    @Test
    public void check_Pre_Inanimate_Feminine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.PREPOSITIONAL).withGender(Gender.FEMININE).build();
        assertEquals("двух", spelling.generate(2, context));
    }

    @Test
    public void check_Pre_Animate_Feminine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.PREPOSITIONAL).withAnimacy(Animacy.ANIMATE).withGender(Gender.FEMININE).build();
        assertEquals("двух", spelling.generate(2, context));
    }
}
