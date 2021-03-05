package ahodanenok.number.spelling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSpelling_Gen_Trillion_Test {

    private final NumberSpelling spelling = new NumberSpelling();
    private final SpellingContext context = SpellingContext.builder().withCase(Case.GENITIVE).build();

    @Test
    public void check_x_000_000_000_000_Singular() {
        assertEquals("одного триллиона", spelling.generate(1_000_000_000_000L, context));
        assertEquals("двух триллионов", spelling.generate(2_000_000_000_000L, context));
        assertEquals("трёх триллионов", spelling.generate(3_000_000_000_000L, context));
        assertEquals("четырёх триллионов", spelling.generate(4_000_000_000_000L, context));
        assertEquals("пяти триллионов", spelling.generate(5_000_000_000_000L, context));
        assertEquals("шести триллионов", spelling.generate(6_000_000_000_000L, context));
        assertEquals("семи триллионов", spelling.generate(7_000_000_000_000L, context));
        assertEquals("восьми триллионов", spelling.generate(8_000_000_000_000L, context));
        assertEquals("девяти триллионов", spelling.generate(9_000_000_000_000L, context));
    }

    @Test
    public void check_x_000_000_000_000_Plural() {
        SpellingContext pluralContext = context.withCount(Count.PLURAL);
        assertEquals("одних триллионов", spelling.generate(1_000_000_000_000L, pluralContext));
        assertEquals("двух триллионов", spelling.generate(2_000_000_000_000L, pluralContext));
        assertEquals("трёх триллионов", spelling.generate(3_000_000_000_000L, pluralContext));
        assertEquals("четырёх триллионов", spelling.generate(4_000_000_000_000L, pluralContext));
        assertEquals("пяти триллионов", spelling.generate(5_000_000_000_000L, pluralContext));
        assertEquals("шести триллионов", spelling.generate(6_000_000_000_000L, pluralContext));
        assertEquals("семи триллионов", spelling.generate(7_000_000_000_000L, pluralContext));
        assertEquals("восьми триллионов", spelling.generate(8_000_000_000_000L, pluralContext));
        assertEquals("девяти триллионов", spelling.generate(9_000_000_000_000L, pluralContext));
    }

    @Test
    public void check_1x_000_000_000_000() {
        assertEquals("одиннадцати триллионов", spelling.generate(11_000_000_000_000L, context));
        assertEquals("двенадцати триллионов", spelling.generate(12_000_000_000_000L, context));
        assertEquals("тринадцати триллионов", spelling.generate(13_000_000_000_000L, context));
        assertEquals("четырнадцати триллионов", spelling.generate(14_000_000_000_000L, context));
        assertEquals("пятнадцати триллионов", spelling.generate(15_000_000_000_000L, context));
        assertEquals("шестнадцати триллионов", spelling.generate(16_000_000_000_000L, context));
        assertEquals("семнадцати триллионов", spelling.generate(17_000_000_000_000L, context));
        assertEquals("восемнадцати триллионов", spelling.generate(18_000_000_000_000L, context));
        assertEquals("девятнадцати триллионов", spelling.generate(19_000_000_000_000L, context));
    }

    @Test
    public void check_x0_000_000_000_000() {
        assertEquals("десяти триллионов", spelling.generate(10_000_000_000_000L, context));
        assertEquals("двадцати триллионов", spelling.generate(20_000_000_000_000L, context));
        assertEquals("тридцати триллионов", spelling.generate(30_000_000_000_000L, context));
        assertEquals("сорока триллионов", spelling.generate(40_000_000_000_000L, context));
        assertEquals("пятидесяти триллионов", spelling.generate(50_000_000_000_000L, context));
        assertEquals("шестидесяти триллионов", spelling.generate(60_000_000_000_000L, context));
        assertEquals("семидесяти триллионов", spelling.generate(70_000_000_000_000L, context));
        assertEquals("восьмидесяти триллионов", spelling.generate(80_000_000_000_000L, context));
        assertEquals("девяноста триллионов", spelling.generate(90_000_000_000_000L, context));
    }

    @Test
    public void check_xx_000_000_000_000() {
        assertEquals("двадцати одного триллиона", spelling.generate(21_000_000_000_000L, context));
        assertEquals("тридцати двух триллионов", spelling.generate(32_000_000_000_000L, context));
        assertEquals("сорока трёх триллионов", spelling.generate(43_000_000_000_000L, context));
        assertEquals("пятидесяти четырёх триллионов", spelling.generate(54_000_000_000_000L, context));
        assertEquals("шестидесяти пяти триллионов", spelling.generate(65_000_000_000_000L, context));
        assertEquals("семидесяти шести триллионов", spelling.generate(76_000_000_000_000L, context));
        assertEquals("восьмидесяти семи триллионов", spelling.generate(87_000_000_000_000L, context));
        assertEquals("девяноста восьми триллионов", spelling.generate(98_000_000_000_000L, context));
        assertEquals("девяноста девяти триллионов", spelling.generate(99_000_000_000_000L, context));
    }

    @Test
    public void check_x0x_000_000_000_000() {
        assertEquals("ста одного триллиона", spelling.generate(101_000_000_000_000L, context));
        assertEquals("двухсот двух триллионов", spelling.generate(202_000_000_000_000L, context));
        assertEquals("трёхсот трёх триллионов", spelling.generate(303_000_000_000_000L, context));
        assertEquals("четырёхсот четырёх триллионов", spelling.generate(404_000_000_000_000L, context));
        assertEquals("пятисот пяти триллионов", spelling.generate(505_000_000_000_000L, context));
        assertEquals("шестисот шести триллионов", spelling.generate(606_000_000_000_000L, context));
        assertEquals("семисот семи триллионов", spelling.generate(707_000_000_000_000L, context));
        assertEquals("восьмисот восьми триллионов", spelling.generate(808_000_000_000_000L, context));
        assertEquals("девятисот девяти триллионов", spelling.generate(909_000_000_000_000L, context));
    }
}
