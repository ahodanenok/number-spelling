package ahodanenok.number.spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSpelling_Animacy_4_Test {

    private NumberSpelling spelling = new NumberSpelling();

    @Test
    public void check_Nom_Inanimate() {
        SpellingContext context = SpellingContext.builder().build();
        assertEquals("четыре", spelling.generate(4, context));
    }

    @Test
    public void check_Nom_Animate() {
        SpellingContext context = SpellingContext.builder().withAnimacy(Animacy.ANIMATE).build();
        assertEquals("четыре", spelling.generate(4, context));
    }

    @Test
    public void check_Gen_Inanimate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.GENITIVE).build();
        assertEquals("четырёх", spelling.generate(4, context));
    }

    @Test
    public void check_Gen_Animate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.GENITIVE).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("четырёх", spelling.generate(4, context));
    }

    @Test
    public void check_Dat_Inanimate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.DATIVE).build();
        assertEquals("четырём", spelling.generate(4, context));
    }

    @Test
    public void check_Dat_Animate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.DATIVE).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("четырём", spelling.generate(4, context));
    }

    @Test
    public void check_Acc_Inanimate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.ACCUSATIVE).build();
        assertEquals("четыре", spelling.generate(4, context));
    }

    @Test
    public void check_Acc_Animate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.ACCUSATIVE).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("четырёх", spelling.generate(4, context));
    }

    @Test
    public void check_Inst_Inanimate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.INSTRUMENTAL).build();
        assertEquals("четырьмя", spelling.generate(4, context));
    }

    @Test
    public void check_Inst_Animate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.INSTRUMENTAL).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("четырьмя", spelling.generate(4, context));
    }

    @Test
    public void check_Pre_Inanimate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.PREPOSITIONAL).build();
        assertEquals("четырёх", spelling.generate(4, context));
    }

    @Test
    public void check_Pre_Animate() {
        SpellingContext context = SpellingContext.builder().withCase(Case.PREPOSITIONAL).withAnimacy(Animacy.ANIMATE).build();
        assertEquals("четырёх", spelling.generate(4, context));
    }
}
