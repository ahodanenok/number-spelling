package ahodanenok.number.spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSpelling_Nom_Trillion_Test {

    private final NumberSpelling spelling = new NumberSpelling();
    private final SpellingContext context = SpellingContext.builder().build();

    @Test
    public void check_x_000_000_000_000() {
        assertEquals("один триллион", spelling.generate(1_000_000_000_000L, context));
        assertEquals("два триллиона", spelling.generate(2_000_000_000_000L, context));
        assertEquals("три триллиона", spelling.generate(3_000_000_000_000L, context));
        assertEquals("четыре триллиона", spelling.generate(4_000_000_000_000L, context));
        assertEquals("пять триллионов", spelling.generate(5_000_000_000_000L, context));
        assertEquals("шесть триллионов", spelling.generate(6_000_000_000_000L, context));
        assertEquals("семь триллионов", spelling.generate(7_000_000_000_000L, context));
        assertEquals("восемь триллионов", spelling.generate(8_000_000_000_000L, context));
        assertEquals("девять триллионов", spelling.generate(9_000_000_000_000L, context));
    }

    @Test
    public void check_1x_000_000_000_000() {
        assertEquals("одиннадцать триллионов", spelling.generate(11_000_000_000_000L, context));
        assertEquals("двенадцать триллионов", spelling.generate(12_000_000_000_000L, context));
        assertEquals("тринадцать триллионов", spelling.generate(13_000_000_000_000L, context));
        assertEquals("четырнадцать триллионов", spelling.generate(14_000_000_000_000L, context));
        assertEquals("пятнадцать триллионов", spelling.generate(15_000_000_000_000L, context));
        assertEquals("шестнадцать триллионов", spelling.generate(16_000_000_000_000L, context));
        assertEquals("семнадцать триллионов", spelling.generate(17_000_000_000_000L, context));
        assertEquals("восемнадцать триллионов", spelling.generate(18_000_000_000_000L, context));
        assertEquals("девятнадцать триллионов", spelling.generate(19_000_000_000_000L, context));
    }

    @Test
    public void check_x0_000_000_000_000() {
        assertEquals("десять триллионов", spelling.generate(10_000_000_000_000L, context));
        assertEquals("двадцать триллионов", spelling.generate(20_000_000_000_000L, context));
        assertEquals("тридцать триллионов", spelling.generate(30_000_000_000_000L, context));
        assertEquals("сорок триллионов", spelling.generate(40_000_000_000_000L, context));
        assertEquals("пятьдесят триллионов", spelling.generate(50_000_000_000_000L, context));
        assertEquals("шестьдесят триллионов", spelling.generate(60_000_000_000_000L, context));
        assertEquals("семьдесят триллионов", spelling.generate(70_000_000_000_000L, context));
        assertEquals("восемьдесят триллионов", spelling.generate(80_000_000_000_000L, context));
        assertEquals("девяносто триллионов", spelling.generate(90_000_000_000_000L, context));
    }

    @Test
    public void check_xx_000_000_000_000() {
        assertEquals("двадцать один триллион", spelling.generate(21_000_000_000_000L, context));
        assertEquals("тридцать два триллиона", spelling.generate(32_000_000_000_000L, context));
        assertEquals("сорок три триллиона", spelling.generate(43_000_000_000_000L, context));
        assertEquals("пятьдесят четыре триллиона", spelling.generate(54_000_000_000_000L, context));
        assertEquals("шестьдесят пять триллионов", spelling.generate(65_000_000_000_000L, context));
        assertEquals("семьдесят шесть триллионов", spelling.generate(76_000_000_000_000L, context));
        assertEquals("восемьдесят семь триллионов", spelling.generate(87_000_000_000_000L, context));
        assertEquals("девяносто восемь триллионов", spelling.generate(98_000_000_000_000L, context));
        assertEquals("девяносто девять триллионов", spelling.generate(99_000_000_000_000L, context));
    }

    @Test
    public void check_x0x_000_000_000_000() {
        assertEquals("сто один триллион", spelling.generate(101_000_000_000_000L, context));
        assertEquals("двести два триллиона", spelling.generate(202_000_000_000_000L, context));
        assertEquals("триста три триллиона", spelling.generate(303_000_000_000_000L, context));
        assertEquals("четыреста четыре триллиона", spelling.generate(404_000_000_000_000L, context));
        assertEquals("пятьсот пять триллионов", spelling.generate(505_000_000_000_000L, context));
        assertEquals("шестьсот шесть триллионов", spelling.generate(606_000_000_000_000L, context));
        assertEquals("семьсот семь триллионов", spelling.generate(707_000_000_000_000L, context));
        assertEquals("восемьсот восемь триллионов", spelling.generate(808_000_000_000_000L, context));
        assertEquals("девятьсот девять триллионов", spelling.generate(909_000_000_000_000L, context));
    }
}
