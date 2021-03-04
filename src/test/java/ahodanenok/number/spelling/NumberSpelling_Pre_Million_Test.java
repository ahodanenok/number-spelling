package ahodanenok.number.spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSpelling_Pre_Million_Test {

    private final NumberSpelling spelling = new NumberSpelling();
    private final SpellingContext context = SpellingContext.builder().withCase(Case.PREPOSITIONAL).build();

    @Test
    public void check_x_000_000() {
        assertEquals("одном миллионе", spelling.generate(1_000_000, context));
        assertEquals("двух миллионах", spelling.generate(2_000_000, context));
        assertEquals("трёх миллионах", spelling.generate(3_000_000, context));
        assertEquals("четырёх миллионах", spelling.generate(4_000_000, context));
        assertEquals("пяти миллионах", spelling.generate(5_000_000, context));
        assertEquals("шести миллионах", spelling.generate(6_000_000, context));
        assertEquals("семи миллионах", spelling.generate(7_000_000, context));
        assertEquals("восьми миллионах", spelling.generate(8_000_000, context));
        assertEquals("девяти миллионах", spelling.generate(9_000_000, context));
    }

    @Test
    public void check_1x_000_000() {
        assertEquals("одиннадцати миллионах", spelling.generate(11_000_000, context));
        assertEquals("двенадцати миллионах", spelling.generate(12_000_000, context));
        assertEquals("тринадцати миллионах", spelling.generate(13_000_000, context));
        assertEquals("четырнадцати миллионах", spelling.generate(14_000_000, context));
        assertEquals("пятнадцати миллионах", spelling.generate(15_000_000, context));
        assertEquals("шестнадцати миллионах", spelling.generate(16_000_000, context));
        assertEquals("семнадцати миллионах", spelling.generate(17_000_000, context));
        assertEquals("восемнадцати миллионах", spelling.generate(18_000_000, context));
        assertEquals("девятнадцати миллионах", spelling.generate(19_000_000, context));
    }

    @Test
    public void check_x0_000_000() {
        assertEquals("десяти миллионах", spelling.generate(10_000_000, context));
        assertEquals("двадцати миллионах", spelling.generate(20_000_000, context));
        assertEquals("тридцати миллионах", spelling.generate(30_000_000, context));
        assertEquals("сорока миллионах", spelling.generate(40_000_000, context));
        assertEquals("пятидесяти миллионах", spelling.generate(50_000_000, context));
        assertEquals("шестидесяти миллионах", spelling.generate(60_000_000, context));
        assertEquals("семидесяти миллионах", spelling.generate(70_000_000, context));
        assertEquals("восьмидесяти миллионах", spelling.generate(80_000_000, context));
        assertEquals("девяноста миллионах", spelling.generate(90_000_000, context));
    }

    @Test
    public void check_xx_000_000() {
        assertEquals("двадцати одном миллионе", spelling.generate(21_000_000, context));
        assertEquals("тридцати двух миллионах", spelling.generate(32_000_000, context));
        assertEquals("сорока трёх миллионах", spelling.generate(43_000_000, context));
        assertEquals("пятидесяти четырёх миллионах", spelling.generate(54_000_000, context));
        assertEquals("шестидесяти пяти миллионах", spelling.generate(65_000_000, context));
        assertEquals("семидесяти шести миллионах", spelling.generate(76_000_000, context));
        assertEquals("восьмидесяти семи миллионах", spelling.generate(87_000_000, context));
        assertEquals("девяноста восьми миллионах", spelling.generate(98_000_000, context));
        assertEquals("девяноста девяти миллионах", spelling.generate(99_000_000, context));
    }

    @Test
    public void check_x0x_000_000() {
        assertEquals("ста одном миллионе", spelling.generate(101_000_000, context));
        assertEquals("двухстах двух миллионах", spelling.generate(202_000_000, context));
        assertEquals("трёхстах трёх миллионах", spelling.generate(303_000_000, context));
        assertEquals("четырёхстах четырёх миллионах", spelling.generate(404_000_000, context));
        assertEquals("пятистах пяти миллионах", spelling.generate(505_000_000, context));
        assertEquals("шестистах шести миллионах", spelling.generate(606_000_000, context));
        assertEquals("семистах семи миллионах", spelling.generate(707_000_000, context));
        assertEquals("восьмистах восьми миллионах", spelling.generate(808_000_000, context));
        assertEquals("девятистах девяти миллионах", spelling.generate(909_000_000, context));
    }
}
