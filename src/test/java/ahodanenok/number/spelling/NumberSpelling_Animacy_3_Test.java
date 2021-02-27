package ahodanenok.number.spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSpelling_Animacy_3_Test {

    private NumberSpelling spelling = new NumberSpelling();

    @Test
    public void check_Nom_Inanimate() {
        SpellingContext context = SpellingContext.builder().build();
        assertEquals("три", spelling.generate(3, context));
    }

    @Test
    public void check_Nom_Animate() {
        SpellingContext context = SpellingContext.builder().withAnimacy(Animacy.ANIMATE).build();
        assertEquals("три", spelling.generate(3, context));
    }

    @Test
    public void check_Gen_Inanimate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.GENITIVE).build();
        assertEquals("трёх", spelling.generate(3, context));
    }

    @Test
    public void check_Gen_Animate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.GENITIVE).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("трёх", spelling.generate(3, context));
    }

    @Test
    public void check_Dat_Inanimate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.DATIVE).build();
        assertEquals("трём", spelling.generate(3, context));
    }

    @Test
    public void check_Dat_Animate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.DATIVE).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("трём", spelling.generate(3, context));
    }

    @Test
    public void check_Acc_Inanimate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.ACCUSATIVE).build();
        assertEquals("три", spelling.generate(3, context));
    }

    @Test
    public void check_Acc_Animate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.ACCUSATIVE).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("трёх", spelling.generate(3, context));
    }

    @Test
    public void check_Inst_Inanimate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.INSTRUMENTAL).build();
        assertEquals("тремя", spelling.generate(3, context));
    }

    @Test
    public void check_Inst_Animate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.INSTRUMENTAL).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("тремя", spelling.generate(3, context));
    }

    @Test
    public void check_Pre_Inanimate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.PREPOSITIONAL).build();
        assertEquals("трёх", spelling.generate(3, context));
    }

    @Test
    public void check_Pre_Animate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.PREPOSITIONAL).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("трёх", spelling.generate(3, context));
    }
}
