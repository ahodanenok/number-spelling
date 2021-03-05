package ahodanenok.number.spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSpelling_Inst_Million_Test {

    private final NumberSpelling spelling = new NumberSpelling();
    private final SpellingContext context = SpellingContext.builder().withCase(Case.INSTRUMENTAL).build();

    @Test
    public void check_x_000_000_Singluar() {
        assertEquals("одним миллионом", spelling.generate(1_000_000, context));
        assertEquals("двумя миллионами", spelling.generate(2_000_000, context));
        assertEquals("тремя миллионами", spelling.generate(3_000_000, context));
        assertEquals("четырьмя миллионами", spelling.generate(4_000_000, context));
        assertEquals("пятью миллионами", spelling.generate(5_000_000, context));
        assertEquals("шестью миллионами", spelling.generate(6_000_000, context));
        assertEquals("семью миллионами", spelling.generate(7_000_000, context));
        assertEquals("восьмью миллионами", spelling.generate(8_000_000, context));
        assertEquals("девятью миллионами", spelling.generate(9_000_000, context));
    }

    @Test
    public void check_x_000_000_Plural() {
        SpellingContext pluralContext = context.withCount(Count.PLURAL);
        assertEquals("одними миллионами", spelling.generate(1_000_000, pluralContext));
        assertEquals("двумя миллионами", spelling.generate(2_000_000, pluralContext));
        assertEquals("тремя миллионами", spelling.generate(3_000_000, pluralContext));
        assertEquals("четырьмя миллионами", spelling.generate(4_000_000, pluralContext));
        assertEquals("пятью миллионами", spelling.generate(5_000_000, pluralContext));
        assertEquals("шестью миллионами", spelling.generate(6_000_000, pluralContext));
        assertEquals("семью миллионами", spelling.generate(7_000_000, pluralContext));
        assertEquals("восьмью миллионами", spelling.generate(8_000_000, pluralContext));
        assertEquals("девятью миллионами", spelling.generate(9_000_000, pluralContext));
    }

    @Test
    public void check_1x_000_000() {
        assertEquals("одиннадцатью миллионами", spelling.generate(11_000_000, context));
        assertEquals("двенадцатью миллионами", spelling.generate(12_000_000, context));
        assertEquals("тринадцатью миллионами", spelling.generate(13_000_000, context));
        assertEquals("четырнадцатью миллионами", spelling.generate(14_000_000, context));
        assertEquals("пятнадцатью миллионами", spelling.generate(15_000_000, context));
        assertEquals("шестнадцатью миллионами", spelling.generate(16_000_000, context));
        assertEquals("семнадцатью миллионами", spelling.generate(17_000_000, context));
        assertEquals("восемнадцатью миллионами", spelling.generate(18_000_000, context));
        assertEquals("девятнадцатью миллионами", spelling.generate(19_000_000, context));
    }

    @Test
    public void check_x0_000_000() {
        assertEquals("десятью миллионами", spelling.generate(10_000_000, context));
        assertEquals("двадцатью миллионами", spelling.generate(20_000_000, context));
        assertEquals("тридцатью миллионами", spelling.generate(30_000_000, context));
        assertEquals("сорока миллионами", spelling.generate(40_000_000, context));
        assertEquals("пятьюдесятью миллионами", spelling.generate(50_000_000, context));
        assertEquals("шестьюдесятью миллионами", spelling.generate(60_000_000, context));
        assertEquals("семьюдесятью миллионами", spelling.generate(70_000_000, context));
        assertEquals("восьмьюдесятью миллионами", spelling.generate(80_000_000, context));
        assertEquals("девяноста миллионами", spelling.generate(90_000_000, context));
    }

    @Test
    public void check_xx_000_000() {
        assertEquals("двадцатью одним миллионом", spelling.generate(21_000_000, context));
        assertEquals("тридцатью двумя миллионами", spelling.generate(32_000_000, context));
        assertEquals("сорока тремя миллионами", spelling.generate(43_000_000, context));
        assertEquals("пятьюдесятью четырьмя миллионами", spelling.generate(54_000_000, context));
        assertEquals("шестьюдесятью пятью миллионами", spelling.generate(65_000_000, context));
        assertEquals("семьюдесятью шестью миллионами", spelling.generate(76_000_000, context));
        assertEquals("восьмьюдесятью семью миллионами", spelling.generate(87_000_000, context));
        assertEquals("девяноста восьмью миллионами", spelling.generate(98_000_000, context));
        assertEquals("девяноста девятью миллионами", spelling.generate(99_000_000, context));
    }

    @Test
    public void check_x0x_000_000() {
        assertEquals("ста одним миллионом", spelling.generate(101_000_000, context));
        assertEquals("двумястами двумя миллионами", spelling.generate(202_000_000, context));
        assertEquals("тремястами тремя миллионами", spelling.generate(303_000_000, context));
        assertEquals("четырьмястами четырьмя миллионами", spelling.generate(404_000_000, context));
        assertEquals("пятьюстами пятью миллионами", spelling.generate(505_000_000, context));
        assertEquals("шестьюстами шестью миллионами", spelling.generate(606_000_000, context));
        assertEquals("семьюстами семью миллионами", spelling.generate(707_000_000, context));
        assertEquals("восьмьюстами восьмью миллионами", spelling.generate(808_000_000, context));
        assertEquals("девятьюстами девятью миллионами", spelling.generate(909_000_000, context));
    }
}
