package ahodanenok.number.spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSpelling_Gen_Thousand_Test {
    
    private final NumberSpelling spelling = new NumberSpelling();
    private final SpellingContext context = SpellingContext.builder().withCase(Case.GENITIVE).build();
    
    @Test
    public void check_Gen_x000() {
        assertEquals("одной тысячи", spelling.generate(1_000, context));
        assertEquals("двух тысяч", spelling.generate(2_000, context));
        assertEquals("трёх тысяч", spelling.generate(3_000, context));
        assertEquals("четырёх тысяч", spelling.generate(4_000, context));
        assertEquals("пяти тысяч", spelling.generate(5_000, context));
        assertEquals("шести тысяч", spelling.generate(6_000, context));
        assertEquals("семи тысяч", spelling.generate(7_000, context));
        assertEquals("восьми тысяч", spelling.generate(8_000, context));
        assertEquals("девяти тысяч", spelling.generate(9_000, context));
    }

    @Test
    public void check_Gen_1x000() {
        assertEquals("десяти тысяч", spelling.generate(10_000, context));
        assertEquals("одиннадцати тысяч", spelling.generate(11_000, context));
        assertEquals("двенадцати тысяч", spelling.generate(12_000, context));
        assertEquals("тринадцати тысяч", spelling.generate(13_000, context));
        assertEquals("четырнадцати тысяч", spelling.generate(14_000, context));
        assertEquals("пятнадцати тысяч", spelling.generate(15_000, context));
        assertEquals("шестнадцати тысяч", spelling.generate(16_000, context));
        assertEquals("семнадцати тысяч", spelling.generate(17_000, context));
        assertEquals("восемнадцати тысяч", spelling.generate(18_000, context));
        assertEquals("девятнадцати тысяч", spelling.generate(19_000, context));
    }

    @Test
    public void check_Gen_x0000() {
        assertEquals("двадцати тысяч", spelling.generate(20_000, context));
        assertEquals("тридцати тысяч", spelling.generate(30_000, context));
        assertEquals("сорока тысяч", spelling.generate(40_000, context));
        assertEquals("пятидесяти тысяч", spelling.generate(50_000, context));
        assertEquals("шестидесяти тысяч", spelling.generate(60_000, context));
        assertEquals("семидесяти тысяч", spelling.generate(70_000, context));
        assertEquals("восьмидесяти тысяч", spelling.generate(80_000, context));
        assertEquals("девяноста тысяч", spelling.generate(90_000, context));
    }
    
    @Test
    public void check_Gen_xx000() {
        assertEquals("двадцати одной тысячи", spelling.generate(21_000, context));
        assertEquals("тридцати двух тысяч", spelling.generate(32_000, context));
        assertEquals("сорока трёх тысяч", spelling.generate(43_000, context));
        assertEquals("пятидесяти четырёх тысяч", spelling.generate(54_000, context));
        assertEquals("шестидесяти пяти тысяч", spelling.generate(65_000, context));
        assertEquals("семидесяти шести тысяч", spelling.generate(76_000, context));
        assertEquals("восьмидесяти семи тысяч", spelling.generate(87_000, context));
        assertEquals("девяноста восьми тысяч", spelling.generate(98_000, context));
        assertEquals("девяноста девяти тысяч", spelling.generate(99_000, context));
    }

    @Test
    public void check_Gen_x0x000() {
        assertEquals("ста одной тысячи", spelling.generate(101_000, context));
        assertEquals("двухсот двух тысяч", spelling.generate(202_000, context));
        assertEquals("трёхсот трёх тысяч", spelling.generate(303_000, context));
        assertEquals("четырёхсот четырёх тысяч", spelling.generate(404_000, context));
        assertEquals("пятисот пяти тысяч", spelling.generate(505_000, context));
        assertEquals("шестисот шести тысяч", spelling.generate(606_000, context));
        assertEquals("семисот семи тысяч", spelling.generate(707_000, context));
        assertEquals("восьмисот восьми тысяч", spelling.generate(808_000, context));
        assertEquals("девятисот девяти тысяч", spelling.generate(909_000, context));
    }
}
