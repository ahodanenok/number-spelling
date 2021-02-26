package ahodanenok.number.spelling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberSpelling_Nom_Plural_Test {

    private NumberSpelling spelling = new NumberSpelling();
    private SpellingContext context = SpellingContext.builder().withCase(Case.NOMINATIVE).withCount(Count.PLURAL).build();

    @Test
    public void check_00x() {
        Assertions.assertEquals("ноли", spelling.generate(0, context));
        Assertions.assertEquals("одни", spelling.generate(1, context));
        Assertions.assertEquals("два", spelling.generate(2, context));
        Assertions.assertEquals("три", spelling.generate(3, context));
        Assertions.assertEquals("четыре", spelling.generate(4, context));
        Assertions.assertEquals("пять", spelling.generate(5, context));
        Assertions.assertEquals("шесть", spelling.generate(6, context));
        Assertions.assertEquals("семь", spelling.generate(7, context));
        Assertions.assertEquals("восемь", spelling.generate(8, context));
        Assertions.assertEquals("девять", spelling.generate(9, context));
    }

    @Test
    public void check_01x() {
        Assertions.assertEquals("десять", spelling.generate(10, context));
        Assertions.assertEquals("одиннадцать", spelling.generate(11, context));
        Assertions.assertEquals("двенадцать", spelling.generate(12, context));
        Assertions.assertEquals("тринадцать", spelling.generate(13, context));
        Assertions.assertEquals("четырнадцать", spelling.generate(14, context));
        Assertions.assertEquals("пятнадцать", spelling.generate(15, context));
        Assertions.assertEquals("шестнадцать", spelling.generate(16, context));
        Assertions.assertEquals("семнадцать", spelling.generate(17, context));
        Assertions.assertEquals("восемнадцать", spelling.generate(18, context));
        Assertions.assertEquals("девятнадцать", spelling.generate(19, context));
    }

    @Test
    public void check_02x() {
        Assertions.assertEquals("двадцать", spelling.generate(20, context));
        Assertions.assertEquals("двадцать одни", spelling.generate(21, context));
        Assertions.assertEquals("двадцать два", spelling.generate(22, context));
        Assertions.assertEquals("двадцать три", spelling.generate(23, context));
        Assertions.assertEquals("двадцать четыре", spelling.generate(24, context));
        Assertions.assertEquals("двадцать пять", spelling.generate(25, context));
        Assertions.assertEquals("двадцать шесть", spelling.generate(26, context));
        Assertions.assertEquals("двадцать семь", spelling.generate(27, context));
        Assertions.assertEquals("двадцать восемь", spelling.generate(28, context));
        Assertions.assertEquals("двадцать девять", spelling.generate(29, context));
    }

    @Test
    public void check_03x() {
        Assertions.assertEquals("тридцать", spelling.generate(30, context));
        Assertions.assertEquals("тридцать одни", spelling.generate(31, context));
        Assertions.assertEquals("тридцать два", spelling.generate(32, context));
        Assertions.assertEquals("тридцать три", spelling.generate(33, context));
        Assertions.assertEquals("тридцать четыре", spelling.generate(34, context));
        Assertions.assertEquals("тридцать пять", spelling.generate(35, context));
        Assertions.assertEquals("тридцать шесть", spelling.generate(36, context));
        Assertions.assertEquals("тридцать семь", spelling.generate(37, context));
        Assertions.assertEquals("тридцать восемь", spelling.generate(38, context));
        Assertions.assertEquals("тридцать девять", spelling.generate(39, context));
    }

    @Test
    public void check_04x() {
        Assertions.assertEquals("сорок", spelling.generate(40, context));
        Assertions.assertEquals("сорок одни", spelling.generate(41, context));
        Assertions.assertEquals("сорок два", spelling.generate(42, context));
        Assertions.assertEquals("сорок три", spelling.generate(43, context));
        Assertions.assertEquals("сорок четыре", spelling.generate(44, context));
        Assertions.assertEquals("сорок пять", spelling.generate(45, context));
        Assertions.assertEquals("сорок шесть", spelling.generate(46, context));
        Assertions.assertEquals("сорок семь", spelling.generate(47, context));
        Assertions.assertEquals("сорок восемь", spelling.generate(48, context));
        Assertions.assertEquals("сорок девять", spelling.generate(49, context));
    }

    @Test
    public void check_05x() {
        Assertions.assertEquals("пятьдесят", spelling.generate(50, context));
        Assertions.assertEquals("пятьдесят одни", spelling.generate(51, context));
        Assertions.assertEquals("пятьдесят два", spelling.generate(52, context));
        Assertions.assertEquals("пятьдесят три", spelling.generate(53, context));
        Assertions.assertEquals("пятьдесят четыре", spelling.generate(54, context));
        Assertions.assertEquals("пятьдесят пять", spelling.generate(55, context));
        Assertions.assertEquals("пятьдесят шесть", spelling.generate(56, context));
        Assertions.assertEquals("пятьдесят семь", spelling.generate(57, context));
        Assertions.assertEquals("пятьдесят восемь", spelling.generate(58, context));
        Assertions.assertEquals("пятьдесят девять", spelling.generate(59, context));
    }

    @Test
    public void check_06x() {
        Assertions.assertEquals("шестьдесят", spelling.generate(60, context));
        Assertions.assertEquals("шестьдесят одни", spelling.generate(61, context));
        Assertions.assertEquals("шестьдесят два", spelling.generate(62, context));
        Assertions.assertEquals("шестьдесят три", spelling.generate(63, context));
        Assertions.assertEquals("шестьдесят четыре", spelling.generate(64, context));
        Assertions.assertEquals("шестьдесят пять", spelling.generate(65, context));
        Assertions.assertEquals("шестьдесят шесть", spelling.generate(66, context));
        Assertions.assertEquals("шестьдесят семь", spelling.generate(67, context));
        Assertions.assertEquals("шестьдесят восемь", spelling.generate(68, context));
        Assertions.assertEquals("шестьдесят девять", spelling.generate(69, context));
    }

    @Test
    public void check_07x() {
        Assertions.assertEquals("семьдесят", spelling.generate(70, context));
        Assertions.assertEquals("семьдесят одни", spelling.generate(71, context));
        Assertions.assertEquals("семьдесят два", spelling.generate(72, context));
        Assertions.assertEquals("семьдесят три", spelling.generate(73, context));
        Assertions.assertEquals("семьдесят четыре", spelling.generate(74, context));
        Assertions.assertEquals("семьдесят пять", spelling.generate(75, context));
        Assertions.assertEquals("семьдесят шесть", spelling.generate(76, context));
        Assertions.assertEquals("семьдесят семь", spelling.generate(77, context));
        Assertions.assertEquals("семьдесят восемь", spelling.generate(78, context));
        Assertions.assertEquals("семьдесят девять", spelling.generate(79, context));
    }

    @Test
    public void check_08x() {
        Assertions.assertEquals("восемьдесят", spelling.generate(80, context));
        Assertions.assertEquals("восемьдесят одни", spelling.generate(81, context));
        Assertions.assertEquals("восемьдесят два", spelling.generate(82, context));
        Assertions.assertEquals("восемьдесят три", spelling.generate(83, context));
        Assertions.assertEquals("восемьдесят четыре", spelling.generate(84, context));
        Assertions.assertEquals("восемьдесят пять", spelling.generate(85, context));
        Assertions.assertEquals("восемьдесят шесть", spelling.generate(86, context));
        Assertions.assertEquals("восемьдесят семь", spelling.generate(87, context));
        Assertions.assertEquals("восемьдесят восемь", spelling.generate(88, context));
        Assertions.assertEquals("восемьдесят девять", spelling.generate(89, context));
    }

    @Test
    public void check_09x() {
        Assertions.assertEquals("девяносто", spelling.generate(90, context));
        Assertions.assertEquals("девяносто одни", spelling.generate(91, context));
        Assertions.assertEquals("девяносто два", spelling.generate(92, context));
        Assertions.assertEquals("девяносто три", spelling.generate(93, context));
        Assertions.assertEquals("девяносто четыре", spelling.generate(94, context));
        Assertions.assertEquals("девяносто пять", spelling.generate(95, context));
        Assertions.assertEquals("девяносто шесть", spelling.generate(96, context));
        Assertions.assertEquals("девяносто семь", spelling.generate(97, context));
        Assertions.assertEquals("девяносто восемь", spelling.generate(98, context));
        Assertions.assertEquals("девяносто девять", spelling.generate(99, context));
    }

    @Test
    public void check_10x() {
        Assertions.assertEquals("сто", spelling.generate(100, context));
        Assertions.assertEquals("сто одни", spelling.generate(101, context));
        Assertions.assertEquals("сто два", spelling.generate(102, context));
        Assertions.assertEquals("сто пять", spelling.generate(105, context));
    }

    @Test
    public void check_11x() {
        Assertions.assertEquals("сто десять", spelling.generate(110, context));
        Assertions.assertEquals("сто одиннадцать", spelling.generate(111, context));
        Assertions.assertEquals("сто двенадцать", spelling.generate(112, context));
        Assertions.assertEquals("сто пятнадцать", spelling.generate(115, context));
    }

    @Test
    public void check_12x() {
        Assertions.assertEquals("сто двадцать", spelling.generate(120, context));
        Assertions.assertEquals("сто двадцать одни", spelling.generate(121, context));
        Assertions.assertEquals("сто двадцать два", spelling.generate(122, context));
        Assertions.assertEquals("сто двадцать пять", spelling.generate(125, context));
    }

    @Test
    public void check_15x() {
        Assertions.assertEquals("сто пятьдесят", spelling.generate(150, context));
        Assertions.assertEquals("сто пятьдесят одни", spelling.generate(151, context));
        Assertions.assertEquals("сто пятьдесят два", spelling.generate(152, context));
        Assertions.assertEquals("сто пятьдесят пять", spelling.generate(155, context));
    }

    @Test
    public void check_20x() {
        Assertions.assertEquals("двести", spelling.generate(200, context));
        Assertions.assertEquals("двести одни", spelling.generate(201, context));
        Assertions.assertEquals("двести два", spelling.generate(202, context));
        Assertions.assertEquals("двести пять", spelling.generate(205, context));
    }

    @Test
    public void check_21x() {
        Assertions.assertEquals("двести десять", spelling.generate(210, context));
        Assertions.assertEquals("двести одиннадцать", spelling.generate(211, context));
        Assertions.assertEquals("двести двенадцать", spelling.generate(212, context));
        Assertions.assertEquals("двести пятнадцать", spelling.generate(215, context));
    }

    @Test
    public void check_22x() {
        Assertions.assertEquals("двести двадцать", spelling.generate(220, context));
        Assertions.assertEquals("двести двадцать одни", spelling.generate(221, context));
        Assertions.assertEquals("двести двадцать два", spelling.generate(222, context));
        Assertions.assertEquals("двести двадцать пять", spelling.generate(225, context));
    }

    @Test
    public void check_25x() {
        Assertions.assertEquals("двести пятьдесят", spelling.generate(250, context));
        Assertions.assertEquals("двести пятьдесят одни", spelling.generate(251, context));
        Assertions.assertEquals("двести пятьдесят два", spelling.generate(252, context));
        Assertions.assertEquals("двести пятьдесят пять", spelling.generate(255, context));
    }

    @Test
    public void check_30x() {
        Assertions.assertEquals("триста", spelling.generate(300, context));
        Assertions.assertEquals("триста одни", spelling.generate(301, context));
        Assertions.assertEquals("триста два", spelling.generate(302, context));
        Assertions.assertEquals("триста пять", spelling.generate(305, context));
    }

    @Test
    public void check_31x() {
        Assertions.assertEquals("триста десять", spelling.generate(310, context));
        Assertions.assertEquals("триста одиннадцать", spelling.generate(311, context));
        Assertions.assertEquals("триста двенадцать", spelling.generate(312, context));
        Assertions.assertEquals("триста пятнадцать", spelling.generate(315, context));
    }

    @Test
    public void check_32x() {
        Assertions.assertEquals("триста двадцать", spelling.generate(320, context));
        Assertions.assertEquals("триста двадцать одни", spelling.generate(321, context));
        Assertions.assertEquals("триста двадцать два", spelling.generate(322, context));
        Assertions.assertEquals("триста двадцать пять", spelling.generate(325, context));
    }

    @Test
    public void check_35x() {
        Assertions.assertEquals("триста пятьдесят", spelling.generate(350, context));
        Assertions.assertEquals("триста пятьдесят одни", spelling.generate(351, context));
        Assertions.assertEquals("триста пятьдесят два", spelling.generate(352, context));
        Assertions.assertEquals("триста пятьдесят пять", spelling.generate(355, context));
    }

    @Test
    public void check_40x() {
        Assertions.assertEquals("четыреста", spelling.generate(400, context));
        Assertions.assertEquals("четыреста одни", spelling.generate(401, context));
        Assertions.assertEquals("четыреста два", spelling.generate(402, context));
        Assertions.assertEquals("четыреста пять", spelling.generate(405, context));
    }

    @Test
    public void check_41x() {
        Assertions.assertEquals("четыреста десять", spelling.generate(410, context));
        Assertions.assertEquals("четыреста одиннадцать", spelling.generate(411, context));
        Assertions.assertEquals("четыреста двенадцать", spelling.generate(412, context));
        Assertions.assertEquals("четыреста пятнадцать", spelling.generate(415, context));
    }

    @Test
    public void check_42x() {
        Assertions.assertEquals("четыреста двадцать", spelling.generate(420, context));
        Assertions.assertEquals("четыреста двадцать одни", spelling.generate(421, context));
        Assertions.assertEquals("четыреста двадцать два", spelling.generate(422, context));
        Assertions.assertEquals("четыреста двадцать пять", spelling.generate(425, context));
    }

    @Test
    public void check_45x() {
        Assertions.assertEquals("четыреста пятьдесят", spelling.generate(450, context));
        Assertions.assertEquals("четыреста пятьдесят одни", spelling.generate(451, context));
        Assertions.assertEquals("четыреста пятьдесят два", spelling.generate(452, context));
        Assertions.assertEquals("четыреста пятьдесят пять", spelling.generate(455, context));
    }

    @Test
    public void check_50x() {
        Assertions.assertEquals("пятьсот", spelling.generate(500, context));
        Assertions.assertEquals("пятьсот одни", spelling.generate(501, context));
        Assertions.assertEquals("пятьсот два", spelling.generate(502, context));
        Assertions.assertEquals("пятьсот пять", spelling.generate(505, context));
    }

    @Test
    public void check_51x() {
        Assertions.assertEquals("пятьсот десять", spelling.generate(510, context));
        Assertions.assertEquals("пятьсот одиннадцать", spelling.generate(511, context));
        Assertions.assertEquals("пятьсот двенадцать", spelling.generate(512, context));
        Assertions.assertEquals("пятьсот пятнадцать", spelling.generate(515, context));
    }

    @Test
    public void check_52x() {
        Assertions.assertEquals("пятьсот двадцать", spelling.generate(520, context));
        Assertions.assertEquals("пятьсот двадцать одни", spelling.generate(521, context));
        Assertions.assertEquals("пятьсот двадцать два", spelling.generate(522, context));
        Assertions.assertEquals("пятьсот двадцать пять", spelling.generate(525, context));
    }

    @Test
    public void check_55x() {
        Assertions.assertEquals("пятьсот пятьдесят", spelling.generate(550, context));
        Assertions.assertEquals("пятьсот пятьдесят одни", spelling.generate(551, context));
        Assertions.assertEquals("пятьсот пятьдесят два", spelling.generate(552, context));
        Assertions.assertEquals("пятьсот пятьдесят пять", spelling.generate(555, context));
    }

    @Test
    public void check_60x() {
        Assertions.assertEquals("шестьсот", spelling.generate(600, context));
        Assertions.assertEquals("шестьсот одни", spelling.generate(601, context));
        Assertions.assertEquals("шестьсот два", spelling.generate(602, context));
        Assertions.assertEquals("шестьсот пять", spelling.generate(605, context));
    }

    @Test
    public void check_61x() {
        Assertions.assertEquals("шестьсот десять", spelling.generate(610, context));
        Assertions.assertEquals("шестьсот одиннадцать", spelling.generate(611, context));
        Assertions.assertEquals("шестьсот двенадцать", spelling.generate(612, context));
        Assertions.assertEquals("шестьсот пятнадцать", spelling.generate(615, context));
    }

    @Test
    public void check_62x() {
        Assertions.assertEquals("шестьсот двадцать", spelling.generate(620, context));
        Assertions.assertEquals("шестьсот двадцать одни", spelling.generate(621, context));
        Assertions.assertEquals("шестьсот двадцать два", spelling.generate(622, context));
        Assertions.assertEquals("шестьсот двадцать пять", spelling.generate(625, context));
    }

    @Test
    public void check_65x() {
        Assertions.assertEquals("шестьсот пятьдесят", spelling.generate(650, context));
        Assertions.assertEquals("шестьсот пятьдесят одни", spelling.generate(651, context));
        Assertions.assertEquals("шестьсот пятьдесят два", spelling.generate(652, context));
        Assertions.assertEquals("шестьсот пятьдесят пять", spelling.generate(655, context));
    }

    @Test
    public void check_70x() {
        Assertions.assertEquals("семьсот", spelling.generate(700, context));
        Assertions.assertEquals("семьсот одни", spelling.generate(701, context));
        Assertions.assertEquals("семьсот два", spelling.generate(702, context));
        Assertions.assertEquals("семьсот пять", spelling.generate(705, context));
    }

    @Test
    public void check_71x() {
        Assertions.assertEquals("семьсот десять", spelling.generate(710, context));
        Assertions.assertEquals("семьсот одиннадцать", spelling.generate(711, context));
        Assertions.assertEquals("семьсот двенадцать", spelling.generate(712, context));
        Assertions.assertEquals("семьсот пятнадцать", spelling.generate(715, context));
    }

    @Test
    public void check_72x() {
        Assertions.assertEquals("семьсот двадцать", spelling.generate(720, context));
        Assertions.assertEquals("семьсот двадцать одни", spelling.generate(721, context));
        Assertions.assertEquals("семьсот двадцать два", spelling.generate(722, context));
        Assertions.assertEquals("семьсот двадцать пять", spelling.generate(725, context));
    }

    @Test
    public void check_75x() {
        Assertions.assertEquals("семьсот пятьдесят", spelling.generate(750, context));
        Assertions.assertEquals("семьсот пятьдесят одни", spelling.generate(751, context));
        Assertions.assertEquals("семьсот пятьдесят два", spelling.generate(752, context));
        Assertions.assertEquals("семьсот пятьдесят пять", spelling.generate(755, context));
    }

    @Test
    public void check_80x() {
        Assertions.assertEquals("восемьсот", spelling.generate(800, context));
        Assertions.assertEquals("восемьсот одни", spelling.generate(801, context));
        Assertions.assertEquals("восемьсот два", spelling.generate(802, context));
        Assertions.assertEquals("восемьсот пять", spelling.generate(805, context));
    }

    @Test
    public void check_81x() {
        Assertions.assertEquals("восемьсот десять", spelling.generate(810, context));
        Assertions.assertEquals("восемьсот одиннадцать", spelling.generate(811, context));
        Assertions.assertEquals("восемьсот двенадцать", spelling.generate(812, context));
        Assertions.assertEquals("восемьсот пятнадцать", spelling.generate(815, context));
    }

    @Test
    public void check_82x() {
        Assertions.assertEquals("восемьсот двадцать", spelling.generate(820, context));
        Assertions.assertEquals("восемьсот двадцать одни", spelling.generate(821, context));
        Assertions.assertEquals("восемьсот двадцать два", spelling.generate(822, context));
        Assertions.assertEquals("восемьсот двадцать пять", spelling.generate(825, context));
    }

    @Test
    public void check_85x() {
        Assertions.assertEquals("восемьсот пятьдесят", spelling.generate(850, context));
        Assertions.assertEquals("восемьсот пятьдесят одни", spelling.generate(851, context));
        Assertions.assertEquals("восемьсот пятьдесят два", spelling.generate(852, context));
        Assertions.assertEquals("восемьсот пятьдесят пять", spelling.generate(855, context));
    }

    @Test
    public void check_90x() {
        Assertions.assertEquals("девятьсот", spelling.generate(900, context));
        Assertions.assertEquals("девятьсот одни", spelling.generate(901, context));
        Assertions.assertEquals("девятьсот два", spelling.generate(902, context));
        Assertions.assertEquals("девятьсот пять", spelling.generate(905, context));
    }

    @Test
    public void check_91x() {
        Assertions.assertEquals("девятьсот десять", spelling.generate(910, context));
        Assertions.assertEquals("девятьсот одиннадцать", spelling.generate(911, context));
        Assertions.assertEquals("девятьсот двенадцать", spelling.generate(912, context));
        Assertions.assertEquals("девятьсот пятнадцать", spelling.generate(915, context));
    }

    @Test
    public void check_92x() {
        Assertions.assertEquals("девятьсот двадцать", spelling.generate(920, context));
        Assertions.assertEquals("девятьсот двадцать одни", spelling.generate(921, context));
        Assertions.assertEquals("девятьсот двадцать два", spelling.generate(922, context));
        Assertions.assertEquals("девятьсот двадцать пять", spelling.generate(925, context));
    }

    @Test
    public void check_95x() {
        Assertions.assertEquals("девятьсот пятьдесят", spelling.generate(950, context));
        Assertions.assertEquals("девятьсот пятьдесят одни", spelling.generate(951, context));
        Assertions.assertEquals("девятьсот пятьдесят два", spelling.generate(952, context));
        Assertions.assertEquals("девятьсот пятьдесят пять", spelling.generate(955, context));
    }
}
