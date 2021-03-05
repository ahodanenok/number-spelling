package ahodanenok.number.spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSpelling_Inst_Trillion_Test {

    private final NumberSpelling spelling = new NumberSpelling();
    private final SpellingContext context = SpellingContext.builder().withCase(Case.INSTRUMENTAL).build();

    @Test
    public void check_x_000_000_000_000() {
        assertEquals("одним триллионом", spelling.generate(1_000_000_000_000L, context));
        assertEquals("двумя триллионами", spelling.generate(2_000_000_000_000L, context));
        assertEquals("тремя триллионами", spelling.generate(3_000_000_000_000L, context));
        assertEquals("четырьмя триллионами", spelling.generate(4_000_000_000_000L, context));
        assertEquals("пятью триллионами", spelling.generate(5_000_000_000_000L, context));
        assertEquals("шестью триллионами", spelling.generate(6_000_000_000_000L, context));
        assertEquals("семью триллионами", spelling.generate(7_000_000_000_000L, context));
        assertEquals("восьмью триллионами", spelling.generate(8_000_000_000_000L, context));
        assertEquals("девятью триллионами", spelling.generate(9_000_000_000_000L, context));
    }

    @Test
    public void check_1x_000_000_000_000() {
        assertEquals("одиннадцатью триллионами", spelling.generate(11_000_000_000_000L, context));
        assertEquals("двенадцатью триллионами", spelling.generate(12_000_000_000_000L, context));
        assertEquals("тринадцатью триллионами", spelling.generate(13_000_000_000_000L, context));
        assertEquals("четырнадцатью триллионами", spelling.generate(14_000_000_000_000L, context));
        assertEquals("пятнадцатью триллионами", spelling.generate(15_000_000_000_000L, context));
        assertEquals("шестнадцатью триллионами", spelling.generate(16_000_000_000_000L, context));
        assertEquals("семнадцатью триллионами", spelling.generate(17_000_000_000_000L, context));
        assertEquals("восемнадцатью триллионами", spelling.generate(18_000_000_000_000L, context));
        assertEquals("девятнадцатью триллионами", spelling.generate(19_000_000_000_000L, context));
    }

    @Test
    public void check_x0_000_000_000_000() {
        assertEquals("десятью триллионами", spelling.generate(10_000_000_000_000L, context));
        assertEquals("двадцатью триллионами", spelling.generate(20_000_000_000_000L, context));
        assertEquals("тридцатью триллионами", spelling.generate(30_000_000_000_000L, context));
        assertEquals("сорока триллионами", spelling.generate(40_000_000_000_000L, context));
        assertEquals("пятьюдесятью триллионами", spelling.generate(50_000_000_000_000L, context));
        assertEquals("шестьюдесятью триллионами", spelling.generate(60_000_000_000_000L, context));
        assertEquals("семьюдесятью триллионами", spelling.generate(70_000_000_000_000L, context));
        assertEquals("восьмьюдесятью триллионами", spelling.generate(80_000_000_000_000L, context));
        assertEquals("девяноста триллионами", spelling.generate(90_000_000_000_000L, context));
    }

    @Test
    public void check_xx_000_000_000_000() {
        assertEquals("двадцатью одним триллионом", spelling.generate(21_000_000_000_000L, context));
        assertEquals("тридцатью двумя триллионами", spelling.generate(32_000_000_000_000L, context));
        assertEquals("сорока тремя триллионами", spelling.generate(43_000_000_000_000L, context));
        assertEquals("пятьюдесятью четырьмя триллионами", spelling.generate(54_000_000_000_000L, context));
        assertEquals("шестьюдесятью пятью триллионами", spelling.generate(65_000_000_000_000L, context));
        assertEquals("семьюдесятью шестью триллионами", spelling.generate(76_000_000_000_000L, context));
        assertEquals("восьмьюдесятью семью триллионами", spelling.generate(87_000_000_000_000L, context));
        assertEquals("девяноста восьмью триллионами", spelling.generate(98_000_000_000_000L, context));
        assertEquals("девяноста девятью триллионами", spelling.generate(99_000_000_000_000L, context));
    }

    @Test
    public void check_x0x_000_000_000_000() {
        assertEquals("ста одним триллионом", spelling.generate(101_000_000_000_000L, context));
        assertEquals("двумястами двумя триллионами", spelling.generate(202_000_000_000_000L, context));
        assertEquals("тремястами тремя триллионами", spelling.generate(303_000_000_000_000L, context));
        assertEquals("четырьмястами четырьмя триллионами", spelling.generate(404_000_000_000_000L, context));
        assertEquals("пятьюстами пятью триллионами", spelling.generate(505_000_000_000_000L, context));
        assertEquals("шестьюстами шестью триллионами", spelling.generate(606_000_000_000_000L, context));
        assertEquals("семьюстами семью триллионами", spelling.generate(707_000_000_000_000L, context));
        assertEquals("восьмьюстами восьмью триллионами", spelling.generate(808_000_000_000_000L, context));
        assertEquals("девятьюстами девятью триллионами", spelling.generate(909_000_000_000_000L, context));
    }
}
