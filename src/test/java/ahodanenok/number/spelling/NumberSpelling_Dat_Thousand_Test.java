package ahodanenok.number.spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSpelling_Dat_Thousand_Test {
    
    private final NumberSpelling spelling = new NumberSpelling();
    private final SpellingContext context = SpellingContext.builder().withCase(Case.DATIVE).build();
    
    @Test
    public void check_Dat_x000_Singular() {
        assertEquals("одной тысяче", spelling.generate(1_000, context));
        assertEquals("двум тысячам", spelling.generate(2_000, context));
        assertEquals("трём тысячам", spelling.generate(3_000, context));
        assertEquals("четырём тысячам", spelling.generate(4_000, context));
        assertEquals("пяти тысячам", spelling.generate(5_000, context));
        assertEquals("шести тысячам", spelling.generate(6_000, context));
        assertEquals("семи тысячам", spelling.generate(7_000, context));
        assertEquals("восьми тысячам", spelling.generate(8_000, context));
        assertEquals("девяти тысячам", spelling.generate(9_000, context));
    }

    @Test
    public void check_Nom_x000_Plural() {
        SpellingContext pluralContext = context.withCount(Count.PLURAL);
        assertEquals("одним тысячам", spelling.generate(1_000, pluralContext));
        assertEquals("двум тысячам", spelling.generate(2_000, pluralContext));
        assertEquals("трём тысячам", spelling.generate(3_000, pluralContext));
        assertEquals("четырём тысячам", spelling.generate(4_000, pluralContext));
        assertEquals("пяти тысячам", spelling.generate(5_000, pluralContext));
        assertEquals("шести тысячам", spelling.generate(6_000, pluralContext));
        assertEquals("семи тысячам", spelling.generate(7_000, pluralContext));
        assertEquals("восьми тысячам", spelling.generate(8_000, pluralContext));
        assertEquals("девяти тысячам", spelling.generate(9_000, pluralContext));
    }

    @Test
    public void check_Dat_1x000() {
        assertEquals("десяти тысячам", spelling.generate(10_000, context));
        assertEquals("одиннадцати тысячам", spelling.generate(11_000, context));
        assertEquals("двенадцати тысячам", spelling.generate(12_000, context));
        assertEquals("тринадцати тысячам", spelling.generate(13_000, context));
        assertEquals("четырнадцати тысячам", spelling.generate(14_000, context));
        assertEquals("пятнадцати тысячам", spelling.generate(15_000, context));
        assertEquals("шестнадцати тысячам", spelling.generate(16_000, context));
        assertEquals("семнадцати тысячам", spelling.generate(17_000, context));
        assertEquals("восемнадцати тысячам", spelling.generate(18_000, context));
        assertEquals("девятнадцати тысячам", spelling.generate(19_000, context));
    }

    @Test
    public void check_Dat_x0000() {
        assertEquals("двадцати тысячам", spelling.generate(20_000, context));
        assertEquals("тридцати тысячам", spelling.generate(30_000, context));
        assertEquals("сорока тысячам", spelling.generate(40_000, context));
        assertEquals("пятидесяти тысячам", spelling.generate(50_000, context));
        assertEquals("шестидесяти тысячам", spelling.generate(60_000, context));
        assertEquals("семидесяти тысячам", spelling.generate(70_000, context));
        assertEquals("восьмидесяти тысячам", spelling.generate(80_000, context));
        assertEquals("девяноста тысячам", spelling.generate(90_000, context));
    }
    
    @Test
    public void check_Dat_xx000() {
        assertEquals("двадцати одной тысяче", spelling.generate(21_000, context));
        assertEquals("тридцати двум тысячам", spelling.generate(32_000, context));
        assertEquals("сорока трём тысячам", spelling.generate(43_000, context));
        assertEquals("пятидесяти четырём тысячам", spelling.generate(54_000, context));
        assertEquals("шестидесяти пяти тысячам", spelling.generate(65_000, context));
        assertEquals("семидесяти шести тысячам", spelling.generate(76_000, context));
        assertEquals("восьмидесяти семи тысячам", spelling.generate(87_000, context));
        assertEquals("девяноста восьми тысячам", spelling.generate(98_000, context));
        assertEquals("девяноста девяти тысячам", spelling.generate(99_000, context));
    }

    @Test
    public void check_Dat_x0x000() {
        assertEquals("ста одной тысяче", spelling.generate(101_000, context));
        assertEquals("двумстам двум тысячам", spelling.generate(202_000, context));
        assertEquals("трёмстам трём тысячам", spelling.generate(303_000, context));
        assertEquals("четырёмстам четырём тысячам", spelling.generate(404_000, context));
        assertEquals("пятистам пяти тысячам", spelling.generate(505_000, context));
        assertEquals("шестистам шести тысячам", spelling.generate(606_000, context));
        assertEquals("семистам семи тысячам", spelling.generate(707_000, context));
        assertEquals("восьмистам восьми тысячам", spelling.generate(808_000, context));
        assertEquals("девятистам девяти тысячам", spelling.generate(909_000, context));
    }
}
