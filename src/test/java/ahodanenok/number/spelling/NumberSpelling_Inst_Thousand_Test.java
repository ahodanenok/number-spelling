package ahodanenok.number.spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSpelling_Inst_Thousand_Test {
    
    private final NumberSpelling spelling = new NumberSpelling();
    private final SpellingContext context = SpellingContext.builder().withCase(Case.INSTRUMENTAL).build();
    
    @Test
    public void check_Nom_x000_Singluar() {
        assertEquals("одной тысячей", spelling.generate(1_000, context));
        assertEquals("двумя тысячами", spelling.generate(2_000, context));
        assertEquals("тремя тысячами", spelling.generate(3_000, context));
        assertEquals("четырьмя тысячами", spelling.generate(4_000, context));
        assertEquals("пятью тысячами", spelling.generate(5_000, context));
        assertEquals("шестью тысячами", spelling.generate(6_000, context));
        assertEquals("семью тысячами", spelling.generate(7_000, context));
        assertEquals("восьмью тысячами", spelling.generate(8_000, context));
        assertEquals("девятью тысячами", spelling.generate(9_000, context));
    }

    @Test
    public void check_Nom_x000_Plural() {
        SpellingContext pluralContext = context.withCount(Count.PLURAL);
        assertEquals("одними тысячами", spelling.generate(1_000, pluralContext));
        assertEquals("двумя тысячами", spelling.generate(2_000, pluralContext));
        assertEquals("тремя тысячами", spelling.generate(3_000, pluralContext));
        assertEquals("четырьмя тысячами", spelling.generate(4_000, pluralContext));
        assertEquals("пятью тысячами", spelling.generate(5_000, pluralContext));
        assertEquals("шестью тысячами", spelling.generate(6_000, pluralContext));
        assertEquals("семью тысячами", spelling.generate(7_000, pluralContext));
        assertEquals("восьмью тысячами", spelling.generate(8_000, pluralContext));
        assertEquals("девятью тысячами", spelling.generate(9_000, pluralContext));
    }

    @Test
    public void check_Nom_1x000() {
        assertEquals("десятью тысячами", spelling.generate(10_000, context));
        assertEquals("одиннадцатью тысячами", spelling.generate(11_000, context));
        assertEquals("двенадцатью тысячами", spelling.generate(12_000, context));
        assertEquals("тринадцатью тысячами", spelling.generate(13_000, context));
        assertEquals("четырнадцатью тысячами", spelling.generate(14_000, context));
        assertEquals("пятнадцатью тысячами", spelling.generate(15_000, context));
        assertEquals("шестнадцатью тысячами", spelling.generate(16_000, context));
        assertEquals("семнадцатью тысячами", spelling.generate(17_000, context));
        assertEquals("восемнадцатью тысячами", spelling.generate(18_000, context));
        assertEquals("девятнадцатью тысячами", spelling.generate(19_000, context));
    }

    @Test
    public void check_Nom_x0000() {
        assertEquals("двадцатью тысячами", spelling.generate(20_000, context));
        assertEquals("тридцатью тысячами", spelling.generate(30_000, context));
        assertEquals("сорока тысячами", spelling.generate(40_000, context));
        assertEquals("пятьюдесятью тысячами", spelling.generate(50_000, context));
        assertEquals("шестьюдесятью тысячами", spelling.generate(60_000, context));
        assertEquals("семьюдесятью тысячами", spelling.generate(70_000, context));
        assertEquals("восьмьюдесятью тысячами", spelling.generate(80_000, context));
        assertEquals("девяноста тысячами", spelling.generate(90_000, context));
    }
    
    @Test
    public void check_Nom_xx000() {
        assertEquals("двадцатью одной тысячей", spelling.generate(21_000, context));
        assertEquals("тридцатью двумя тысячами", spelling.generate(32_000, context));
        assertEquals("сорока тремя тысячами", spelling.generate(43_000, context));
        assertEquals("пятьюдесятью четырьмя тысячами", spelling.generate(54_000, context));
        assertEquals("шестьюдесятью пятью тысячами", spelling.generate(65_000, context));
        assertEquals("семьюдесятью шестью тысячами", spelling.generate(76_000, context));
        assertEquals("восьмьюдесятью семью тысячами", spelling.generate(87_000, context));
        assertEquals("девяноста восьмью тысячами", spelling.generate(98_000, context));
        assertEquals("девяноста девятью тысячами", spelling.generate(99_000, context));
    }

    @Test
    public void check_Nom_x0x000() {
        assertEquals("ста одной тысячей", spelling.generate(101_000, context));
        assertEquals("двумястами двумя тысячами", spelling.generate(202_000, context));
        assertEquals("тремястами тремя тысячами", spelling.generate(303_000, context));
        assertEquals("четырьмястами четырьмя тысячами", spelling.generate(404_000, context));
        assertEquals("пятьюстами пятью тысячами", spelling.generate(505_000, context));
        assertEquals("шестьюстами шестью тысячами", spelling.generate(606_000, context));
        assertEquals("семьюстами семью тысячами", spelling.generate(707_000, context));
        assertEquals("восьмьюстами восьмью тысячами", spelling.generate(808_000, context));
        assertEquals("девятьюстами девятью тысячами", spelling.generate(909_000, context));
    }
}
