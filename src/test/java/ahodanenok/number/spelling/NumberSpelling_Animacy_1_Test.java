package ahodanenok.number.spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberSpelling_Animacy_1_Test {

    private NumberSpelling spelling = new NumberSpelling();

    @Test
    public void check_Nom_Singular_Inanimate_Masculine() {
        SpellingContext context = SpellingContext.builder().build();
        assertEquals("один", spelling.generate(1, context));
    }

    @Test
    public void check_Nom_Singular_Animate_Masculine() {
        SpellingContext context = SpellingContext.builder().withAnimacy(Animacy.ANIMATE).build();
        assertEquals("один", spelling.generate(1, context));
    }

    @Test
    public void check_Gen_Singular_Inanimate_Masculine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.GENITIVE).build();
        assertEquals("одного", spelling.generate(1, context));
    }

    @Test
    public void check_Gen_Singular_Animate_Masculine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.GENITIVE).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("одного", spelling.generate(1, context));
    }

    @Test
    public void check_Dat_Singular_Inanimate_Masculine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.DATIVE).build();
        assertEquals("одному", spelling.generate(1, context));
    }

    @Test
    public void check_Dat_Singular_Animate_Masculine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.DATIVE).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("одному", spelling.generate(1, context));
    }

    @Test
    public void check_Acc_Singular_Inanimate_Masculine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.ACCUSATIVE).build();
        assertEquals("один", spelling.generate(1, context));
    }

    @Test
    public void check_Acc_Singular_Animate_Masculine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.ACCUSATIVE).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("одного", spelling.generate(1, context));
    }

    @Test
    public void check_Inst_Singular_Inanimate_Masculine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.INSTRUMENTAL).build();
        assertEquals("одним", spelling.generate(1, context));
    }

    @Test
    public void check_Inst_Singular_Animate_Masculine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.INSTRUMENTAL).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("одним", spelling.generate(1, context));
    }

    @Test
    public void check_Pre_Singular_Inanimate_Masculine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.PREPOSITIONAL).build();
        assertEquals("одном", spelling.generate(1, context));
    }

    @Test
    public void check_Pre_Singular_Animate_Masculine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.PREPOSITIONAL).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("одном", spelling.generate(1, context));
    }

    @Test
    public void check_Nom_Singular_Inanimate_Neuter() {
        SpellingContext context = SpellingContext.builder().withGender(Gender.NEUTER).build();
        assertEquals("одно", spelling.generate(1, context));
    }

    @Test
    public void check_Nom_Singular_Animate_Neuter() {
        SpellingContext context = SpellingContext.builder().withAnimacy(Animacy.ANIMATE).withGender(Gender.NEUTER).build();
        assertEquals("одно", spelling.generate(1, context));
    }

    @Test
    public void check_Gen_Singular_Inanimate_Neuter() {
        SpellingContext context = SpellingContext.builder().withCase(Case.GENITIVE).withGender(Gender.NEUTER).build();
        assertEquals("одного", spelling.generate(1, context));
    }

    @Test
    public void check_Gen_Singular_Animate_Neuter() {
        SpellingContext context = SpellingContext.builder().withCase(Case.GENITIVE).withAnimacy(Animacy.ANIMATE).withGender(Gender.NEUTER).build();
        assertEquals("одного",spelling.generate(1, context));
    }

    @Test
    public void check_Dat_Singular_Inanimate_Neuter() {
        SpellingContext context = SpellingContext.builder().withCase(Case.DATIVE).withGender(Gender.NEUTER).build();
        assertEquals("одному",spelling.generate(1, context));
    }

    @Test
    public void check_Dat_Singular_Animate_Neuter() {
        SpellingContext context = SpellingContext.builder().withCase(Case.DATIVE).withAnimacy(Animacy.ANIMATE).withGender(Gender.NEUTER).build();
        assertEquals("одному",spelling.generate(1, context));
    }

    @Test
    public void check_Acc_Singular_Inanimate_Neuter() {
        SpellingContext context = SpellingContext.builder().withCase(Case.ACCUSATIVE).withGender(Gender.NEUTER).build();
        assertEquals("одно",spelling.generate(1, context));
    }

    @Test
    public void check_Acc_Singular_Animate_Neuter() {
        SpellingContext context = SpellingContext.builder().withCase(Case.ACCUSATIVE).withAnimacy(Animacy.ANIMATE).withGender(Gender.NEUTER).build();
        assertEquals("одно",spelling.generate(1, context));
    }

    @Test
    public void check_Inst_Singular_Inanimate_Neuter() {
        SpellingContext context = SpellingContext.builder().withCase(Case.INSTRUMENTAL).withGender(Gender.NEUTER).build();
        assertEquals("одним", spelling.generate(1, context));
    }

    @Test
    public void check_Inst_Singular_Animate_Neuter() {
        SpellingContext context = SpellingContext.builder().withCase(Case.INSTRUMENTAL).withAnimacy(Animacy.ANIMATE).withGender(Gender.NEUTER).build();
        assertEquals("одним", spelling.generate(1, context));
    }

    @Test
    public void check_Pre_Singular_Inanimate_Neuter() {
        SpellingContext context = SpellingContext.builder().withCase(Case.PREPOSITIONAL).withGender(Gender.NEUTER).build();
        assertEquals("одном", spelling.generate(1, context));
    }

    @Test
    public void check_Pre_Singular_Animate_Neuter() {
        SpellingContext context = SpellingContext.builder().withCase(Case.PREPOSITIONAL).withAnimacy(Animacy.ANIMATE).withGender(Gender.NEUTER).build();
        assertEquals("одном", spelling.generate(1, context));
    }

    @Test
    public void check_Nom_Singular_Inanimate_Feminine() {
        SpellingContext context = SpellingContext.builder().withGender(Gender.FEMININE).build();
        assertEquals("одна", spelling.generate(1, context));
    }

    @Test
    public void check_Nom_Singular_Animate_Feminine() {
        SpellingContext context = SpellingContext.builder().withAnimacy(Animacy.ANIMATE).withGender(Gender.FEMININE).build();
        assertEquals("одна", spelling.generate(1, context));
    }

    @Test
    public void check_Gen_Singular_Inanimate_Feminine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.GENITIVE).withGender(Gender.FEMININE).build();
        assertEquals("одной", spelling.generate(1, context));
    }

    @Test
    public void check_Gen_Singular_Animate_Feminine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.GENITIVE).withAnimacy(Animacy.ANIMATE).withGender(Gender.FEMININE).build();
        assertEquals("одной",spelling.generate(1, context));
    }

    @Test
    public void check_Dat_Singular_Inanimate_Feminine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.DATIVE).withGender(Gender.FEMININE).build();
        assertEquals("одной",spelling.generate(1, context));
    }

    @Test
    public void check_Dat_Singular_Animate_Feminine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.DATIVE).withAnimacy(Animacy.ANIMATE).withGender(Gender.FEMININE).build();
        assertEquals("одной",spelling.generate(1, context));
    }

    @Test
    public void check_Acc_Singular_Inanimate_Feminine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.ACCUSATIVE).withGender(Gender.FEMININE).build();
        assertEquals("одну",spelling.generate(1, context));
    }

    @Test
    public void check_Acc_Singular_Animate_Feminine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.ACCUSATIVE).withAnimacy(Animacy.ANIMATE).withGender(Gender.FEMININE).build();
        assertEquals("одну",spelling.generate(1, context));
    }

    @Test
    public void check_Inst_Singular_Inanimate_Feminine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.INSTRUMENTAL).withGender(Gender.FEMININE).build();
        assertEquals("одной", spelling.generate(1, context));
    }

    @Test
    public void check_Inst_Singular_Animate_Feminine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.INSTRUMENTAL).withAnimacy(Animacy.ANIMATE).withGender(Gender.FEMININE).build();
        assertEquals("одной", spelling.generate(1, context));
    }

    @Test
    public void check_Pre_Singular_Inanimate_Feminine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.PREPOSITIONAL).withGender(Gender.FEMININE).build();
        assertEquals("одной", spelling.generate(1, context));
    }

    @Test
    public void check_Pre_Singular_Animate_Feminine() {
        SpellingContext context = SpellingContext.builder().withCase(Case.PREPOSITIONAL).withAnimacy(Animacy.ANIMATE).withGender(Gender.FEMININE).build();
        assertEquals("одной", spelling.generate(1, context));
    }

    @Test
    public void check_Nom_Plural_Inanimate() {
        SpellingContext context = SpellingContext.builder().withCount(Count.PLURAL).build();
        assertEquals("одни", spelling.generate(1, context));
    }

    @Test
    public void check_Nom_Plural_Animate() {
        SpellingContext context = SpellingContext.builder().withCount(Count.PLURAL).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("одни", spelling.generate(1, context));
    }

    @Test
    public void check_Gen_Plural_Inanimate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.GENITIVE).withCount(Count.PLURAL).build();
        assertEquals("одних", spelling.generate(1, context));
    }

    @Test
    public void check_Gen_Plural_Animate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.GENITIVE).withCount(Count.PLURAL).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("одних", spelling.generate(1, context));
    }

    @Test
    public void check_Dat_Plural_Inanimate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.DATIVE).withCount(Count.PLURAL).build();
        assertEquals("одним", spelling.generate(1, context));
    }

    @Test
    public void check_Dat_Plural_Animate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.DATIVE).withCount(Count.PLURAL).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("одним", spelling.generate(1, context));
    }

    @Test
    public void check_Acc_Plural_Inanimate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.ACCUSATIVE).withCount(Count.PLURAL).build();
        assertEquals("одни", spelling.generate(1, context));
    }

    @Test
    public void check_Acc_Plural_Animate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.ACCUSATIVE).withCount(Count.PLURAL).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("одних", spelling.generate(1, context));
    }

    @Test
    public void check_Inst_Plural_Inanimate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.INSTRUMENTAL).withCount(Count.PLURAL).build();
        assertEquals("одними", spelling.generate(1, context));
    }

    @Test
    public void check_Inst_Plural_Animate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.INSTRUMENTAL).withCount(Count.PLURAL).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("одними", spelling.generate(1, context));
    }

    @Test
    public void check_Pre_Plural_Inanimate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.PREPOSITIONAL).withCount(Count.PLURAL).build();
        assertEquals("одних", spelling.generate(1, context));
    }

    @Test
    public void check_Pre_Plural_Animate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.PREPOSITIONAL).withCount(Count.PLURAL).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("одних", spelling.generate(1, context));
    }
}
