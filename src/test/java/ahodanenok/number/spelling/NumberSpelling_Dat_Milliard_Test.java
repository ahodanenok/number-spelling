package ahodanenok.number.spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSpelling_Dat_Milliard_Test {

    private final NumberSpelling spelling = new NumberSpelling();
    private final SpellingContext context = SpellingContext.builder().withCase(Case.DATIVE).build();

    @Test
    public void check_x_000_000_000_Singular() {
        assertEquals("одному миллиарду", spelling.generate(1_000_000_000L, context));
        assertEquals("двум миллиардам", spelling.generate(2_000_000_000L, context));
        assertEquals("трём миллиардам", spelling.generate(3_000_000_000L, context));
        assertEquals("четырём миллиардам", spelling.generate(4_000_000_000L, context));
        assertEquals("пяти миллиардам", spelling.generate(5_000_000_000L, context));
        assertEquals("шести миллиардам", spelling.generate(6_000_000_000L, context));
        assertEquals("семи миллиардам", spelling.generate(7_000_000_000L, context));
        assertEquals("восьми миллиардам", spelling.generate(8_000_000_000L, context));
        assertEquals("девяти миллиардам", spelling.generate(9_000_000_000L, context));
    }

    @Test
    public void check_x_000_000_000_Plural() {
        SpellingContext pluralContext = context.withCount(Count.PLURAL);
        assertEquals("одним миллиардам", spelling.generate(1_000_000_000L, pluralContext));
        assertEquals("двум миллиардам", spelling.generate(2_000_000_000L, pluralContext));
        assertEquals("трём миллиардам", spelling.generate(3_000_000_000L, pluralContext));
        assertEquals("четырём миллиардам", spelling.generate(4_000_000_000L, pluralContext));
        assertEquals("пяти миллиардам", spelling.generate(5_000_000_000L, pluralContext));
        assertEquals("шести миллиардам", spelling.generate(6_000_000_000L, pluralContext));
        assertEquals("семи миллиардам", spelling.generate(7_000_000_000L, pluralContext));
        assertEquals("восьми миллиардам", spelling.generate(8_000_000_000L, pluralContext));
        assertEquals("девяти миллиардам", spelling.generate(9_000_000_000L, pluralContext));
    }

    @Test
    public void check_1x_000_000_000() {
        assertEquals("одиннадцати миллиардам", spelling.generate(11_000_000_000L, context));
        assertEquals("двенадцати миллиардам", spelling.generate(12_000_000_000L, context));
        assertEquals("тринадцати миллиардам", spelling.generate(13_000_000_000L, context));
        assertEquals("четырнадцати миллиардам", spelling.generate(14_000_000_000L, context));
        assertEquals("пятнадцати миллиардам", spelling.generate(15_000_000_000L, context));
        assertEquals("шестнадцати миллиардам", spelling.generate(16_000_000_000L, context));
        assertEquals("семнадцати миллиардам", spelling.generate(17_000_000_000L, context));
        assertEquals("восемнадцати миллиардам", spelling.generate(18_000_000_000L, context));
        assertEquals("девятнадцати миллиардам", spelling.generate(19_000_000_000L, context));
    }

    @Test
    public void check_x0_000_000_000() {
        assertEquals("десяти миллиардам", spelling.generate(10_000_000_000L, context));
        assertEquals("двадцати миллиардам", spelling.generate(20_000_000_000L, context));
        assertEquals("тридцати миллиардам", spelling.generate(30_000_000_000L, context));
        assertEquals("сорока миллиардам", spelling.generate(40_000_000_000L, context));
        assertEquals("пятидесяти миллиардам", spelling.generate(50_000_000_000L, context));
        assertEquals("шестидесяти миллиардам", spelling.generate(60_000_000_000L, context));
        assertEquals("семидесяти миллиардам", spelling.generate(70_000_000_000L, context));
        assertEquals("восьмидесяти миллиардам", spelling.generate(80_000_000_000L, context));
        assertEquals("девяноста миллиардам", spelling.generate(90_000_000_000L, context));
    }

    @Test
    public void check_xx_000_000_000() {
        assertEquals("двадцати одному миллиарду", spelling.generate(21_000_000_000L, context));
        assertEquals("тридцати двум миллиардам", spelling.generate(32_000_000_000L, context));
        assertEquals("сорока трём миллиардам", spelling.generate(43_000_000_000L, context));
        assertEquals("пятидесяти четырём миллиардам", spelling.generate(54_000_000_000L, context));
        assertEquals("шестидесяти пяти миллиардам", spelling.generate(65_000_000_000L, context));
        assertEquals("семидесяти шести миллиардам", spelling.generate(76_000_000_000L, context));
        assertEquals("восьмидесяти семи миллиардам", spelling.generate(87_000_000_000L, context));
        assertEquals("девяноста восьми миллиардам", spelling.generate(98_000_000_000L, context));
        assertEquals("девяноста девяти миллиардам", spelling.generate(99_000_000_000L, context));
    }

    @Test
    public void check_x0x_000_000_000() {
        assertEquals("ста одному миллиарду", spelling.generate(101_000_000_000L, context));
        assertEquals("двумстам двум миллиардам", spelling.generate(202_000_000_000L, context));
        assertEquals("трёмстам трём миллиардам", spelling.generate(303_000_000_000L, context));
        assertEquals("четырёмстам четырём миллиардам", spelling.generate(404_000_000_000L, context));
        assertEquals("пятистам пяти миллиардам", spelling.generate(505_000_000_000L, context));
        assertEquals("шестистам шести миллиардам", spelling.generate(606_000_000_000L, context));
        assertEquals("семистам семи миллиардам", spelling.generate(707_000_000_000L, context));
        assertEquals("восьмистам восьми миллиардам", spelling.generate(808_000_000_000L, context));
        assertEquals("девятистам девяти миллиардам", spelling.generate(909_000_000_000L, context));
    }
}
