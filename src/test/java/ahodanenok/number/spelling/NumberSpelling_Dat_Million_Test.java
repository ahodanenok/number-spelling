package ahodanenok.number.spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSpelling_Dat_Million_Test {

    private final NumberSpelling spelling = new NumberSpelling();
    private final SpellingContext context = SpellingContext.builder().withCase(Case.DATIVE).build();

    @Test
    public void check_x_000_000() {
        assertEquals("одному миллиону", spelling.generate(1_000_000, context));
        assertEquals("двум миллионам", spelling.generate(2_000_000, context));
        assertEquals("трём миллионам", spelling.generate(3_000_000, context));
        assertEquals("четырём миллионам", spelling.generate(4_000_000, context));
        assertEquals("пяти миллионам", spelling.generate(5_000_000, context));
        assertEquals("шести миллионам", spelling.generate(6_000_000, context));
        assertEquals("семи миллионам", spelling.generate(7_000_000, context));
        assertEquals("восьми миллионам", spelling.generate(8_000_000, context));
        assertEquals("девяти миллионам", spelling.generate(9_000_000, context));
    }

    @Test
    public void check_1x_000_000() {
        assertEquals("одиннадцати миллионам", spelling.generate(11_000_000, context));
        assertEquals("двенадцати миллионам", spelling.generate(12_000_000, context));
        assertEquals("тринадцати миллионам", spelling.generate(13_000_000, context));
        assertEquals("четырнадцати миллионам", spelling.generate(14_000_000, context));
        assertEquals("пятнадцати миллионам", spelling.generate(15_000_000, context));
        assertEquals("шестнадцати миллионам", spelling.generate(16_000_000, context));
        assertEquals("семнадцати миллионам", spelling.generate(17_000_000, context));
        assertEquals("восемнадцати миллионам", spelling.generate(18_000_000, context));
        assertEquals("девятнадцати миллионам", spelling.generate(19_000_000, context));
    }

    @Test
    public void check_x0_000_000() {
        assertEquals("десяти миллионам", spelling.generate(10_000_000, context));
        assertEquals("двадцати миллионам", spelling.generate(20_000_000, context));
        assertEquals("тридцати миллионам", spelling.generate(30_000_000, context));
        assertEquals("сорока миллионам", spelling.generate(40_000_000, context));
        assertEquals("пятидесяти миллионам", spelling.generate(50_000_000, context));
        assertEquals("шестидесяти миллионам", spelling.generate(60_000_000, context));
        assertEquals("семидесяти миллионам", spelling.generate(70_000_000, context));
        assertEquals("восьмидесяти миллионам", spelling.generate(80_000_000, context));
        assertEquals("девяноста миллионам", spelling.generate(90_000_000, context));
    }

    @Test
    public void check_xx_000_000() {
        assertEquals("двадцати одному миллиону", spelling.generate(21_000_000, context));
        assertEquals("тридцати двум миллионам", spelling.generate(32_000_000, context));
        assertEquals("сорока трём миллионам", spelling.generate(43_000_000, context));
        assertEquals("пятидесяти четырём миллионам", spelling.generate(54_000_000, context));
        assertEquals("шестидесяти пяти миллионам", spelling.generate(65_000_000, context));
        assertEquals("семидесяти шести миллионам", spelling.generate(76_000_000, context));
        assertEquals("восьмидесяти семи миллионам", spelling.generate(87_000_000, context));
        assertEquals("девяноста восьми миллионам", spelling.generate(98_000_000, context));
        assertEquals("девяноста девяти миллионам", spelling.generate(99_000_000, context));
    }

    @Test
    public void check_x0x_000_000() {
        assertEquals("ста одному миллиону", spelling.generate(101_000_000, context));
        assertEquals("двумстам двум миллионам", spelling.generate(202_000_000, context));
        assertEquals("трёмстам трём миллионам", spelling.generate(303_000_000, context));
        assertEquals("четырёмстам четырём миллионам", spelling.generate(404_000_000, context));
        assertEquals("пятистам пяти миллионам", spelling.generate(505_000_000, context));
        assertEquals("шестистам шести миллионам", spelling.generate(606_000_000, context));
        assertEquals("семистам семи миллионам", spelling.generate(707_000_000, context));
        assertEquals("восьмистам восьми миллионам", spelling.generate(808_000_000, context));
        assertEquals("девятистам девяти миллионам", spelling.generate(909_000_000, context));
    }
}
