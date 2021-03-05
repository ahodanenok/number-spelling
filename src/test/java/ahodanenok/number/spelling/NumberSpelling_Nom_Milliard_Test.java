package ahodanenok.number.spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSpelling_Nom_Milliard_Test {

    private final NumberSpelling spelling = new NumberSpelling();
    private final SpellingContext context = SpellingContext.builder().build();

    @Test
    public void check_x_000_000_000_Singular() {
        assertEquals("один миллиард", spelling.generate(1_000_000_000L, context));
        assertEquals("два миллиарда", spelling.generate(2_000_000_000L, context));
        assertEquals("три миллиарда", spelling.generate(3_000_000_000L, context));
        assertEquals("четыре миллиарда", spelling.generate(4_000_000_000L, context));
        assertEquals("пять миллиардов", spelling.generate(5_000_000_000L, context));
        assertEquals("шесть миллиардов", spelling.generate(6_000_000_000L, context));
        assertEquals("семь миллиардов", spelling.generate(7_000_000_000L, context));
        assertEquals("восемь миллиардов", spelling.generate(8_000_000_000L, context));
        assertEquals("девять миллиардов", spelling.generate(9_000_000_000L, context));
    }

    @Test
    public void check_x_000_000_000_Plural() {
        SpellingContext pluralContext = context.withCount(Count.PLURAL);
        assertEquals("одни миллиарды", spelling.generate(1_000_000_000L, pluralContext));
        assertEquals("два миллиарда", spelling.generate(2_000_000_000L, pluralContext));
        assertEquals("три миллиарда", spelling.generate(3_000_000_000L, pluralContext));
        assertEquals("четыре миллиарда", spelling.generate(4_000_000_000L, pluralContext));
        assertEquals("пять миллиардов", spelling.generate(5_000_000_000L, pluralContext));
        assertEquals("шесть миллиардов", spelling.generate(6_000_000_000L, pluralContext));
        assertEquals("семь миллиардов", spelling.generate(7_000_000_000L, pluralContext));
        assertEquals("восемь миллиардов", spelling.generate(8_000_000_000L, pluralContext));
        assertEquals("девять миллиардов", spelling.generate(9_000_000_000L, pluralContext));
    }

    @Test
    public void check_1x_000_000_000() {
        assertEquals("одиннадцать миллиардов", spelling.generate(11_000_000_000L, context));
        assertEquals("двенадцать миллиардов", spelling.generate(12_000_000_000L, context));
        assertEquals("тринадцать миллиардов", spelling.generate(13_000_000_000L, context));
        assertEquals("четырнадцать миллиардов", spelling.generate(14_000_000_000L, context));
        assertEquals("пятнадцать миллиардов", spelling.generate(15_000_000_000L, context));
        assertEquals("шестнадцать миллиардов", spelling.generate(16_000_000_000L, context));
        assertEquals("семнадцать миллиардов", spelling.generate(17_000_000_000L, context));
        assertEquals("восемнадцать миллиардов", spelling.generate(18_000_000_000L, context));
        assertEquals("девятнадцать миллиардов", spelling.generate(19_000_000_000L, context));
    }

    @Test
    public void check_x0_000_000_000() {
        assertEquals("десять миллиардов", spelling.generate(10_000_000_000L, context));
        assertEquals("двадцать миллиардов", spelling.generate(20_000_000_000L, context));
        assertEquals("тридцать миллиардов", spelling.generate(30_000_000_000L, context));
        assertEquals("сорок миллиардов", spelling.generate(40_000_000_000L, context));
        assertEquals("пятьдесят миллиардов", spelling.generate(50_000_000_000L, context));
        assertEquals("шестьдесят миллиардов", spelling.generate(60_000_000_000L, context));
        assertEquals("семьдесят миллиардов", spelling.generate(70_000_000_000L, context));
        assertEquals("восемьдесят миллиардов", spelling.generate(80_000_000_000L, context));
        assertEquals("девяносто миллиардов", spelling.generate(90_000_000_000L, context));
    }

    @Test
    public void check_xx_000_000_000() {
        assertEquals("двадцать один миллиард", spelling.generate(21_000_000_000L, context));
        assertEquals("тридцать два миллиарда", spelling.generate(32_000_000_000L, context));
        assertEquals("сорок три миллиарда", spelling.generate(43_000_000_000L, context));
        assertEquals("пятьдесят четыре миллиарда", spelling.generate(54_000_000_000L, context));
        assertEquals("шестьдесят пять миллиардов", spelling.generate(65_000_000_000L, context));
        assertEquals("семьдесят шесть миллиардов", spelling.generate(76_000_000_000L, context));
        assertEquals("восемьдесят семь миллиардов", spelling.generate(87_000_000_000L, context));
        assertEquals("девяносто восемь миллиардов", spelling.generate(98_000_000_000L, context));
        assertEquals("девяносто девять миллиардов", spelling.generate(99_000_000_000L, context));
    }

    @Test
    public void check_x0x_000_000_000() {
        assertEquals("сто один миллиард", spelling.generate(101_000_000_000L, context));
        assertEquals("двести два миллиарда", spelling.generate(202_000_000_000L, context));
        assertEquals("триста три миллиарда", spelling.generate(303_000_000_000L, context));
        assertEquals("четыреста четыре миллиарда", spelling.generate(404_000_000_000L, context));
        assertEquals("пятьсот пять миллиардов", spelling.generate(505_000_000_000L, context));
        assertEquals("шестьсот шесть миллиардов", spelling.generate(606_000_000_000L, context));
        assertEquals("семьсот семь миллиардов", spelling.generate(707_000_000_000L, context));
        assertEquals("восемьсот восемь миллиардов", spelling.generate(808_000_000_000L, context));
        assertEquals("девятьсот девять миллиардов", spelling.generate(909_000_000_000L, context));
    }
}
