package ahodanenok.number.spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSpelling_Gen_Million_Test {
    
    private final NumberSpelling spelling = new NumberSpelling();
    private final SpellingContext context = SpellingContext.builder().withCase(Case.GENITIVE).build();

    @Test
    public void check_x_000_000_Singular() {
        assertEquals("одного миллиона", spelling.generate(1_000_000, context));
        assertEquals("двух миллионов", spelling.generate(2_000_000, context));
        assertEquals("трёх миллионов", spelling.generate(3_000_000, context));
        assertEquals("четырёх миллионов", spelling.generate(4_000_000, context));
        assertEquals("пяти миллионов", spelling.generate(5_000_000, context));
        assertEquals("шести миллионов", spelling.generate(6_000_000, context));
        assertEquals("семи миллионов", spelling.generate(7_000_000, context));
        assertEquals("восьми миллионов", spelling.generate(8_000_000, context));
        assertEquals("девяти миллионов", spelling.generate(9_000_000, context));
    }

    @Test
    public void check_x_000_000_Plural() {
        SpellingContext pluralContext = context.withCount(Count.PLURAL);
        assertEquals("одних миллионов", spelling.generate(1_000_000, pluralContext));
        assertEquals("двух миллионов", spelling.generate(2_000_000, pluralContext));
        assertEquals("трёх миллионов", spelling.generate(3_000_000, pluralContext));
        assertEquals("четырёх миллионов", spelling.generate(4_000_000, pluralContext));
        assertEquals("пяти миллионов", spelling.generate(5_000_000, pluralContext));
        assertEquals("шести миллионов", spelling.generate(6_000_000, pluralContext));
        assertEquals("семи миллионов", spelling.generate(7_000_000, pluralContext));
        assertEquals("восьми миллионов", spelling.generate(8_000_000, pluralContext));
        assertEquals("девяти миллионов", spelling.generate(9_000_000, pluralContext));
    }

    @Test
    public void check_1x_000_000() {
        assertEquals("одиннадцати миллионов", spelling.generate(11_000_000, context));
        assertEquals("двенадцати миллионов", spelling.generate(12_000_000, context));
        assertEquals("тринадцати миллионов", spelling.generate(13_000_000, context));
        assertEquals("четырнадцати миллионов", spelling.generate(14_000_000, context));
        assertEquals("пятнадцати миллионов", spelling.generate(15_000_000, context));
        assertEquals("шестнадцати миллионов", spelling.generate(16_000_000, context));
        assertEquals("семнадцати миллионов", spelling.generate(17_000_000, context));
        assertEquals("восемнадцати миллионов", spelling.generate(18_000_000, context));
        assertEquals("девятнадцати миллионов", spelling.generate(19_000_000, context));
    }

    @Test
    public void check_x0_000_000() {
        assertEquals("десяти миллионов", spelling.generate(10_000_000, context));
        assertEquals("двадцати миллионов", spelling.generate(20_000_000, context));
        assertEquals("тридцати миллионов", spelling.generate(30_000_000, context));
        assertEquals("сорока миллионов", spelling.generate(40_000_000, context));
        assertEquals("пятидесяти миллионов", spelling.generate(50_000_000, context));
        assertEquals("шестидесяти миллионов", spelling.generate(60_000_000, context));
        assertEquals("семидесяти миллионов", spelling.generate(70_000_000, context));
        assertEquals("восьмидесяти миллионов", spelling.generate(80_000_000, context));
        assertEquals("девяноста миллионов", spelling.generate(90_000_000, context));
    }

    @Test
    public void check_xx_000_000() {
        assertEquals("двадцати одного миллиона", spelling.generate(21_000_000, context));
        assertEquals("тридцати двух миллионов", spelling.generate(32_000_000, context));
        assertEquals("сорока трёх миллионов", spelling.generate(43_000_000, context));
        assertEquals("пятидесяти четырёх миллионов", spelling.generate(54_000_000, context));
        assertEquals("шестидесяти пяти миллионов", spelling.generate(65_000_000, context));
        assertEquals("семидесяти шести миллионов", spelling.generate(76_000_000, context));
        assertEquals("восьмидесяти семи миллионов", spelling.generate(87_000_000, context));
        assertEquals("девяноста восьми миллионов", spelling.generate(98_000_000, context));
        assertEquals("девяноста девяти миллионов", spelling.generate(99_000_000, context));
    }

    @Test
    public void check_x0x_000_000() {
        assertEquals("ста одного миллиона", spelling.generate(101_000_000, context));
        assertEquals("двухсот двух миллионов", spelling.generate(202_000_000, context));
        assertEquals("трёхсот трёх миллионов", spelling.generate(303_000_000, context));
        assertEquals("четырёхсот четырёх миллионов", spelling.generate(404_000_000, context));
        assertEquals("пятисот пяти миллионов", spelling.generate(505_000_000, context));
        assertEquals("шестисот шести миллионов", spelling.generate(606_000_000, context));
        assertEquals("семисот семи миллионов", spelling.generate(707_000_000, context));
        assertEquals("восьмисот восьми миллионов", spelling.generate(808_000_000, context));
        assertEquals("девятисот девяти миллионов", spelling.generate(909_000_000, context));
    }
}
