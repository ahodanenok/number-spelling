package ahodanenok.number.spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSpelling_Pre_Trillion_Test {

    private final NumberSpelling spelling = new NumberSpelling();
    private final SpellingContext context = SpellingContext.builder().withCase(Case.PREPOSITIONAL).build();

    @Test
    public void check_x_000_000_000_000_Singular() {
        assertEquals("одном триллионе", spelling.generate(1_000_000_000_000L, context));
        assertEquals("двух триллионах", spelling.generate(2_000_000_000_000L, context));
        assertEquals("трёх триллионах", spelling.generate(3_000_000_000_000L, context));
        assertEquals("четырёх триллионах", spelling.generate(4_000_000_000_000L, context));
        assertEquals("пяти триллионах", spelling.generate(5_000_000_000_000L, context));
        assertEquals("шести триллионах", spelling.generate(6_000_000_000_000L, context));
        assertEquals("семи триллионах", spelling.generate(7_000_000_000_000L, context));
        assertEquals("восьми триллионах", spelling.generate(8_000_000_000_000L, context));
        assertEquals("девяти триллионах", spelling.generate(9_000_000_000_000L, context));
    }

    @Test
    public void check_x_000_000_000_000_Plural() {
        SpellingContext pluralContext = context.withCount(Count.PLURAL);
        assertEquals("одних триллионах", spelling.generate(1_000_000_000_000L, pluralContext));
        assertEquals("двух триллионах", spelling.generate(2_000_000_000_000L, pluralContext));
        assertEquals("трёх триллионах", spelling.generate(3_000_000_000_000L, pluralContext));
        assertEquals("четырёх триллионах", spelling.generate(4_000_000_000_000L, pluralContext));
        assertEquals("пяти триллионах", spelling.generate(5_000_000_000_000L, pluralContext));
        assertEquals("шести триллионах", spelling.generate(6_000_000_000_000L, pluralContext));
        assertEquals("семи триллионах", spelling.generate(7_000_000_000_000L, pluralContext));
        assertEquals("восьми триллионах", spelling.generate(8_000_000_000_000L, pluralContext));
        assertEquals("девяти триллионах", spelling.generate(9_000_000_000_000L, pluralContext));
    }


    @Test
    public void check_1x_000_000_000_000() {
        assertEquals("одиннадцати триллионах", spelling.generate(11_000_000_000_000L, context));
        assertEquals("двенадцати триллионах", spelling.generate(12_000_000_000_000L, context));
        assertEquals("тринадцати триллионах", spelling.generate(13_000_000_000_000L, context));
        assertEquals("четырнадцати триллионах", spelling.generate(14_000_000_000_000L, context));
        assertEquals("пятнадцати триллионах", spelling.generate(15_000_000_000_000L, context));
        assertEquals("шестнадцати триллионах", spelling.generate(16_000_000_000_000L, context));
        assertEquals("семнадцати триллионах", spelling.generate(17_000_000_000_000L, context));
        assertEquals("восемнадцати триллионах", spelling.generate(18_000_000_000_000L, context));
        assertEquals("девятнадцати триллионах", spelling.generate(19_000_000_000_000L, context));
    }

    @Test
    public void check_x0_000_000_000_000() {
        assertEquals("десяти триллионах", spelling.generate(10_000_000_000_000L, context));
        assertEquals("двадцати триллионах", spelling.generate(20_000_000_000_000L, context));
        assertEquals("тридцати триллионах", spelling.generate(30_000_000_000_000L, context));
        assertEquals("сорока триллионах", spelling.generate(40_000_000_000_000L, context));
        assertEquals("пятидесяти триллионах", spelling.generate(50_000_000_000_000L, context));
        assertEquals("шестидесяти триллионах", spelling.generate(60_000_000_000_000L, context));
        assertEquals("семидесяти триллионах", spelling.generate(70_000_000_000_000L, context));
        assertEquals("восьмидесяти триллионах", spelling.generate(80_000_000_000_000L, context));
        assertEquals("девяноста триллионах", spelling.generate(90_000_000_000_000L, context));
    }

    @Test
    public void check_xx_000_000_000_000() {
        assertEquals("двадцати одном триллионе", spelling.generate(21_000_000_000_000L, context));
        assertEquals("тридцати двух триллионах", spelling.generate(32_000_000_000_000L, context));
        assertEquals("сорока трёх триллионах", spelling.generate(43_000_000_000_000L, context));
        assertEquals("пятидесяти четырёх триллионах", spelling.generate(54_000_000_000_000L, context));
        assertEquals("шестидесяти пяти триллионах", spelling.generate(65_000_000_000_000L, context));
        assertEquals("семидесяти шести триллионах", spelling.generate(76_000_000_000_000L, context));
        assertEquals("восьмидесяти семи триллионах", spelling.generate(87_000_000_000_000L, context));
        assertEquals("девяноста восьми триллионах", spelling.generate(98_000_000_000_000L, context));
        assertEquals("девяноста девяти триллионах", spelling.generate(99_000_000_000_000L, context));
    }

    @Test
    public void check_x0x_000_000_000_000() {
        assertEquals("ста одном триллионе", spelling.generate(101_000_000_000_000L, context));
        assertEquals("двухстах двух триллионах", spelling.generate(202_000_000_000_000L, context));
        assertEquals("трёхстах трёх триллионах", spelling.generate(303_000_000_000_000L, context));
        assertEquals("четырёхстах четырёх триллионах", spelling.generate(404_000_000_000_000L, context));
        assertEquals("пятистах пяти триллионах", spelling.generate(505_000_000_000_000L, context));
        assertEquals("шестистах шести триллионах", spelling.generate(606_000_000_000_000L, context));
        assertEquals("семистах семи триллионах", spelling.generate(707_000_000_000_000L, context));
        assertEquals("восьмистах восьми триллионах", spelling.generate(808_000_000_000_000L, context));
        assertEquals("девятистах девяти триллионах", spelling.generate(909_000_000_000_000L, context));
    }
}
