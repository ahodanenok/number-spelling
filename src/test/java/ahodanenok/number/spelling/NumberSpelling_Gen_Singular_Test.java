package ahodanenok.number.spelling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberSpelling_Gen_Singular_Test {

    private NumberSpelling spelling = new NumberSpelling();
    private SpellingContext context = SpellingContext.builder().withCase(Case.GENITIVE).withCount(Count.SINGULAR).build();

    @Test
    public void check_00x() {
        Assertions.assertEquals("ноля", spelling.generate(0, context));
        Assertions.assertEquals("одного", spelling.generate(1, context));
        Assertions.assertEquals("двух", spelling.generate(2, context));
        Assertions.assertEquals("трёх", spelling.generate(3, context));
        Assertions.assertEquals("четырёх", spelling.generate(4, context));
        Assertions.assertEquals("пяти", spelling.generate(5, context));
        Assertions.assertEquals("шести", spelling.generate(6, context));
        Assertions.assertEquals("семи", spelling.generate(7, context));
        Assertions.assertEquals("восьми", spelling.generate(8, context));
        Assertions.assertEquals("девяти", spelling.generate(9, context));
    }

    @Test
    public void check_01x() {
        Assertions.assertEquals("десяти", spelling.generate(10, context));
        Assertions.assertEquals("одиннадцати", spelling.generate(11, context));
        Assertions.assertEquals("двенадцати", spelling.generate(12, context));
        Assertions.assertEquals("тринадцати", spelling.generate(13, context));
        Assertions.assertEquals("четырнадцати", spelling.generate(14, context));
        Assertions.assertEquals("пятнадцати", spelling.generate(15, context));
        Assertions.assertEquals("шестнадцати", spelling.generate(16, context));
        Assertions.assertEquals("семнадцати", spelling.generate(17, context));
        Assertions.assertEquals("восемнадцати", spelling.generate(18, context));
        Assertions.assertEquals("девятнадцати", spelling.generate(19, context));
    }

    @Test
    public void check_02x() {
        Assertions.assertEquals("двадцати", spelling.generate(20, context));
        Assertions.assertEquals("двадцати одного", spelling.generate(21, context));
        Assertions.assertEquals("двадцати двух", spelling.generate(22, context));
        Assertions.assertEquals("двадцати трёх", spelling.generate(23, context));
        Assertions.assertEquals("двадцати четырёх", spelling.generate(24, context));
        Assertions.assertEquals("двадцати пяти", spelling.generate(25, context));
        Assertions.assertEquals("двадцати шести", spelling.generate(26, context));
        Assertions.assertEquals("двадцати семи", spelling.generate(27, context));
        Assertions.assertEquals("двадцати восьми", spelling.generate(28, context));
        Assertions.assertEquals("двадцати девяти", spelling.generate(29, context));
    }

    @Test
    public void check_03x() {
        Assertions.assertEquals("тридцати", spelling.generate(30, context));
        Assertions.assertEquals("тридцати одного", spelling.generate(31, context));
        Assertions.assertEquals("тридцати двух", spelling.generate(32, context));
        Assertions.assertEquals("тридцати трёх", spelling.generate(33, context));
        Assertions.assertEquals("тридцати четырёх", spelling.generate(34, context));
        Assertions.assertEquals("тридцати пяти", spelling.generate(35, context));
        Assertions.assertEquals("тридцати шести", spelling.generate(36, context));
        Assertions.assertEquals("тридцати семи", spelling.generate(37, context));
        Assertions.assertEquals("тридцати восьми", spelling.generate(38, context));
        Assertions.assertEquals("тридцати девяти", spelling.generate(39, context));
    }

    @Test
    public void check_04x() {
        Assertions.assertEquals("сорока", spelling.generate(40, context));
        Assertions.assertEquals("сорока одного", spelling.generate(41, context));
        Assertions.assertEquals("сорока двух", spelling.generate(42, context));
        Assertions.assertEquals("сорока трёх", spelling.generate(43, context));
        Assertions.assertEquals("сорока четырёх", spelling.generate(44, context));
        Assertions.assertEquals("сорока пяти", spelling.generate(45, context));
        Assertions.assertEquals("сорока шести", spelling.generate(46, context));
        Assertions.assertEquals("сорока семи", spelling.generate(47, context));
        Assertions.assertEquals("сорока восьми", spelling.generate(48, context));
        Assertions.assertEquals("сорока девяти", spelling.generate(49, context));
    }

    @Test
    public void check_05x() {
        Assertions.assertEquals("пятидесяти", spelling.generate(50, context));
        Assertions.assertEquals("пятидесяти одного", spelling.generate(51, context));
        Assertions.assertEquals("пятидесяти двух", spelling.generate(52, context));
        Assertions.assertEquals("пятидесяти трёх", spelling.generate(53, context));
        Assertions.assertEquals("пятидесяти четырёх", spelling.generate(54, context));
        Assertions.assertEquals("пятидесяти пяти", spelling.generate(55, context));
        Assertions.assertEquals("пятидесяти шести", spelling.generate(56, context));
        Assertions.assertEquals("пятидесяти семи", spelling.generate(57, context));
        Assertions.assertEquals("пятидесяти восьми", spelling.generate(58, context));
        Assertions.assertEquals("пятидесяти девяти", spelling.generate(59, context));
    }

    @Test
    public void check_06x() {
        Assertions.assertEquals("шестидесяти", spelling.generate(60, context));
        Assertions.assertEquals("шестидесяти одного", spelling.generate(61, context));
        Assertions.assertEquals("шестидесяти двух", spelling.generate(62, context));
        Assertions.assertEquals("шестидесяти трёх", spelling.generate(63, context));
        Assertions.assertEquals("шестидесяти четырёх", spelling.generate(64, context));
        Assertions.assertEquals("шестидесяти пяти", spelling.generate(65, context));
        Assertions.assertEquals("шестидесяти шести", spelling.generate(66, context));
        Assertions.assertEquals("шестидесяти семи", spelling.generate(67, context));
        Assertions.assertEquals("шестидесяти восьми", spelling.generate(68, context));
        Assertions.assertEquals("шестидесяти девяти", spelling.generate(69, context));
    }

    @Test
    public void check_07x() {
        Assertions.assertEquals("семидесяти", spelling.generate(70, context));
        Assertions.assertEquals("семидесяти одного", spelling.generate(71, context));
        Assertions.assertEquals("семидесяти двух", spelling.generate(72, context));
        Assertions.assertEquals("семидесяти трёх", spelling.generate(73, context));
        Assertions.assertEquals("семидесяти четырёх", spelling.generate(74, context));
        Assertions.assertEquals("семидесяти пяти", spelling.generate(75, context));
        Assertions.assertEquals("семидесяти шести", spelling.generate(76, context));
        Assertions.assertEquals("семидесяти семи", spelling.generate(77, context));
        Assertions.assertEquals("семидесяти восьми", spelling.generate(78, context));
        Assertions.assertEquals("семидесяти девяти", spelling.generate(79, context));
    }

    @Test
    public void check_08x() {
        Assertions.assertEquals("восьмидесяти", spelling.generate(80, context));
        Assertions.assertEquals("восьмидесяти одного", spelling.generate(81, context));
        Assertions.assertEquals("восьмидесяти двух", spelling.generate(82, context));
        Assertions.assertEquals("восьмидесяти трёх", spelling.generate(83, context));
        Assertions.assertEquals("восьмидесяти четырёх", spelling.generate(84, context));
        Assertions.assertEquals("восьмидесяти пяти", spelling.generate(85, context));
        Assertions.assertEquals("восьмидесяти шести", spelling.generate(86, context));
        Assertions.assertEquals("восьмидесяти семи", spelling.generate(87, context));
        Assertions.assertEquals("восьмидесяти восьми", spelling.generate(88, context));
        Assertions.assertEquals("восьмидесяти девяти", spelling.generate(89, context));
    }

    @Test
    public void check_09x() {
        Assertions.assertEquals("девяноста", spelling.generate(90, context));
        Assertions.assertEquals("девяноста одного", spelling.generate(91, context));
        Assertions.assertEquals("девяноста двух", spelling.generate(92, context));
        Assertions.assertEquals("девяноста трёх", spelling.generate(93, context));
        Assertions.assertEquals("девяноста четырёх", spelling.generate(94, context));
        Assertions.assertEquals("девяноста пяти", spelling.generate(95, context));
        Assertions.assertEquals("девяноста шести", spelling.generate(96, context));
        Assertions.assertEquals("девяноста семи", spelling.generate(97, context));
        Assertions.assertEquals("девяноста восьми", spelling.generate(98, context));
        Assertions.assertEquals("девяноста девяти", spelling.generate(99, context));
    }

    @Test
    public void check_10x() {
        Assertions.assertEquals("ста", spelling.generate(100, context));
        Assertions.assertEquals("ста одного", spelling.generate(101, context));
        Assertions.assertEquals("ста двух", spelling.generate(102, context));
        Assertions.assertEquals("ста пяти", spelling.generate(105, context));
    }

    @Test
    public void check_11x() {
        Assertions.assertEquals("ста десяти", spelling.generate(110, context));
        Assertions.assertEquals("ста одиннадцати", spelling.generate(111, context));
        Assertions.assertEquals("ста двенадцати", spelling.generate(112, context));
        Assertions.assertEquals("ста пятнадцати", spelling.generate(115, context));
    }

    @Test
    public void check_12x() {
        Assertions.assertEquals("ста двадцати", spelling.generate(120, context));
        Assertions.assertEquals("ста двадцати одного", spelling.generate(121, context));
        Assertions.assertEquals("ста двадцати двух", spelling.generate(122, context));
        Assertions.assertEquals("ста двадцати пяти", spelling.generate(125, context));
    }

    @Test
    public void check_15x() {
        Assertions.assertEquals("ста пятидесяти", spelling.generate(150, context));
        Assertions.assertEquals("ста пятидесяти одного", spelling.generate(151, context));
        Assertions.assertEquals("ста пятидесяти двух", spelling.generate(152, context));
        Assertions.assertEquals("ста пятидесяти пяти", spelling.generate(155, context));
    }

    @Test
    public void check_20x() {
        Assertions.assertEquals("двухсот", spelling.generate(200, context));
        Assertions.assertEquals("двухсот одного", spelling.generate(201, context));
        Assertions.assertEquals("двухсот двух", spelling.generate(202, context));
        Assertions.assertEquals("двухсот пяти", spelling.generate(205, context));
    }

    @Test
    public void check_21x() {
        Assertions.assertEquals("двухсот десяти", spelling.generate(210, context));
        Assertions.assertEquals("двухсот одиннадцати", spelling.generate(211, context));
        Assertions.assertEquals("двухсот двенадцати", spelling.generate(212, context));
        Assertions.assertEquals("двухсот пятнадцати", spelling.generate(215, context));
    }

    @Test
    public void check_22x() {
        Assertions.assertEquals("двухсот двадцати", spelling.generate(220, context));
        Assertions.assertEquals("двухсот двадцати одного", spelling.generate(221, context));
        Assertions.assertEquals("двухсот двадцати двух", spelling.generate(222, context));
        Assertions.assertEquals("двухсот двадцати пяти", spelling.generate(225, context));
    }

    @Test
    public void check_25x() {
        Assertions.assertEquals("двухсот пятидесяти", spelling.generate(250, context));
        Assertions.assertEquals("двухсот пятидесяти одного", spelling.generate(251, context));
        Assertions.assertEquals("двухсот пятидесяти двух", spelling.generate(252, context));
        Assertions.assertEquals("двухсот пятидесяти пяти", spelling.generate(255, context));
    }

    @Test
    public void check_30x() {
        Assertions.assertEquals("трёхсот", spelling.generate(300, context));
        Assertions.assertEquals("трёхсот одного", spelling.generate(301, context));
        Assertions.assertEquals("трёхсот двух", spelling.generate(302, context));
        Assertions.assertEquals("трёхсот пяти", spelling.generate(305, context));
    }

    @Test
    public void check_31x() {
        Assertions.assertEquals("трёхсот десяти", spelling.generate(310, context));
        Assertions.assertEquals("трёхсот одиннадцати", spelling.generate(311, context));
        Assertions.assertEquals("трёхсот двенадцати", spelling.generate(312, context));
        Assertions.assertEquals("трёхсот пятнадцати", spelling.generate(315, context));
    }

    @Test
    public void check_32x() {
        Assertions.assertEquals("трёхсот двадцати", spelling.generate(320, context));
        Assertions.assertEquals("трёхсот двадцати одного", spelling.generate(321, context));
        Assertions.assertEquals("трёхсот двадцати двух", spelling.generate(322, context));
        Assertions.assertEquals("трёхсот двадцати пяти", spelling.generate(325, context));
    }

    @Test
    public void check_35x() {
        Assertions.assertEquals("трёхсот пятидесяти", spelling.generate(350, context));
        Assertions.assertEquals("трёхсот пятидесяти одного", spelling.generate(351, context));
        Assertions.assertEquals("трёхсот пятидесяти двух", spelling.generate(352, context));
        Assertions.assertEquals("трёхсот пятидесяти пяти", spelling.generate(355, context));
    }

    @Test
    public void check_40x() {
        Assertions.assertEquals("четырёхсот", spelling.generate(400, context));
        Assertions.assertEquals("четырёхсот одного", spelling.generate(401, context));
        Assertions.assertEquals("четырёхсот двух", spelling.generate(402, context));
        Assertions.assertEquals("четырёхсот пяти", spelling.generate(405, context));
    }

    @Test
    public void check_41x() {
        Assertions.assertEquals("четырёхсот десяти", spelling.generate(410, context));
        Assertions.assertEquals("четырёхсот одиннадцати", spelling.generate(411, context));
        Assertions.assertEquals("четырёхсот двенадцати", spelling.generate(412, context));
        Assertions.assertEquals("четырёхсот пятнадцати", spelling.generate(415, context));
    }

    @Test
    public void check_42x() {
        Assertions.assertEquals("четырёхсот двадцати", spelling.generate(420, context));
        Assertions.assertEquals("четырёхсот двадцати одного", spelling.generate(421, context));
        Assertions.assertEquals("четырёхсот двадцати двух", spelling.generate(422, context));
        Assertions.assertEquals("четырёхсот двадцати пяти", spelling.generate(425, context));
    }

    @Test
    public void check_45x() {
        Assertions.assertEquals("четырёхсот пятидесяти", spelling.generate(450, context));
        Assertions.assertEquals("четырёхсот пятидесяти одного", spelling.generate(451, context));
        Assertions.assertEquals("четырёхсот пятидесяти двух", spelling.generate(452, context));
        Assertions.assertEquals("четырёхсот пятидесяти пяти", spelling.generate(455, context));
    }

    @Test
    public void check_50x() {
        Assertions.assertEquals("пятисот", spelling.generate(500, context));
        Assertions.assertEquals("пятисот одного", spelling.generate(501, context));
        Assertions.assertEquals("пятисот двух", spelling.generate(502, context));
        Assertions.assertEquals("пятисот пяти", spelling.generate(505, context));
    }

    @Test
    public void check_51x() {
        Assertions.assertEquals("пятисот десяти", spelling.generate(510, context));
        Assertions.assertEquals("пятисот одиннадцати", spelling.generate(511, context));
        Assertions.assertEquals("пятисот двенадцати", spelling.generate(512, context));
        Assertions.assertEquals("пятисот пятнадцати", spelling.generate(515, context));
    }

    @Test
    public void check_52x() {
        Assertions.assertEquals("пятисот двадцати", spelling.generate(520, context));
        Assertions.assertEquals("пятисот двадцати одного", spelling.generate(521, context));
        Assertions.assertEquals("пятисот двадцати двух", spelling.generate(522, context));
        Assertions.assertEquals("пятисот двадцати пяти", spelling.generate(525, context));
    }

    @Test
    public void check_55x() {
        Assertions.assertEquals("пятисот пятидесяти", spelling.generate(550, context));
        Assertions.assertEquals("пятисот пятидесяти одного", spelling.generate(551, context));
        Assertions.assertEquals("пятисот пятидесяти двух", spelling.generate(552, context));
        Assertions.assertEquals("пятисот пятидесяти пяти", spelling.generate(555, context));
    }

    @Test
    public void check_60x() {
        Assertions.assertEquals("шестисот", spelling.generate(600, context));
        Assertions.assertEquals("шестисот одного", spelling.generate(601, context));
        Assertions.assertEquals("шестисот двух", spelling.generate(602, context));
        Assertions.assertEquals("шестисот пяти", spelling.generate(605, context));
    }

    @Test
    public void check_61x() {
        Assertions.assertEquals("шестисот десяти", spelling.generate(610, context));
        Assertions.assertEquals("шестисот одиннадцати", spelling.generate(611, context));
        Assertions.assertEquals("шестисот двенадцати", spelling.generate(612, context));
        Assertions.assertEquals("шестисот пятнадцати", spelling.generate(615, context));
    }

    @Test
    public void check_62x() {
        Assertions.assertEquals("шестисот двадцати", spelling.generate(620, context));
        Assertions.assertEquals("шестисот двадцати одного", spelling.generate(621, context));
        Assertions.assertEquals("шестисот двадцати двух", spelling.generate(622, context));
        Assertions.assertEquals("шестисот двадцати пяти", spelling.generate(625, context));
    }

    @Test
    public void check_65x() {
        Assertions.assertEquals("шестисот пятидесяти", spelling.generate(650, context));
        Assertions.assertEquals("шестисот пятидесяти одного", spelling.generate(651, context));
        Assertions.assertEquals("шестисот пятидесяти двух", spelling.generate(652, context));
        Assertions.assertEquals("шестисот пятидесяти пяти", spelling.generate(655, context));
    }

    @Test
    public void check_70x() {
        Assertions.assertEquals("семисот", spelling.generate(700, context));
        Assertions.assertEquals("семисот одного", spelling.generate(701, context));
        Assertions.assertEquals("семисот двух", spelling.generate(702, context));
        Assertions.assertEquals("семисот пяти", spelling.generate(705, context));
    }

    @Test
    public void check_71x() {
        Assertions.assertEquals("семисот десяти", spelling.generate(710, context));
        Assertions.assertEquals("семисот одиннадцати", spelling.generate(711, context));
        Assertions.assertEquals("семисот двенадцати", spelling.generate(712, context));
        Assertions.assertEquals("семисот пятнадцати", spelling.generate(715, context));
    }

    @Test
    public void check_72x() {
        Assertions.assertEquals("семисот двадцати", spelling.generate(720, context));
        Assertions.assertEquals("семисот двадцати одного", spelling.generate(721, context));
        Assertions.assertEquals("семисот двадцати двух", spelling.generate(722, context));
        Assertions.assertEquals("семисот двадцати пяти", spelling.generate(725, context));
    }

    @Test
    public void check_75x() {
        Assertions.assertEquals("семисот пятидесяти", spelling.generate(750, context));
        Assertions.assertEquals("семисот пятидесяти одного", spelling.generate(751, context));
        Assertions.assertEquals("семисот пятидесяти двух", spelling.generate(752, context));
        Assertions.assertEquals("семисот пятидесяти пяти", spelling.generate(755, context));
    }

    @Test
    public void check_80x() {
        Assertions.assertEquals("восьмисот", spelling.generate(800, context));
        Assertions.assertEquals("восьмисот одного", spelling.generate(801, context));
        Assertions.assertEquals("восьмисот двух", spelling.generate(802, context));
        Assertions.assertEquals("восьмисот пяти", spelling.generate(805, context));
    }

    @Test
    public void check_81x() {
        Assertions.assertEquals("восьмисот десяти", spelling.generate(810, context));
        Assertions.assertEquals("восьмисот одиннадцати", spelling.generate(811, context));
        Assertions.assertEquals("восьмисот двенадцати", spelling.generate(812, context));
        Assertions.assertEquals("восьмисот пятнадцати", spelling.generate(815, context));
    }

    @Test
    public void check_82x() {
        Assertions.assertEquals("восьмисот двадцати", spelling.generate(820, context));
        Assertions.assertEquals("восьмисот двадцати одного", spelling.generate(821, context));
        Assertions.assertEquals("восьмисот двадцати двух", spelling.generate(822, context));
        Assertions.assertEquals("восьмисот двадцати пяти", spelling.generate(825, context));
    }

    @Test
    public void check_85x() {
        Assertions.assertEquals("восьмисот пятидесяти", spelling.generate(850, context));
        Assertions.assertEquals("восьмисот пятидесяти одного", spelling.generate(851, context));
        Assertions.assertEquals("восьмисот пятидесяти двух", spelling.generate(852, context));
        Assertions.assertEquals("восьмисот пятидесяти пяти", spelling.generate(855, context));
    }

    @Test
    public void check_90x() {
        Assertions.assertEquals("девятисот", spelling.generate(900, context));
        Assertions.assertEquals("девятисот одного", spelling.generate(901, context));
        Assertions.assertEquals("девятисот двух", spelling.generate(902, context));
        Assertions.assertEquals("девятисот пяти", spelling.generate(905, context));
    }

    @Test
    public void check_91x() {
        Assertions.assertEquals("девятисот десяти", spelling.generate(910, context));
        Assertions.assertEquals("девятисот одиннадцати", spelling.generate(911, context));
        Assertions.assertEquals("девятисот двенадцати", spelling.generate(912, context));
        Assertions.assertEquals("девятисот пятнадцати", spelling.generate(915, context));
    }

    @Test
    public void check_92x() {
        Assertions.assertEquals("девятисот двадцати", spelling.generate(920, context));
        Assertions.assertEquals("девятисот двадцати одного", spelling.generate(921, context));
        Assertions.assertEquals("девятисот двадцати двух", spelling.generate(922, context));
        Assertions.assertEquals("девятисот двадцати пяти", spelling.generate(925, context));
    }

    @Test
    public void check_95x() {
        Assertions.assertEquals("девятисот пятидесяти", spelling.generate(950, context));
        Assertions.assertEquals("девятисот пятидесяти одного", spelling.generate(951, context));
        Assertions.assertEquals("девятисот пятидесяти двух", spelling.generate(952, context));
        Assertions.assertEquals("девятисот пятидесяти пяти", spelling.generate(955, context));
    }
}
