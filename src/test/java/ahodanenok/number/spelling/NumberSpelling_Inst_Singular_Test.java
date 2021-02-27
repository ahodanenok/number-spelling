package ahodanenok.number.spelling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberSpelling_Inst_Singular_Test {

    private NumberSpelling spelling = new NumberSpelling();
    private SpellingContext context = SpellingContext.builder().withCase(Case.INSTRUMENTAL).withCount(Count.SINGULAR).build();

    @Test
    public void check_00x() {
        Assertions.assertEquals("нолём", spelling.generate(0, context));
        Assertions.assertEquals("одним", spelling.generate(1, context));
        Assertions.assertEquals("двумя", spelling.generate(2, context));
        Assertions.assertEquals("тремя", spelling.generate(3, context));
        Assertions.assertEquals("четырьмя", spelling.generate(4, context));
        Assertions.assertEquals("пятью", spelling.generate(5, context));
        Assertions.assertEquals("шестью", spelling.generate(6, context));
        Assertions.assertEquals("семью", spelling.generate(7, context));
        Assertions.assertEquals("восьмью", spelling.generate(8, context));
        Assertions.assertEquals("девятью", spelling.generate(9, context));
    }

    @Test
    public void check_01x() {
        Assertions.assertEquals("десятью", spelling.generate(10, context));
        Assertions.assertEquals("одиннадцатью", spelling.generate(11, context));
        Assertions.assertEquals("двенадцатью", spelling.generate(12, context));
        Assertions.assertEquals("тринадцатью", spelling.generate(13, context));
        Assertions.assertEquals("четырнадцатью", spelling.generate(14, context));
        Assertions.assertEquals("пятнадцатью", spelling.generate(15, context));
        Assertions.assertEquals("шестнадцатью", spelling.generate(16, context));
        Assertions.assertEquals("семнадцатью", spelling.generate(17, context));
        Assertions.assertEquals("восемнадцатью", spelling.generate(18, context));
        Assertions.assertEquals("девятнадцатью", spelling.generate(19, context));
    }

    @Test
    public void check_02x() {
        Assertions.assertEquals("двадцатью", spelling.generate(20, context));
        Assertions.assertEquals("двадцатью одним", spelling.generate(21, context));
        Assertions.assertEquals("двадцатью двумя", spelling.generate(22, context));
        Assertions.assertEquals("двадцатью тремя", spelling.generate(23, context));
        Assertions.assertEquals("двадцатью четырьмя", spelling.generate(24, context));
        Assertions.assertEquals("двадцатью пятью", spelling.generate(25, context));
        Assertions.assertEquals("двадцатью шестью", spelling.generate(26, context));
        Assertions.assertEquals("двадцатью семью", spelling.generate(27, context));
        Assertions.assertEquals("двадцатью восьмью", spelling.generate(28, context));
        Assertions.assertEquals("двадцатью девятью", spelling.generate(29, context));
    }

    @Test
    public void check_03x() {
        Assertions.assertEquals("тридцатью", spelling.generate(30, context));
        Assertions.assertEquals("тридцатью одним", spelling.generate(31, context));
        Assertions.assertEquals("тридцатью двумя", spelling.generate(32, context));
        Assertions.assertEquals("тридцатью тремя", spelling.generate(33, context));
        Assertions.assertEquals("тридцатью четырьмя", spelling.generate(34, context));
        Assertions.assertEquals("тридцатью пятью", spelling.generate(35, context));
        Assertions.assertEquals("тридцатью шестью", spelling.generate(36, context));
        Assertions.assertEquals("тридцатью семью", spelling.generate(37, context));
        Assertions.assertEquals("тридцатью восьмью", spelling.generate(38, context));
        Assertions.assertEquals("тридцатью девятью", spelling.generate(39, context));
    }

    @Test
    public void check_04x() {
        Assertions.assertEquals("сорока", spelling.generate(40, context));
        Assertions.assertEquals("сорока одним", spelling.generate(41, context));
        Assertions.assertEquals("сорока двумя", spelling.generate(42, context));
        Assertions.assertEquals("сорока тремя", spelling.generate(43, context));
        Assertions.assertEquals("сорока четырьмя", spelling.generate(44, context));
        Assertions.assertEquals("сорока пятью", spelling.generate(45, context));
        Assertions.assertEquals("сорока шестью", spelling.generate(46, context));
        Assertions.assertEquals("сорока семью", spelling.generate(47, context));
        Assertions.assertEquals("сорока восьмью", spelling.generate(48, context));
        Assertions.assertEquals("сорока девятью", spelling.generate(49, context));
    }

    @Test
    public void check_05x() {
        Assertions.assertEquals("пятьюдесятью", spelling.generate(50, context));
        Assertions.assertEquals("пятьюдесятью одним", spelling.generate(51, context));
        Assertions.assertEquals("пятьюдесятью двумя", spelling.generate(52, context));
        Assertions.assertEquals("пятьюдесятью тремя", spelling.generate(53, context));
        Assertions.assertEquals("пятьюдесятью четырьмя", spelling.generate(54, context));
        Assertions.assertEquals("пятьюдесятью пятью", spelling.generate(55, context));
        Assertions.assertEquals("пятьюдесятью шестью", spelling.generate(56, context));
        Assertions.assertEquals("пятьюдесятью семью", spelling.generate(57, context));
        Assertions.assertEquals("пятьюдесятью восьмью", spelling.generate(58, context));
        Assertions.assertEquals("пятьюдесятью девятью", spelling.generate(59, context));
    }

    @Test
    public void check_06x() {
        Assertions.assertEquals("шестьюдесятью", spelling.generate(60, context));
        Assertions.assertEquals("шестьюдесятью одним", spelling.generate(61, context));
        Assertions.assertEquals("шестьюдесятью двумя", spelling.generate(62, context));
        Assertions.assertEquals("шестьюдесятью тремя", spelling.generate(63, context));
        Assertions.assertEquals("шестьюдесятью четырьмя", spelling.generate(64, context));
        Assertions.assertEquals("шестьюдесятью пятью", spelling.generate(65, context));
        Assertions.assertEquals("шестьюдесятью шестью", spelling.generate(66, context));
        Assertions.assertEquals("шестьюдесятью семью", spelling.generate(67, context));
        Assertions.assertEquals("шестьюдесятью восьмью", spelling.generate(68, context));
        Assertions.assertEquals("шестьюдесятью девятью", spelling.generate(69, context));
    }

    @Test
    public void check_07x() {
        Assertions.assertEquals("семьюдесятью", spelling.generate(70, context));
        Assertions.assertEquals("семьюдесятью одним", spelling.generate(71, context));
        Assertions.assertEquals("семьюдесятью двумя", spelling.generate(72, context));
        Assertions.assertEquals("семьюдесятью тремя", spelling.generate(73, context));
        Assertions.assertEquals("семьюдесятью четырьмя", spelling.generate(74, context));
        Assertions.assertEquals("семьюдесятью пятью", spelling.generate(75, context));
        Assertions.assertEquals("семьюдесятью шестью", spelling.generate(76, context));
        Assertions.assertEquals("семьюдесятью семью", spelling.generate(77, context));
        Assertions.assertEquals("семьюдесятью восьмью", spelling.generate(78, context));
        Assertions.assertEquals("семьюдесятью девятью", spelling.generate(79, context));
    }

    @Test
    public void check_08x() {
        Assertions.assertEquals("восьмьюдесятью", spelling.generate(80, context));
        Assertions.assertEquals("восьмьюдесятью одним", spelling.generate(81, context));
        Assertions.assertEquals("восьмьюдесятью двумя", spelling.generate(82, context));
        Assertions.assertEquals("восьмьюдесятью тремя", spelling.generate(83, context));
        Assertions.assertEquals("восьмьюдесятью четырьмя", spelling.generate(84, context));
        Assertions.assertEquals("восьмьюдесятью пятью", spelling.generate(85, context));
        Assertions.assertEquals("восьмьюдесятью шестью", spelling.generate(86, context));
        Assertions.assertEquals("восьмьюдесятью семью", spelling.generate(87, context));
        Assertions.assertEquals("восьмьюдесятью восьмью", spelling.generate(88, context));
        Assertions.assertEquals("восьмьюдесятью девятью", spelling.generate(89, context));
    }

    @Test
    public void check_09x() {
        Assertions.assertEquals("девяноста", spelling.generate(90, context));
        Assertions.assertEquals("девяноста одним", spelling.generate(91, context));
        Assertions.assertEquals("девяноста двумя", spelling.generate(92, context));
        Assertions.assertEquals("девяноста тремя", spelling.generate(93, context));
        Assertions.assertEquals("девяноста четырьмя", spelling.generate(94, context));
        Assertions.assertEquals("девяноста пятью", spelling.generate(95, context));
        Assertions.assertEquals("девяноста шестью", spelling.generate(96, context));
        Assertions.assertEquals("девяноста семью", spelling.generate(97, context));
        Assertions.assertEquals("девяноста восьмью", spelling.generate(98, context));
        Assertions.assertEquals("девяноста девятью", spelling.generate(99, context));
    }

    @Test
    public void check_10x() {
        Assertions.assertEquals("ста", spelling.generate(100, context));
        Assertions.assertEquals("ста одним", spelling.generate(101, context));
        Assertions.assertEquals("ста двумя", spelling.generate(102, context));
        Assertions.assertEquals("ста пятью", spelling.generate(105, context));
    }

    @Test
    public void check_11x() {
        Assertions.assertEquals("ста десятью", spelling.generate(110, context));
        Assertions.assertEquals("ста одиннадцатью", spelling.generate(111, context));
        Assertions.assertEquals("ста двенадцатью", spelling.generate(112, context));
        Assertions.assertEquals("ста пятнадцатью", spelling.generate(115, context));
    }

    @Test
    public void check_12x() {
        Assertions.assertEquals("ста двадцатью", spelling.generate(120, context));
        Assertions.assertEquals("ста двадцатью одним", spelling.generate(121, context));
        Assertions.assertEquals("ста двадцатью двумя", spelling.generate(122, context));
        Assertions.assertEquals("ста двадцатью пятью", spelling.generate(125, context));
    }

    @Test
    public void check_15x() {
        Assertions.assertEquals("ста пятьюдесятью", spelling.generate(150, context));
        Assertions.assertEquals("ста пятьюдесятью одним", spelling.generate(151, context));
        Assertions.assertEquals("ста пятьюдесятью двумя", spelling.generate(152, context));
        Assertions.assertEquals("ста пятьюдесятью пятью", spelling.generate(155, context));
    }

    @Test
    public void check_20x() {
        Assertions.assertEquals("двумястами", spelling.generate(200, context));
        Assertions.assertEquals("двумястами одним", spelling.generate(201, context));
        Assertions.assertEquals("двумястами двумя", spelling.generate(202, context));
        Assertions.assertEquals("двумястами пятью", spelling.generate(205, context));
    }

    @Test
    public void check_21x() {
        Assertions.assertEquals("двумястами десятью", spelling.generate(210, context));
        Assertions.assertEquals("двумястами одиннадцатью", spelling.generate(211, context));
        Assertions.assertEquals("двумястами двенадцатью", spelling.generate(212, context));
        Assertions.assertEquals("двумястами пятнадцатью", spelling.generate(215, context));
    }

    @Test
    public void check_22x() {
        Assertions.assertEquals("двумястами двадцатью", spelling.generate(220, context));
        Assertions.assertEquals("двумястами двадцатью одним", spelling.generate(221, context));
        Assertions.assertEquals("двумястами двадцатью двумя", spelling.generate(222, context));
        Assertions.assertEquals("двумястами двадцатью пятью", spelling.generate(225, context));
    }

    @Test
    public void check_25x() {
        Assertions.assertEquals("двумястами пятьюдесятью", spelling.generate(250, context));
        Assertions.assertEquals("двумястами пятьюдесятью одним", spelling.generate(251, context));
        Assertions.assertEquals("двумястами пятьюдесятью двумя", spelling.generate(252, context));
        Assertions.assertEquals("двумястами пятьюдесятью пятью", spelling.generate(255, context));
    }

    @Test
    public void check_30x() {
        Assertions.assertEquals("тремястами", spelling.generate(300, context));
        Assertions.assertEquals("тремястами одним", spelling.generate(301, context));
        Assertions.assertEquals("тремястами двумя", spelling.generate(302, context));
        Assertions.assertEquals("тремястами пятью", spelling.generate(305, context));
    }

    @Test
    public void check_31x() {
        Assertions.assertEquals("тремястами десятью", spelling.generate(310, context));
        Assertions.assertEquals("тремястами одиннадцатью", spelling.generate(311, context));
        Assertions.assertEquals("тремястами двенадцатью", spelling.generate(312, context));
        Assertions.assertEquals("тремястами пятнадцатью", spelling.generate(315, context));
    }

    @Test
    public void check_32x() {
        Assertions.assertEquals("тремястами двадцатью", spelling.generate(320, context));
        Assertions.assertEquals("тремястами двадцатью одним", spelling.generate(321, context));
        Assertions.assertEquals("тремястами двадцатью двумя", spelling.generate(322, context));
        Assertions.assertEquals("тремястами двадцатью пятью", spelling.generate(325, context));
    }

    @Test
    public void check_35x() {
        Assertions.assertEquals("тремястами пятьюдесятью", spelling.generate(350, context));
        Assertions.assertEquals("тремястами пятьюдесятью одним", spelling.generate(351, context));
        Assertions.assertEquals("тремястами пятьюдесятью двумя", spelling.generate(352, context));
        Assertions.assertEquals("тремястами пятьюдесятью пятью", spelling.generate(355, context));
    }

    @Test
    public void check_40x() {
        Assertions.assertEquals("четырьмястами", spelling.generate(400, context));
        Assertions.assertEquals("четырьмястами одним", spelling.generate(401, context));
        Assertions.assertEquals("четырьмястами двумя", spelling.generate(402, context));
        Assertions.assertEquals("четырьмястами пятью", spelling.generate(405, context));
    }

    @Test
    public void check_41x() {
        Assertions.assertEquals("четырьмястами десятью", spelling.generate(410, context));
        Assertions.assertEquals("четырьмястами одиннадцатью", spelling.generate(411, context));
        Assertions.assertEquals("четырьмястами двенадцатью", spelling.generate(412, context));
        Assertions.assertEquals("четырьмястами пятнадцатью", spelling.generate(415, context));
    }

    @Test
    public void check_42x() {
        Assertions.assertEquals("четырьмястами двадцатью", spelling.generate(420, context));
        Assertions.assertEquals("четырьмястами двадцатью одним", spelling.generate(421, context));
        Assertions.assertEquals("четырьмястами двадцатью двумя", spelling.generate(422, context));
        Assertions.assertEquals("четырьмястами двадцатью пятью", spelling.generate(425, context));
    }

    @Test
    public void check_45x() {
        Assertions.assertEquals("четырьмястами пятьюдесятью", spelling.generate(450, context));
        Assertions.assertEquals("четырьмястами пятьюдесятью одним", spelling.generate(451, context));
        Assertions.assertEquals("четырьмястами пятьюдесятью двумя", spelling.generate(452, context));
        Assertions.assertEquals("четырьмястами пятьюдесятью пятью", spelling.generate(455, context));
    }

    @Test
    public void check_50x() {
        Assertions.assertEquals("пятьюстами", spelling.generate(500, context));
        Assertions.assertEquals("пятьюстами одним", spelling.generate(501, context));
        Assertions.assertEquals("пятьюстами двумя", spelling.generate(502, context));
        Assertions.assertEquals("пятьюстами пятью", spelling.generate(505, context));
    }

    @Test
    public void check_51x() {
        Assertions.assertEquals("пятьюстами десятью", spelling.generate(510, context));
        Assertions.assertEquals("пятьюстами одиннадцатью", spelling.generate(511, context));
        Assertions.assertEquals("пятьюстами двенадцатью", spelling.generate(512, context));
        Assertions.assertEquals("пятьюстами пятнадцатью", spelling.generate(515, context));
    }

    @Test
    public void check_52x() {
        Assertions.assertEquals("пятьюстами двадцатью", spelling.generate(520, context));
        Assertions.assertEquals("пятьюстами двадцатью одним", spelling.generate(521, context));
        Assertions.assertEquals("пятьюстами двадцатью двумя", spelling.generate(522, context));
        Assertions.assertEquals("пятьюстами двадцатью пятью", spelling.generate(525, context));
    }

    @Test
    public void check_55x() {
        Assertions.assertEquals("пятьюстами пятьюдесятью", spelling.generate(550, context));
        Assertions.assertEquals("пятьюстами пятьюдесятью одним", spelling.generate(551, context));
        Assertions.assertEquals("пятьюстами пятьюдесятью двумя", spelling.generate(552, context));
        Assertions.assertEquals("пятьюстами пятьюдесятью пятью", spelling.generate(555, context));
    }

    @Test
    public void check_60x() {
        Assertions.assertEquals("шестьюстами", spelling.generate(600, context));
        Assertions.assertEquals("шестьюстами одним", spelling.generate(601, context));
        Assertions.assertEquals("шестьюстами двумя", spelling.generate(602, context));
        Assertions.assertEquals("шестьюстами пятью", spelling.generate(605, context));
    }

    @Test
    public void check_61x() {
        Assertions.assertEquals("шестьюстами десятью", spelling.generate(610, context));
        Assertions.assertEquals("шестьюстами одиннадцатью", spelling.generate(611, context));
        Assertions.assertEquals("шестьюстами двенадцатью", spelling.generate(612, context));
        Assertions.assertEquals("шестьюстами пятнадцатью", spelling.generate(615, context));
    }

    @Test
    public void check_62x() {
        Assertions.assertEquals("шестьюстами двадцатью", spelling.generate(620, context));
        Assertions.assertEquals("шестьюстами двадцатью одним", spelling.generate(621, context));
        Assertions.assertEquals("шестьюстами двадцатью двумя", spelling.generate(622, context));
        Assertions.assertEquals("шестьюстами двадцатью пятью", spelling.generate(625, context));
    }

    @Test
    public void check_65x() {
        Assertions.assertEquals("шестьюстами пятьюдесятью", spelling.generate(650, context));
        Assertions.assertEquals("шестьюстами пятьюдесятью одним", spelling.generate(651, context));
        Assertions.assertEquals("шестьюстами пятьюдесятью двумя", spelling.generate(652, context));
        Assertions.assertEquals("шестьюстами пятьюдесятью пятью", spelling.generate(655, context));
    }

    @Test
    public void check_70x() {
        Assertions.assertEquals("семьюстами", spelling.generate(700, context));
        Assertions.assertEquals("семьюстами одним", spelling.generate(701, context));
        Assertions.assertEquals("семьюстами двумя", spelling.generate(702, context));
        Assertions.assertEquals("семьюстами пятью", spelling.generate(705, context));
    }

    @Test
    public void check_71x() {
        Assertions.assertEquals("семьюстами десятью", spelling.generate(710, context));
        Assertions.assertEquals("семьюстами одиннадцатью", spelling.generate(711, context));
        Assertions.assertEquals("семьюстами двенадцатью", spelling.generate(712, context));
        Assertions.assertEquals("семьюстами пятнадцатью", spelling.generate(715, context));
    }

    @Test
    public void check_72x() {
        Assertions.assertEquals("семьюстами двадцатью", spelling.generate(720, context));
        Assertions.assertEquals("семьюстами двадцатью одним", spelling.generate(721, context));
        Assertions.assertEquals("семьюстами двадцатью двумя", spelling.generate(722, context));
        Assertions.assertEquals("семьюстами двадцатью пятью", spelling.generate(725, context));
    }

    @Test
    public void check_75x() {
        Assertions.assertEquals("семьюстами пятьюдесятью", spelling.generate(750, context));
        Assertions.assertEquals("семьюстами пятьюдесятью одним", spelling.generate(751, context));
        Assertions.assertEquals("семьюстами пятьюдесятью двумя", spelling.generate(752, context));
        Assertions.assertEquals("семьюстами пятьюдесятью пятью", spelling.generate(755, context));
    }

    @Test
    public void check_80x() {
        Assertions.assertEquals("восьмьюстами", spelling.generate(800, context));
        Assertions.assertEquals("восьмьюстами одним", spelling.generate(801, context));
        Assertions.assertEquals("восьмьюстами двумя", spelling.generate(802, context));
        Assertions.assertEquals("восьмьюстами пятью", spelling.generate(805, context));
    }

    @Test
    public void check_81x() {
        Assertions.assertEquals("восьмьюстами десятью", spelling.generate(810, context));
        Assertions.assertEquals("восьмьюстами одиннадцатью", spelling.generate(811, context));
        Assertions.assertEquals("восьмьюстами двенадцатью", spelling.generate(812, context));
        Assertions.assertEquals("восьмьюстами пятнадцатью", spelling.generate(815, context));
    }

    @Test
    public void check_82x() {
        Assertions.assertEquals("восьмьюстами двадцатью", spelling.generate(820, context));
        Assertions.assertEquals("восьмьюстами двадцатью одним", spelling.generate(821, context));
        Assertions.assertEquals("восьмьюстами двадцатью двумя", spelling.generate(822, context));
        Assertions.assertEquals("восьмьюстами двадцатью пятью", spelling.generate(825, context));
    }

    @Test
    public void check_85x() {
        Assertions.assertEquals("восьмьюстами пятьюдесятью", spelling.generate(850, context));
        Assertions.assertEquals("восьмьюстами пятьюдесятью одним", spelling.generate(851, context));
        Assertions.assertEquals("восьмьюстами пятьюдесятью двумя", spelling.generate(852, context));
        Assertions.assertEquals("восьмьюстами пятьюдесятью пятью", spelling.generate(855, context));
    }

    @Test
    public void check_90x() {
        Assertions.assertEquals("девятьюстами", spelling.generate(900, context));
        Assertions.assertEquals("девятьюстами одним", spelling.generate(901, context));
        Assertions.assertEquals("девятьюстами двумя", spelling.generate(902, context));
        Assertions.assertEquals("девятьюстами пятью", spelling.generate(905, context));
    }

    @Test
    public void check_91x() {
        Assertions.assertEquals("девятьюстами десятью", spelling.generate(910, context));
        Assertions.assertEquals("девятьюстами одиннадцатью", spelling.generate(911, context));
        Assertions.assertEquals("девятьюстами двенадцатью", spelling.generate(912, context));
        Assertions.assertEquals("девятьюстами пятнадцатью", spelling.generate(915, context));
    }

    @Test
    public void check_92x() {
        Assertions.assertEquals("девятьюстами двадцатью", spelling.generate(920, context));
        Assertions.assertEquals("девятьюстами двадцатью одним", spelling.generate(921, context));
        Assertions.assertEquals("девятьюстами двадцатью двумя", spelling.generate(922, context));
        Assertions.assertEquals("девятьюстами двадцатью пятью", spelling.generate(925, context));
    }

    @Test
    public void check_95x() {
        Assertions.assertEquals("девятьюстами пятьюдесятью", spelling.generate(950, context));
        Assertions.assertEquals("девятьюстами пятьюдесятью одним", spelling.generate(951, context));
        Assertions.assertEquals("девятьюстами пятьюдесятью двумя", spelling.generate(952, context));
        Assertions.assertEquals("девятьюстами пятьюдесятью пятью", spelling.generate(955, context));
    }
}
