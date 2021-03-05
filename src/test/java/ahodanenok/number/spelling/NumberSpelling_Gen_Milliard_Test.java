package ahodanenok.number.spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSpelling_Gen_Milliard_Test {

    private final NumberSpelling spelling = new NumberSpelling();
    private final SpellingContext context = SpellingContext.builder().withCase(Case.GENITIVE).build();

    @Test
    public void check_x_000_000_000_Singular() {
        assertEquals("одного миллиарда", spelling.generate(1_000_000_000L, context));
        assertEquals("двух миллиардов", spelling.generate(2_000_000_000L, context));
        assertEquals("трёх миллиардов", spelling.generate(3_000_000_000L, context));
        assertEquals("четырёх миллиардов", spelling.generate(4_000_000_000L, context));
        assertEquals("пяти миллиардов", spelling.generate(5_000_000_000L, context));
        assertEquals("шести миллиардов", spelling.generate(6_000_000_000L, context));
        assertEquals("семи миллиардов", spelling.generate(7_000_000_000L, context));
        assertEquals("восьми миллиардов", spelling.generate(8_000_000_000L, context));
        assertEquals("девяти миллиардов", spelling.generate(9_000_000_000L, context));
    }

    @Test
    public void check_x_000_000_000_Plural() {
        SpellingContext pluralContext = context.withCount(Count.PLURAL);
        assertEquals("одних миллиардов", spelling.generate(1_000_000_000L, pluralContext));
        assertEquals("двух миллиардов", spelling.generate(2_000_000_000L, pluralContext));
        assertEquals("трёх миллиардов", spelling.generate(3_000_000_000L, pluralContext));
        assertEquals("четырёх миллиардов", spelling.generate(4_000_000_000L, pluralContext));
        assertEquals("пяти миллиардов", spelling.generate(5_000_000_000L, pluralContext));
        assertEquals("шести миллиардов", spelling.generate(6_000_000_000L, pluralContext));
        assertEquals("семи миллиардов", spelling.generate(7_000_000_000L, pluralContext));
        assertEquals("восьми миллиардов", spelling.generate(8_000_000_000L, pluralContext));
        assertEquals("девяти миллиардов", spelling.generate(9_000_000_000L, pluralContext));
    }

    @Test
    public void check_1x_000_000_000() {
        assertEquals("одиннадцати миллиардов", spelling.generate(11_000_000_000L, context));
        assertEquals("двенадцати миллиардов", spelling.generate(12_000_000_000L, context));
        assertEquals("тринадцати миллиардов", spelling.generate(13_000_000_000L, context));
        assertEquals("четырнадцати миллиардов", spelling.generate(14_000_000_000L, context));
        assertEquals("пятнадцати миллиардов", spelling.generate(15_000_000_000L, context));
        assertEquals("шестнадцати миллиардов", spelling.generate(16_000_000_000L, context));
        assertEquals("семнадцати миллиардов", spelling.generate(17_000_000_000L, context));
        assertEquals("восемнадцати миллиардов", spelling.generate(18_000_000_000L, context));
        assertEquals("девятнадцати миллиардов", spelling.generate(19_000_000_000L, context));
    }

    @Test
    public void check_x0_000_000_000() {
        assertEquals("десяти миллиардов", spelling.generate(10_000_000_000L, context));
        assertEquals("двадцати миллиардов", spelling.generate(20_000_000_000L, context));
        assertEquals("тридцати миллиардов", spelling.generate(30_000_000_000L, context));
        assertEquals("сорока миллиардов", spelling.generate(40_000_000_000L, context));
        assertEquals("пятидесяти миллиардов", spelling.generate(50_000_000_000L, context));
        assertEquals("шестидесяти миллиардов", spelling.generate(60_000_000_000L, context));
        assertEquals("семидесяти миллиардов", spelling.generate(70_000_000_000L, context));
        assertEquals("восьмидесяти миллиардов", spelling.generate(80_000_000_000L, context));
        assertEquals("девяноста миллиардов", spelling.generate(90_000_000_000L, context));
    }

    @Test
    public void check_xx_000_000_000() {
        assertEquals("двадцати одного миллиарда", spelling.generate(21_000_000_000L, context));
        assertEquals("тридцати двух миллиардов", spelling.generate(32_000_000_000L, context));
        assertEquals("сорока трёх миллиардов", spelling.generate(43_000_000_000L, context));
        assertEquals("пятидесяти четырёх миллиардов", spelling.generate(54_000_000_000L, context));
        assertEquals("шестидесяти пяти миллиардов", spelling.generate(65_000_000_000L, context));
        assertEquals("семидесяти шести миллиардов", spelling.generate(76_000_000_000L, context));
        assertEquals("восьмидесяти семи миллиардов", spelling.generate(87_000_000_000L, context));
        assertEquals("девяноста восьми миллиардов", spelling.generate(98_000_000_000L, context));
        assertEquals("девяноста девяти миллиардов", spelling.generate(99_000_000_000L, context));
    }

    @Test
    public void check_x0x_000_000_000() {
        assertEquals("ста одного миллиарда", spelling.generate(101_000_000_000L, context));
        assertEquals("двухсот двух миллиардов", spelling.generate(202_000_000_000L, context));
        assertEquals("трёхсот трёх миллиардов", spelling.generate(303_000_000_000L, context));
        assertEquals("четырёхсот четырёх миллиардов", spelling.generate(404_000_000_000L, context));
        assertEquals("пятисот пяти миллиардов", spelling.generate(505_000_000_000L, context));
        assertEquals("шестисот шести миллиардов", spelling.generate(606_000_000_000L, context));
        assertEquals("семисот семи миллиардов", spelling.generate(707_000_000_000L, context));
        assertEquals("восьмисот восьми миллиардов", spelling.generate(808_000_000_000L, context));
        assertEquals("девятисот девяти миллиардов", spelling.generate(909_000_000_000L, context));
    }
}
