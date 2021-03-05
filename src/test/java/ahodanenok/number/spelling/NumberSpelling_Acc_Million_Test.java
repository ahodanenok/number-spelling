package ahodanenok.number.spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSpelling_Acc_Million_Test {

    private final NumberSpelling spelling = new NumberSpelling();
    private final SpellingContext context = SpellingContext.builder().withCase(Case.ACCUSATIVE).build();

    @Test
    public void check_x_000_000_Singular() {
        assertEquals("один миллион", spelling.generate(1_000_000, context));
        assertEquals("два миллиона", spelling.generate(2_000_000, context));
        assertEquals("три миллиона", spelling.generate(3_000_000, context));
        assertEquals("четыре миллиона", spelling.generate(4_000_000, context));
        assertEquals("пять миллионов", spelling.generate(5_000_000, context));
        assertEquals("шесть миллионов", spelling.generate(6_000_000, context));
        assertEquals("семь миллионов", spelling.generate(7_000_000, context));
        assertEquals("восемь миллионов", spelling.generate(8_000_000, context));
        assertEquals("девять миллионов", spelling.generate(9_000_000, context));
    }

    @Test
    public void check_x_000_000_Plural() {
        SpellingContext pluralContext = context.withCount(Count.PLURAL);
        assertEquals("одни миллионы", spelling.generate(1_000_000, pluralContext));
        assertEquals("два миллиона", spelling.generate(2_000_000, pluralContext));
        assertEquals("три миллиона", spelling.generate(3_000_000, pluralContext));
        assertEquals("четыре миллиона", spelling.generate(4_000_000, pluralContext));
        assertEquals("пять миллионов", spelling.generate(5_000_000, pluralContext));
        assertEquals("шесть миллионов", spelling.generate(6_000_000, pluralContext));
        assertEquals("семь миллионов", spelling.generate(7_000_000, pluralContext));
        assertEquals("восемь миллионов", spelling.generate(8_000_000, pluralContext));
        assertEquals("девять миллионов", spelling.generate(9_000_000, pluralContext));
    }

    @Test
    public void check_1x_000_000() {
        assertEquals("одиннадцать миллионов", spelling.generate(11_000_000, context));
        assertEquals("двенадцать миллионов", spelling.generate(12_000_000, context));
        assertEquals("тринадцать миллионов", spelling.generate(13_000_000, context));
        assertEquals("четырнадцать миллионов", spelling.generate(14_000_000, context));
        assertEquals("пятнадцать миллионов", spelling.generate(15_000_000, context));
        assertEquals("шестнадцать миллионов", spelling.generate(16_000_000, context));
        assertEquals("семнадцать миллионов", spelling.generate(17_000_000, context));
        assertEquals("восемнадцать миллионов", spelling.generate(18_000_000, context));
        assertEquals("девятнадцать миллионов", spelling.generate(19_000_000, context));
    }

    @Test
    public void check_x0_000_000() {
        assertEquals("десять миллионов", spelling.generate(10_000_000, context));
        assertEquals("двадцать миллионов", spelling.generate(20_000_000, context));
        assertEquals("тридцать миллионов", spelling.generate(30_000_000, context));
        assertEquals("сорок миллионов", spelling.generate(40_000_000, context));
        assertEquals("пятьдесят миллионов", spelling.generate(50_000_000, context));
        assertEquals("шестьдесят миллионов", spelling.generate(60_000_000, context));
        assertEquals("семьдесят миллионов", spelling.generate(70_000_000, context));
        assertEquals("восемьдесят миллионов", spelling.generate(80_000_000, context));
        assertEquals("девяносто миллионов", spelling.generate(90_000_000, context));
    }

    @Test
    public void check_xx_000_000() {
        assertEquals("двадцать один миллион", spelling.generate(21_000_000, context));
        assertEquals("тридцать два миллиона", spelling.generate(32_000_000, context));
        assertEquals("сорок три миллиона", spelling.generate(43_000_000, context));
        assertEquals("пятьдесят четыре миллиона", spelling.generate(54_000_000, context));
        assertEquals("шестьдесят пять миллионов", spelling.generate(65_000_000, context));
        assertEquals("семьдесят шесть миллионов", spelling.generate(76_000_000, context));
        assertEquals("восемьдесят семь миллионов", spelling.generate(87_000_000, context));
        assertEquals("девяносто восемь миллионов", spelling.generate(98_000_000, context));
        assertEquals("девяносто девять миллионов", spelling.generate(99_000_000, context));
    }

    @Test
    public void check_x0x_000_000() {
        assertEquals("сто один миллион", spelling.generate(101_000_000, context));
        assertEquals("двести два миллиона", spelling.generate(202_000_000, context));
        assertEquals("триста три миллиона", spelling.generate(303_000_000, context));
        assertEquals("четыреста четыре миллиона", spelling.generate(404_000_000, context));
        assertEquals("пятьсот пять миллионов", spelling.generate(505_000_000, context));
        assertEquals("шестьсот шесть миллионов", spelling.generate(606_000_000, context));
        assertEquals("семьсот семь миллионов", spelling.generate(707_000_000, context));
        assertEquals("восемьсот восемь миллионов", spelling.generate(808_000_000, context));
        assertEquals("девятьсот девять миллионов", spelling.generate(909_000_000, context));
    }
}
