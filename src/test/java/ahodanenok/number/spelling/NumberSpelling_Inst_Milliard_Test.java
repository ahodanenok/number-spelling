package ahodanenok.number.spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSpelling_Inst_Milliard_Test {

    private final NumberSpelling spelling = new NumberSpelling();
    private final SpellingContext context = SpellingContext.builder().withCase(Case.INSTRUMENTAL).build();

    @Test
    public void check_x_000_000_000() {
        assertEquals("одним миллиардом", spelling.generate(1_000_000_000L, context));
        assertEquals("двумя миллиардами", spelling.generate(2_000_000_000L, context));
        assertEquals("тремя миллиардами", spelling.generate(3_000_000_000L, context));
        assertEquals("четырьмя миллиардами", spelling.generate(4_000_000_000L, context));
        assertEquals("пятью миллиардами", spelling.generate(5_000_000_000L, context));
        assertEquals("шестью миллиардами", spelling.generate(6_000_000_000L, context));
        assertEquals("семью миллиардами", spelling.generate(7_000_000_000L, context));
        assertEquals("восьмью миллиардами", spelling.generate(8_000_000_000L, context));
        assertEquals("девятью миллиардами", spelling.generate(9_000_000_000L, context));
    }

    @Test
    public void check_1x_000_000_000() {
        assertEquals("одиннадцатью миллиардами", spelling.generate(11_000_000_000L, context));
        assertEquals("двенадцатью миллиардами", spelling.generate(12_000_000_000L, context));
        assertEquals("тринадцатью миллиардами", spelling.generate(13_000_000_000L, context));
        assertEquals("четырнадцатью миллиардами", spelling.generate(14_000_000_000L, context));
        assertEquals("пятнадцатью миллиардами", spelling.generate(15_000_000_000L, context));
        assertEquals("шестнадцатью миллиардами", spelling.generate(16_000_000_000L, context));
        assertEquals("семнадцатью миллиардами", spelling.generate(17_000_000_000L, context));
        assertEquals("восемнадцатью миллиардами", spelling.generate(18_000_000_000L, context));
        assertEquals("девятнадцатью миллиардами", spelling.generate(19_000_000_000L, context));
    }

    @Test
    public void check_x0_000_000_000() {
        assertEquals("десятью миллиардами", spelling.generate(10_000_000_000L, context));
        assertEquals("двадцатью миллиардами", spelling.generate(20_000_000_000L, context));
        assertEquals("тридцатью миллиардами", spelling.generate(30_000_000_000L, context));
        assertEquals("сорока миллиардами", spelling.generate(40_000_000_000L, context));
        assertEquals("пятьюдесятью миллиардами", spelling.generate(50_000_000_000L, context));
        assertEquals("шестьюдесятью миллиардами", spelling.generate(60_000_000_000L, context));
        assertEquals("семьюдесятью миллиардами", spelling.generate(70_000_000_000L, context));
        assertEquals("восьмьюдесятью миллиардами", spelling.generate(80_000_000_000L, context));
        assertEquals("девяноста миллиардами", spelling.generate(90_000_000_000L, context));
    }

    @Test
    public void check_xx_000_000_000() {
        assertEquals("двадцатью одним миллиардом", spelling.generate(21_000_000_000L, context));
        assertEquals("тридцатью двумя миллиардами", spelling.generate(32_000_000_000L, context));
        assertEquals("сорока тремя миллиардами", spelling.generate(43_000_000_000L, context));
        assertEquals("пятьюдесятью четырьмя миллиардами", spelling.generate(54_000_000_000L, context));
        assertEquals("шестьюдесятью пятью миллиардами", spelling.generate(65_000_000_000L, context));
        assertEquals("семьюдесятью шестью миллиардами", spelling.generate(76_000_000_000L, context));
        assertEquals("восьмьюдесятью семью миллиардами", spelling.generate(87_000_000_000L, context));
        assertEquals("девяноста восьмью миллиардами", spelling.generate(98_000_000_000L, context));
        assertEquals("девяноста девятью миллиардами", spelling.generate(99_000_000_000L, context));
    }

    @Test
    public void check_x0x_000_000_000() {
        assertEquals("ста одним миллиардом", spelling.generate(101_000_000_000L, context));
        assertEquals("двумястами двумя миллиардами", spelling.generate(202_000_000_000L, context));
        assertEquals("тремястами тремя миллиардами", spelling.generate(303_000_000_000L, context));
        assertEquals("четырьмястами четырьмя миллиардами", spelling.generate(404_000_000_000L, context));
        assertEquals("пятьюстами пятью миллиардами", spelling.generate(505_000_000_000L, context));
        assertEquals("шестьюстами шестью миллиардами", spelling.generate(606_000_000_000L, context));
        assertEquals("семьюстами семью миллиардами", spelling.generate(707_000_000_000L, context));
        assertEquals("восьмьюстами восьмью миллиардами", spelling.generate(808_000_000_000L, context));
        assertEquals("девятьюстами девятью миллиардами", spelling.generate(909_000_000_000L, context));
    }
}
