package ahodanenok.number.spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSpelling_Dat_Trillion_Test {

    private final NumberSpelling spelling = new NumberSpelling();
    private final SpellingContext context = SpellingContext.builder().withCase(Case.DATIVE).build();

    @Test
    public void check_x_000_000_000_000() {
        assertEquals("одному триллиону", spelling.generate(1_000_000_000_000L, context));
        assertEquals("двум триллионам", spelling.generate(2_000_000_000_000L, context));
        assertEquals("трём триллионам", spelling.generate(3_000_000_000_000L, context));
        assertEquals("четырём триллионам", spelling.generate(4_000_000_000_000L, context));
        assertEquals("пяти триллионам", spelling.generate(5_000_000_000_000L, context));
        assertEquals("шести триллионам", spelling.generate(6_000_000_000_000L, context));
        assertEquals("семи триллионам", spelling.generate(7_000_000_000_000L, context));
        assertEquals("восьми триллионам", spelling.generate(8_000_000_000_000L, context));
        assertEquals("девяти триллионам", spelling.generate(9_000_000_000_000L, context));
    }

    @Test
    public void check_1x_000_000_000_000() {
        assertEquals("одиннадцати триллионам", spelling.generate(11_000_000_000_000L, context));
        assertEquals("двенадцати триллионам", spelling.generate(12_000_000_000_000L, context));
        assertEquals("тринадцати триллионам", spelling.generate(13_000_000_000_000L, context));
        assertEquals("четырнадцати триллионам", spelling.generate(14_000_000_000_000L, context));
        assertEquals("пятнадцати триллионам", spelling.generate(15_000_000_000_000L, context));
        assertEquals("шестнадцати триллионам", spelling.generate(16_000_000_000_000L, context));
        assertEquals("семнадцати триллионам", spelling.generate(17_000_000_000_000L, context));
        assertEquals("восемнадцати триллионам", spelling.generate(18_000_000_000_000L, context));
        assertEquals("девятнадцати триллионам", spelling.generate(19_000_000_000_000L, context));
    }

    @Test
    public void check_x0_000_000_000_000() {
        assertEquals("десяти триллионам", spelling.generate(10_000_000_000_000L, context));
        assertEquals("двадцати триллионам", spelling.generate(20_000_000_000_000L, context));
        assertEquals("тридцати триллионам", spelling.generate(30_000_000_000_000L, context));
        assertEquals("сорока триллионам", spelling.generate(40_000_000_000_000L, context));
        assertEquals("пятидесяти триллионам", spelling.generate(50_000_000_000_000L, context));
        assertEquals("шестидесяти триллионам", spelling.generate(60_000_000_000_000L, context));
        assertEquals("семидесяти триллионам", spelling.generate(70_000_000_000_000L, context));
        assertEquals("восьмидесяти триллионам", spelling.generate(80_000_000_000_000L, context));
        assertEquals("девяноста триллионам", spelling.generate(90_000_000_000_000L, context));
    }

    @Test
    public void check_xx_000_000_000_000() {
        assertEquals("двадцати одному триллиону", spelling.generate(21_000_000_000_000L, context));
        assertEquals("тридцати двум триллионам", spelling.generate(32_000_000_000_000L, context));
        assertEquals("сорока трём триллионам", spelling.generate(43_000_000_000_000L, context));
        assertEquals("пятидесяти четырём триллионам", spelling.generate(54_000_000_000_000L, context));
        assertEquals("шестидесяти пяти триллионам", spelling.generate(65_000_000_000_000L, context));
        assertEquals("семидесяти шести триллионам", spelling.generate(76_000_000_000_000L, context));
        assertEquals("восьмидесяти семи триллионам", spelling.generate(87_000_000_000_000L, context));
        assertEquals("девяноста восьми триллионам", spelling.generate(98_000_000_000_000L, context));
        assertEquals("девяноста девяти триллионам", spelling.generate(99_000_000_000_000L, context));
    }

    @Test
    public void check_x0x_000_000_000_000() {
        assertEquals("ста одному триллиону", spelling.generate(101_000_000_000_000L, context));
        assertEquals("двумстам двум триллионам", spelling.generate(202_000_000_000_000L, context));
        assertEquals("трёмстам трём триллионам", spelling.generate(303_000_000_000_000L, context));
        assertEquals("четырёмстам четырём триллионам", spelling.generate(404_000_000_000_000L, context));
        assertEquals("пятистам пяти триллионам", spelling.generate(505_000_000_000_000L, context));
        assertEquals("шестистам шести триллионам", spelling.generate(606_000_000_000_000L, context));
        assertEquals("семистам семи триллионам", spelling.generate(707_000_000_000_000L, context));
        assertEquals("восьмистам восьми триллионам", spelling.generate(808_000_000_000_000L, context));
        assertEquals("девятистам девяти триллионам", spelling.generate(909_000_000_000_000L, context));
    }
}
