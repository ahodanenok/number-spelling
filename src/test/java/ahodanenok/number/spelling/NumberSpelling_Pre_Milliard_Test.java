package ahodanenok.number.spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSpelling_Pre_Milliard_Test {

    private final NumberSpelling spelling = new NumberSpelling();
    private final SpellingContext context = SpellingContext.builder().withCase(Case.PREPOSITIONAL).build();

    @Test
    public void check_x_000_000_000() {
        assertEquals("одном миллиарде", spelling.generate(1_000_000_000L, context));
        assertEquals("двух миллиардах", spelling.generate(2_000_000_000L, context));
        assertEquals("трёх миллиардах", spelling.generate(3_000_000_000L, context));
        assertEquals("четырёх миллиардах", spelling.generate(4_000_000_000L, context));
        assertEquals("пяти миллиардах", spelling.generate(5_000_000_000L, context));
        assertEquals("шести миллиардах", spelling.generate(6_000_000_000L, context));
        assertEquals("семи миллиардах", spelling.generate(7_000_000_000L, context));
        assertEquals("восьми миллиардах", spelling.generate(8_000_000_000L, context));
        assertEquals("девяти миллиардах", spelling.generate(9_000_000_000L, context));
    }

    @Test
    public void check_1x_000_000_000() {
        assertEquals("одиннадцати миллиардах", spelling.generate(11_000_000_000L, context));
        assertEquals("двенадцати миллиардах", spelling.generate(12_000_000_000L, context));
        assertEquals("тринадцати миллиардах", spelling.generate(13_000_000_000L, context));
        assertEquals("четырнадцати миллиардах", spelling.generate(14_000_000_000L, context));
        assertEquals("пятнадцати миллиардах", spelling.generate(15_000_000_000L, context));
        assertEquals("шестнадцати миллиардах", spelling.generate(16_000_000_000L, context));
        assertEquals("семнадцати миллиардах", spelling.generate(17_000_000_000L, context));
        assertEquals("восемнадцати миллиардах", spelling.generate(18_000_000_000L, context));
        assertEquals("девятнадцати миллиардах", spelling.generate(19_000_000_000L, context));
    }

    @Test
    public void check_x0_000_000_000() {
        assertEquals("десяти миллиардах", spelling.generate(10_000_000_000L, context));
        assertEquals("двадцати миллиардах", spelling.generate(20_000_000_000L, context));
        assertEquals("тридцати миллиардах", spelling.generate(30_000_000_000L, context));
        assertEquals("сорока миллиардах", spelling.generate(40_000_000_000L, context));
        assertEquals("пятидесяти миллиардах", spelling.generate(50_000_000_000L, context));
        assertEquals("шестидесяти миллиардах", spelling.generate(60_000_000_000L, context));
        assertEquals("семидесяти миллиардах", spelling.generate(70_000_000_000L, context));
        assertEquals("восьмидесяти миллиардах", spelling.generate(80_000_000_000L, context));
        assertEquals("девяноста миллиардах", spelling.generate(90_000_000_000L, context));
    }

    @Test
    public void check_xx_000_000_000() {
        assertEquals("двадцати одном миллиарде", spelling.generate(21_000_000_000L, context));
        assertEquals("тридцати двух миллиардах", spelling.generate(32_000_000_000L, context));
        assertEquals("сорока трёх миллиардах", spelling.generate(43_000_000_000L, context));
        assertEquals("пятидесяти четырёх миллиардах", spelling.generate(54_000_000_000L, context));
        assertEquals("шестидесяти пяти миллиардах", spelling.generate(65_000_000_000L, context));
        assertEquals("семидесяти шести миллиардах", spelling.generate(76_000_000_000L, context));
        assertEquals("восьмидесяти семи миллиардах", spelling.generate(87_000_000_000L, context));
        assertEquals("девяноста восьми миллиардах", spelling.generate(98_000_000_000L, context));
        assertEquals("девяноста девяти миллиардах", spelling.generate(99_000_000_000L, context));
    }

    @Test
    public void check_x0x_000_000_000() {
        assertEquals("ста одном миллиарде", spelling.generate(101_000_000_000L, context));
        assertEquals("двухстах двух миллиардах", spelling.generate(202_000_000_000L, context));
        assertEquals("трёхстах трёх миллиардах", spelling.generate(303_000_000_000L, context));
        assertEquals("четырёхстах четырёх миллиардах", spelling.generate(404_000_000_000L, context));
        assertEquals("пятистах пяти миллиардах", spelling.generate(505_000_000_000L, context));
        assertEquals("шестистах шести миллиардах", spelling.generate(606_000_000_000L, context));
        assertEquals("семистах семи миллиардах", spelling.generate(707_000_000_000L, context));
        assertEquals("восьмистах восьми миллиардах", spelling.generate(808_000_000_000L, context));
        assertEquals("девятистах девяти миллиардах", spelling.generate(909_000_000_000L, context));
    }
}
