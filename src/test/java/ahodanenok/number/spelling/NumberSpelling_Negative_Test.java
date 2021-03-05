package ahodanenok.number.spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberSpelling_Negative_Test {

    private final NumberSpelling spelling = new NumberSpelling();

    @Test
    public void test_1_Single() {
        SpellingContext context = SpellingContext.builder().withCount(Count.SINGULAR).build();
        assertEquals("минус один", spelling.generate(-1, context.withCase(Case.NOMINATIVE)));
        assertEquals("минус одного", spelling.generate(-1, context.withCase(Case.GENITIVE)));
        assertEquals("минус одному", spelling.generate(-1, context.withCase(Case.DATIVE)));
        assertEquals("минус один", spelling.generate(-1, context.withCase(Case.ACCUSATIVE)));
        assertEquals("минус одним", spelling.generate(-1, context.withCase(Case.INSTRUMENTAL)));
        assertEquals("минус одном", spelling.generate(-1, context.withCase(Case.PREPOSITIONAL)));
    }

    @Test
    public void test_1000_Single() {
        SpellingContext context = SpellingContext.builder().withCount(Count.SINGULAR).build();
        assertEquals("минус одна тысяча", spelling.generate(-1000, context.withCase(Case.NOMINATIVE)));
        assertEquals("минус одной тысячи", spelling.generate(-1000, context.withCase(Case.GENITIVE)));
        assertEquals("минус одной тысяче", spelling.generate(-1000, context.withCase(Case.DATIVE)));
        assertEquals("минус одну тысячу", spelling.generate(-1000, context.withCase(Case.ACCUSATIVE)));
        assertEquals("минус одной тысячей", spelling.generate(-1000, context.withCase(Case.INSTRUMENTAL)));
        assertEquals("минус одной тысяче", spelling.generate(-1000, context.withCase(Case.PREPOSITIONAL)));
    }

    @Test
    public void test_1_Plural() {
        SpellingContext context = SpellingContext.builder().withCount(Count.PLURAL).build();
        assertEquals("минус одни", spelling.generate(-1, context.withCase(Case.NOMINATIVE)));
        assertEquals("минус одних", spelling.generate(-1, context.withCase(Case.GENITIVE)));
        assertEquals("минус одним", spelling.generate(-1, context.withCase(Case.DATIVE)));
        assertEquals("минус одни", spelling.generate(-1, context.withCase(Case.ACCUSATIVE)));
        assertEquals("минус одними", spelling.generate(-1, context.withCase(Case.INSTRUMENTAL)));
        assertEquals("минус одних", spelling.generate(-1, context.withCase(Case.PREPOSITIONAL)));
    }

    @Test
    public void test_1000_Plural() {
        SpellingContext context = SpellingContext.builder().withCount(Count.PLURAL).build();
        assertEquals("минус одни тысячи", spelling.generate(-1000, context.withCase(Case.NOMINATIVE)));
        assertEquals("минус одних тысяч", spelling.generate(-1000, context.withCase(Case.GENITIVE)));
        assertEquals("минус одним тысячам", spelling.generate(-1000, context.withCase(Case.DATIVE)));
        assertEquals("минус одни тысячи", spelling.generate(-1000, context.withCase(Case.ACCUSATIVE)));
        assertEquals("минус одними тысячами", spelling.generate(-1000, context.withCase(Case.INSTRUMENTAL)));
        assertEquals("минус одних тысячах", spelling.generate(-1000, context.withCase(Case.PREPOSITIONAL)));
    }
}
