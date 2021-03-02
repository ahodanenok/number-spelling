package ahodanenok.number.spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSpelling_Pre_Thousand_Test {
    
    private final NumberSpelling spelling = new NumberSpelling();
    private final SpellingContext context = SpellingContext.builder().withCase(Case.PREPOSITIONAL).build();
    
    @Test
    public void check_Nom_x000() {
        assertEquals("одной тысяче", spelling.generate(1_000, context));
        assertEquals("двух тысячах", spelling.generate(2_000, context));
        assertEquals("трёх тысячах", spelling.generate(3_000, context));
        assertEquals("четырёх тысячах", spelling.generate(4_000, context));
        assertEquals("пяти тысячах", spelling.generate(5_000, context));
        assertEquals("шести тысячах", spelling.generate(6_000, context));
        assertEquals("семи тысячах", spelling.generate(7_000, context));
        assertEquals("восьми тысячах", spelling.generate(8_000, context));
        assertEquals("девяти тысячах", spelling.generate(9_000, context));
    }

    @Test
    public void check_Nom_1x000() {
        assertEquals("десяти тысячах", spelling.generate(10_000, context));
        assertEquals("одиннадцати тысячах", spelling.generate(11_000, context));
        assertEquals("двенадцати тысячах", spelling.generate(12_000, context));
        assertEquals("тринадцати тысячах", spelling.generate(13_000, context));
        assertEquals("четырнадцати тысячах", spelling.generate(14_000, context));
        assertEquals("пятнадцати тысячах", spelling.generate(15_000, context));
        assertEquals("шестнадцати тысячах", spelling.generate(16_000, context));
        assertEquals("семнадцати тысячах", spelling.generate(17_000, context));
        assertEquals("восемнадцати тысячах", spelling.generate(18_000, context));
        assertEquals("девятнадцати тысячах", spelling.generate(19_000, context));
    }

    @Test
    public void check_Nom_x0000() {
        assertEquals("двадцати тысячах", spelling.generate(20_000, context));
        assertEquals("тридцати тысячах", spelling.generate(30_000, context));
        assertEquals("сорока тысячах", spelling.generate(40_000, context));
        assertEquals("пятидесяти тысячах", spelling.generate(50_000, context));
        assertEquals("шестидесяти тысячах", spelling.generate(60_000, context));
        assertEquals("семидесяти тысячах", spelling.generate(70_000, context));
        assertEquals("восьмидесяти тысячах", spelling.generate(80_000, context));
        assertEquals("девяноста тысячах", spelling.generate(90_000, context));
    }
    
    @Test
    public void check_Nom_xx000() {
        assertEquals("двадцати одной тысяче", spelling.generate(21_000, context));
        assertEquals("тридцати двух тысячах", spelling.generate(32_000, context));
        assertEquals("сорока трёх тысячах", spelling.generate(43_000, context));
        assertEquals("пятидесяти четырёх тысячах", spelling.generate(54_000, context));
        assertEquals("шестидесяти пяти тысячах", spelling.generate(65_000, context));
        assertEquals("семидесяти шести тысячах", spelling.generate(76_000, context));
        assertEquals("восьмидесяти семи тысячах", spelling.generate(87_000, context));
        assertEquals("девяноста восьми тысячах", spelling.generate(98_000, context));
        assertEquals("девяноста девяти тысячах", spelling.generate(99_000, context));
    }

    @Test
    public void check_Nom_x0x000() {
        assertEquals("ста одной тысяче", spelling.generate(101_000, context));
        assertEquals("двухстах двух тысячах", spelling.generate(202_000, context));
        assertEquals("трёхстах трёх тысячах", spelling.generate(303_000, context));
        assertEquals("четырёхстах четырёх тысячах", spelling.generate(404_000, context));
        assertEquals("пятистах пяти тысячах", spelling.generate(505_000, context));
        assertEquals("шестистах шести тысячах", spelling.generate(606_000, context));
        assertEquals("семистах семи тысячах", spelling.generate(707_000, context));
        assertEquals("восьмистах восьми тысячах", spelling.generate(808_000, context));
        assertEquals("девятистах девяти тысячах", spelling.generate(909_000, context));
    }
}
