package ahodanenok.number.spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberSpelling_Nom_Thousand_Test {
    
    private final NumberSpelling spelling = new NumberSpelling();
    private final SpellingContext context = SpellingContext.builder().build();
    
    @Test
    public void check_Nom_x000() {
        assertEquals("одна тысяча", spelling.generate(1_000, context));
        assertEquals("две тысячи", spelling.generate(2_000, context));
        assertEquals("три тысячи", spelling.generate(3_000, context));
        assertEquals("четыре тысячи", spelling.generate(4_000, context));
        assertEquals("пять тысяч", spelling.generate(5_000, context));
        assertEquals("шесть тысяч", spelling.generate(6_000, context));
        assertEquals("семь тысяч", spelling.generate(7_000, context));
        assertEquals("восемь тысяч", spelling.generate(8_000, context));
        assertEquals("девять тысяч", spelling.generate(9_000, context));
    }

    @Test
    public void check_Nom_1x000() {
        assertEquals("десять тысяч", spelling.generate(10_000, context));
        assertEquals("одиннадцать тысяч", spelling.generate(11_000, context));
        assertEquals("двенадцать тысяч", spelling.generate(12_000, context));
        assertEquals("тринадцать тысяч", spelling.generate(13_000, context));
        assertEquals("четырнадцать тысяч", spelling.generate(14_000, context));
        assertEquals("пятнадцать тысяч", spelling.generate(15_000, context));
        assertEquals("шестнадцать тысяч", spelling.generate(16_000, context));
        assertEquals("семнадцать тысяч", spelling.generate(17_000, context));
        assertEquals("восемнадцать тысяч", spelling.generate(18_000, context));
        assertEquals("девятнадцать тысяч", spelling.generate(19_000, context));
    }

    @Test
    public void check_Nom_x0000() {
        assertEquals("двадцать тысяч", spelling.generate(20_000, context));
        assertEquals("тридцать тысяч", spelling.generate(30_000, context));
        assertEquals("сорок тысяч", spelling.generate(40_000, context));
        assertEquals("пятьдесят тысяч", spelling.generate(50_000, context));
        assertEquals("шестьдесят тысяч", spelling.generate(60_000, context));
        assertEquals("семьдесят тысяч", spelling.generate(70_000, context));
        assertEquals("восемьдесят тысяч", spelling.generate(80_000, context));
        assertEquals("девяносто тысяч", spelling.generate(90_000, context));
    }
    
    @Test
    public void check_Nom_xx000() {
        assertEquals("двадцать одна тысяча", spelling.generate(21_000, context));
        assertEquals("тридцать две тысячи", spelling.generate(32_000, context));
        assertEquals("сорок три тысячи", spelling.generate(43_000, context));
        assertEquals("пятьдесят четыре тысячи", spelling.generate(54_000, context));
        assertEquals("шестьдесят пять тысяч", spelling.generate(65_000, context));
        assertEquals("семьдесят шесть тысяч", spelling.generate(76_000, context));
        assertEquals("восемьдесят семь тысяч", spelling.generate(87_000, context));
        assertEquals("девяносто восемь тысяч", spelling.generate(98_000, context));
        assertEquals("девяносто девять тысяч", spelling.generate(99_000, context));
    }

    @Test
    public void check_Nom_x0x000() {
        assertEquals("сто одна тысяча", spelling.generate(101_000, context));
        assertEquals("двести две тысячи", spelling.generate(202_000, context));
        assertEquals("триста три тысячи", spelling.generate(303_000, context));
        assertEquals("четыреста четыре тысячи", spelling.generate(404_000, context));
        assertEquals("пятьсот пять тысяч", spelling.generate(505_000, context));
        assertEquals("шестьсот шесть тысяч", spelling.generate(606_000, context));
        assertEquals("семьсот семь тысяч", spelling.generate(707_000, context));
        assertEquals("восемьсот восемь тысяч", spelling.generate(808_000, context));
        assertEquals("девятьсот девять тысяч", spelling.generate(909_000, context));
    }
}
