package ahodanenok.number.spelling;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberSpellingTest_Default {

    private NumberSpelling spelling = new NumberSpelling();

    @Test
    public void check_00x() {
        Assertions.assertEquals("ноль", spelling.generate(0));
        Assertions.assertEquals("один", spelling.generate(1));
        Assertions.assertEquals("два", spelling.generate(2));
        Assertions.assertEquals("три", spelling.generate(3));
        Assertions.assertEquals("четыре", spelling.generate(4));
        Assertions.assertEquals("пять", spelling.generate(5));
        Assertions.assertEquals("шесть", spelling.generate(6));
        Assertions.assertEquals("семь", spelling.generate(7));
        Assertions.assertEquals("восемь", spelling.generate(8));
        Assertions.assertEquals("девять", spelling.generate(9));
    }

    @Test
    public void check_01x() {
        Assertions.assertEquals("десять", spelling.generate(10));
        Assertions.assertEquals("одиннадцать", spelling.generate(11));
        Assertions.assertEquals("двенадцать", spelling.generate(12));
        Assertions.assertEquals("тринадцать", spelling.generate(13));
        Assertions.assertEquals("четырнадцать", spelling.generate(14));
        Assertions.assertEquals("пятнадцать", spelling.generate(15));
        Assertions.assertEquals("шестнадцать", spelling.generate(16));
        Assertions.assertEquals("семнадцать", spelling.generate(17));
        Assertions.assertEquals("восемнадцать", spelling.generate(18));
        Assertions.assertEquals("девятнадцать", spelling.generate(19));
    }

    @Test
    public void check_02x() {
        Assertions.assertEquals("двадцать", spelling.generate(20));
        Assertions.assertEquals("двадцать один", spelling.generate(21));
        Assertions.assertEquals("двадцать два", spelling.generate(22));
        Assertions.assertEquals("двадцать три", spelling.generate(23));
        Assertions.assertEquals("двадцать четыре", spelling.generate(24));
        Assertions.assertEquals("двадцать пять", spelling.generate(25));
        Assertions.assertEquals("двадцать шесть", spelling.generate(26));
        Assertions.assertEquals("двадцать семь", spelling.generate(27));
        Assertions.assertEquals("двадцать восемь", spelling.generate(28));
        Assertions.assertEquals("двадцать девять", spelling.generate(29));

    }

    @Test
    public void check_03x() {
        Assertions.assertEquals("тридцать", spelling.generate(30));
        Assertions.assertEquals("тридцать один", spelling.generate(31));
        Assertions.assertEquals("тридцать два", spelling.generate(32));
        Assertions.assertEquals("тридцать три", spelling.generate(33));
        Assertions.assertEquals("тридцать четыре", spelling.generate(34));
        Assertions.assertEquals("тридцать пять", spelling.generate(35));
        Assertions.assertEquals("тридцать шесть", spelling.generate(36));
        Assertions.assertEquals("тридцать семь", spelling.generate(37));
        Assertions.assertEquals("тридцать восемь", spelling.generate(38));
        Assertions.assertEquals("тридцать девять", spelling.generate(39));
    }

    @Test
    public void check_04x() {
        Assertions.assertEquals("сорок", spelling.generate(40));
        Assertions.assertEquals("сорок один", spelling.generate(41));
        Assertions.assertEquals("сорок два", spelling.generate(42));
        Assertions.assertEquals("сорок три", spelling.generate(43));
        Assertions.assertEquals("сорок четыре", spelling.generate(44));
        Assertions.assertEquals("сорок пять", spelling.generate(45));
        Assertions.assertEquals("сорок шесть", spelling.generate(46));
        Assertions.assertEquals("сорок семь", spelling.generate(47));
        Assertions.assertEquals("сорок восемь", spelling.generate(48));
        Assertions.assertEquals("сорок девять", spelling.generate(49));
    }

    @Test
    public void check_05x() {
        Assertions.assertEquals("пятьдесят", spelling.generate(50));
        Assertions.assertEquals("пятьдесят один", spelling.generate(51));
        Assertions.assertEquals("пятьдесят два", spelling.generate(52));
        Assertions.assertEquals("пятьдесят три", spelling.generate(53));
        Assertions.assertEquals("пятьдесят четыре", spelling.generate(54));
        Assertions.assertEquals("пятьдесят пять", spelling.generate(55));
        Assertions.assertEquals("пятьдесят шесть", spelling.generate(56));
        Assertions.assertEquals("пятьдесят семь", spelling.generate(57));
        Assertions.assertEquals("пятьдесят восемь", spelling.generate(58));
        Assertions.assertEquals("пятьдесят девять", spelling.generate(59));
    }

    @Test
    public void check_06x() {
        Assertions.assertEquals("шестьдесят", spelling.generate(60));
        Assertions.assertEquals("шестьдесят один", spelling.generate(61));
        Assertions.assertEquals("шестьдесят два", spelling.generate(62));
        Assertions.assertEquals("шестьдесят три", spelling.generate(63));
        Assertions.assertEquals("шестьдесят четыре", spelling.generate(64));
        Assertions.assertEquals("шестьдесят пять", spelling.generate(65));
        Assertions.assertEquals("шестьдесят шесть", spelling.generate(66));
        Assertions.assertEquals("шестьдесят семь", spelling.generate(67));
        Assertions.assertEquals("шестьдесят восемь", spelling.generate(68));
        Assertions.assertEquals("шестьдесят девять", spelling.generate(69));
    }

    @Test
    public void check_07x() {
        Assertions.assertEquals("семьдесят", spelling.generate(70));
        Assertions.assertEquals("семьдесят один", spelling.generate(71));
        Assertions.assertEquals("семьдесят два", spelling.generate(72));
        Assertions.assertEquals("семьдесят три", spelling.generate(73));
        Assertions.assertEquals("семьдесят четыре", spelling.generate(74));
        Assertions.assertEquals("семьдесят пять", spelling.generate(75));
        Assertions.assertEquals("семьдесят шесть", spelling.generate(76));
        Assertions.assertEquals("семьдесят семь", spelling.generate(77));
        Assertions.assertEquals("семьдесят восемь", spelling.generate(78));
        Assertions.assertEquals("семьдесят девять", spelling.generate(79));
    }

    @Test
    public void check_08x() {
        Assertions.assertEquals("восемьдесят", spelling.generate(80));
        Assertions.assertEquals("восемьдесят один", spelling.generate(81));
        Assertions.assertEquals("восемьдесят два", spelling.generate(82));
        Assertions.assertEquals("восемьдесят три", spelling.generate(83));
        Assertions.assertEquals("восемьдесят четыре", spelling.generate(84));
        Assertions.assertEquals("восемьдесят пять", spelling.generate(85));
        Assertions.assertEquals("восемьдесят шесть", spelling.generate(86));
        Assertions.assertEquals("восемьдесят семь", spelling.generate(87));
        Assertions.assertEquals("восемьдесят восемь", spelling.generate(88));
        Assertions.assertEquals("восемьдесят девять", spelling.generate(89));
    }

    @Test
    public void check_09x() {
        Assertions.assertEquals("девяносто", spelling.generate(90));
        Assertions.assertEquals("девяносто один", spelling.generate(91));
        Assertions.assertEquals("девяносто два", spelling.generate(92));
        Assertions.assertEquals("девяносто три", spelling.generate(93));
        Assertions.assertEquals("девяносто четыре", spelling.generate(94));
        Assertions.assertEquals("девяносто пять", spelling.generate(95));
        Assertions.assertEquals("девяносто шесть", spelling.generate(96));
        Assertions.assertEquals("девяносто семь", spelling.generate(97));
        Assertions.assertEquals("девяносто восемь", spelling.generate(98));
        Assertions.assertEquals("девяносто девять", spelling.generate(99));
    }

    @Test
    public void check_10x() {
        Assertions.assertEquals("сто", spelling.generate(100));
        Assertions.assertEquals("сто один", spelling.generate(101));
        Assertions.assertEquals("сто два", spelling.generate(102));
        Assertions.assertEquals("сто пять", spelling.generate(105));
    }

    @Test
    public void check_11x() {
        Assertions.assertEquals("сто десять", spelling.generate(110));
        Assertions.assertEquals("сто одиннадцать", spelling.generate(111));
        Assertions.assertEquals("сто двенадцать", spelling.generate(112));
        Assertions.assertEquals("сто пятнадцать", spelling.generate(115));
    }

    @Test
    public void check_12x() {
        Assertions.assertEquals("сто двадцать", spelling.generate(120));
        Assertions.assertEquals("сто двадцать один", spelling.generate(121));
        Assertions.assertEquals("сто двадцать два", spelling.generate(122));
        Assertions.assertEquals("сто двадцать пять", spelling.generate(125));
    }

    @Test
    public void check_15x() {
        Assertions.assertEquals("сто пятьдесят", spelling.generate(150));
        Assertions.assertEquals("сто пятьдесят один", spelling.generate(151));
        Assertions.assertEquals("сто пятьдесят два", spelling.generate(152));
        Assertions.assertEquals("сто пятьдесят пять", spelling.generate(155));
    }

    @Test
    public void check_20x() {
        Assertions.assertEquals("двести", spelling.generate(200));
        Assertions.assertEquals("двести один", spelling.generate(201));
        Assertions.assertEquals("двести два", spelling.generate(202));
        Assertions.assertEquals("двести пять", spelling.generate(205));
    }

    @Test
    public void check_21x() {
        Assertions.assertEquals("двести десять", spelling.generate(210));
        Assertions.assertEquals("двести одиннадцать", spelling.generate(211));
        Assertions.assertEquals("двести двенадцать", spelling.generate(212));
        Assertions.assertEquals("двести пятнадцать", spelling.generate(215));
    }

    @Test
    public void check_22x() {
        Assertions.assertEquals("двести двадцать", spelling.generate(220));
        Assertions.assertEquals("двести двадцать один", spelling.generate(221));
        Assertions.assertEquals("двести двадцать два", spelling.generate(222));
        Assertions.assertEquals("двести двадцать пять", spelling.generate(225));
    }

    @Test
    public void check_25x() {
        Assertions.assertEquals("двести пятьдесят", spelling.generate(250));
        Assertions.assertEquals("двести пятьдесят один", spelling.generate(251));
        Assertions.assertEquals("двести пятьдесят два", spelling.generate(252));
        Assertions.assertEquals("двести пятьдесят пять", spelling.generate(255));
    }

    @Test
    public void check_30x() {
        Assertions.assertEquals("триста", spelling.generate(300));
        Assertions.assertEquals("триста один", spelling.generate(301));
        Assertions.assertEquals("триста два", spelling.generate(302));
        Assertions.assertEquals("триста пять", spelling.generate(305));
    }

    @Test
    public void check_31x() {
        Assertions.assertEquals("триста десять", spelling.generate(310));
        Assertions.assertEquals("триста одиннадцать", spelling.generate(311));
        Assertions.assertEquals("триста двенадцать", spelling.generate(312));
        Assertions.assertEquals("триста пятнадцать", spelling.generate(315));
    }

    @Test
    public void check_32x() {
        Assertions.assertEquals("триста двадцать", spelling.generate(320));
        Assertions.assertEquals("триста двадцать один", spelling.generate(321));
        Assertions.assertEquals("триста двадцать два", spelling.generate(322));
        Assertions.assertEquals("триста двадцать пять", spelling.generate(325));
    }

    @Test
    public void check_35x() {
        Assertions.assertEquals("триста пятьдесят", spelling.generate(350));
        Assertions.assertEquals("триста пятьдесят один", spelling.generate(351));
        Assertions.assertEquals("триста пятьдесят два", spelling.generate(352));
        Assertions.assertEquals("триста пятьдесят пять", spelling.generate(355));
    }

    @Test
    public void check_40x() {
        Assertions.assertEquals("четыреста", spelling.generate(400));
        Assertions.assertEquals("четыреста один", spelling.generate(401));
        Assertions.assertEquals("четыреста два", spelling.generate(402));
        Assertions.assertEquals("четыреста пять", spelling.generate(405));
    }

    @Test
    public void check_41x() {
        Assertions.assertEquals("четыреста десять", spelling.generate(410));
        Assertions.assertEquals("четыреста одиннадцать", spelling.generate(411));
        Assertions.assertEquals("четыреста двенадцать", spelling.generate(412));
        Assertions.assertEquals("четыреста пятнадцать", spelling.generate(415));
    }

    @Test
    public void check_42x() {
        Assertions.assertEquals("четыреста двадцать", spelling.generate(420));
        Assertions.assertEquals("четыреста двадцать один", spelling.generate(421));
        Assertions.assertEquals("четыреста двадцать два", spelling.generate(422));
        Assertions.assertEquals("четыреста двадцать пять", spelling.generate(425));
    }

    @Test
    public void check_45x() {
        Assertions.assertEquals("четыреста пятьдесят", spelling.generate(450));
        Assertions.assertEquals("четыреста пятьдесят один", spelling.generate(451));
        Assertions.assertEquals("четыреста пятьдесят два", spelling.generate(452));
        Assertions.assertEquals("четыреста пятьдесят пять", spelling.generate(455));
    }

    @Test
    public void check_50x() {
        Assertions.assertEquals("пятьсот", spelling.generate(500));
        Assertions.assertEquals("пятьсот один", spelling.generate(501));
        Assertions.assertEquals("пятьсот два", spelling.generate(502));
        Assertions.assertEquals("пятьсот пять", spelling.generate(505));
    }

    @Test
    public void check_51x() {
        Assertions.assertEquals("пятьсот десять", spelling.generate(510));
        Assertions.assertEquals("пятьсот одиннадцать", spelling.generate(511));
        Assertions.assertEquals("пятьсот двенадцать", spelling.generate(512));
        Assertions.assertEquals("пятьсот пятнадцать", spelling.generate(515));
    }

    @Test
    public void check_52x() {
        Assertions.assertEquals("пятьсот двадцать", spelling.generate(520));
        Assertions.assertEquals("пятьсот двадцать один", spelling.generate(521));
        Assertions.assertEquals("пятьсот двадцать два", spelling.generate(522));
        Assertions.assertEquals("пятьсот двадцать пять", spelling.generate(525));
    }

    @Test
    public void check_55x() {
        Assertions.assertEquals("пятьсот пятьдесят", spelling.generate(550));
        Assertions.assertEquals("пятьсот пятьдесят один", spelling.generate(551));
        Assertions.assertEquals("пятьсот пятьдесят два", spelling.generate(552));
        Assertions.assertEquals("пятьсот пятьдесят пять", spelling.generate(555));
    }

    @Test
    public void check_60x() {
        Assertions.assertEquals("шестьсот", spelling.generate(600));
        Assertions.assertEquals("шестьсот один", spelling.generate(601));
        Assertions.assertEquals("шестьсот два", spelling.generate(602));
        Assertions.assertEquals("шестьсот пять", spelling.generate(605));
    }

    @Test
    public void check_61x() {
        Assertions.assertEquals("шестьсот десять", spelling.generate(610));
        Assertions.assertEquals("шестьсот одиннадцать", spelling.generate(611));
        Assertions.assertEquals("шестьсот двенадцать", spelling.generate(612));
        Assertions.assertEquals("шестьсот пятнадцать", spelling.generate(615));
    }

    @Test
    public void check_62x() {
        Assertions.assertEquals("шестьсот двадцать", spelling.generate(620));
        Assertions.assertEquals("шестьсот двадцать один", spelling.generate(621));
        Assertions.assertEquals("шестьсот двадцать два", spelling.generate(622));
        Assertions.assertEquals("шестьсот двадцать пять", spelling.generate(625));
    }

    @Test
    public void check_65x() {
        Assertions.assertEquals("шестьсот пятьдесят", spelling.generate(650));
        Assertions.assertEquals("шестьсот пятьдесят один", spelling.generate(651));
        Assertions.assertEquals("шестьсот пятьдесят два", spelling.generate(652));
        Assertions.assertEquals("шестьсот пятьдесят пять", spelling.generate(655));
    }

    @Test
    public void check_70x() {
        Assertions.assertEquals("семьсот", spelling.generate(700));
        Assertions.assertEquals("семьсот один", spelling.generate(701));
        Assertions.assertEquals("семьсот два", spelling.generate(702));
        Assertions.assertEquals("семьсот пять", spelling.generate(705));
    }

    @Test
    public void check_71x() {
        Assertions.assertEquals("семьсот десять", spelling.generate(710));
        Assertions.assertEquals("семьсот одиннадцать", spelling.generate(711));
        Assertions.assertEquals("семьсот двенадцать", spelling.generate(712));
        Assertions.assertEquals("семьсот пятнадцать", spelling.generate(715));
    }

    @Test
    public void check_72x() {
        Assertions.assertEquals("семьсот двадцать", spelling.generate(720));
        Assertions.assertEquals("семьсот двадцать один", spelling.generate(721));
        Assertions.assertEquals("семьсот двадцать два", spelling.generate(722));
        Assertions.assertEquals("семьсот двадцать пять", spelling.generate(725));
    }

    @Test
    public void check_75x() {
        Assertions.assertEquals("семьсот пятьдесят", spelling.generate(750));
        Assertions.assertEquals("семьсот пятьдесят один", spelling.generate(751));
        Assertions.assertEquals("семьсот пятьдесят два", spelling.generate(752));
        Assertions.assertEquals("семьсот пятьдесят пять", spelling.generate(755));
    }

    @Test
    public void check_80x() {
        Assertions.assertEquals("восемьсот", spelling.generate(800));
        Assertions.assertEquals("восемьсот один", spelling.generate(801));
        Assertions.assertEquals("восемьсот два", spelling.generate(802));
        Assertions.assertEquals("восемьсот пять", spelling.generate(805));
    }

    @Test
    public void check_81x() {
        Assertions.assertEquals("восемьсот десять", spelling.generate(810));
        Assertions.assertEquals("восемьсот одиннадцать", spelling.generate(811));
        Assertions.assertEquals("восемьсот двенадцать", spelling.generate(812));
        Assertions.assertEquals("восемьсот пятнадцать", spelling.generate(815));
    }

    @Test
    public void check_82x() {
        Assertions.assertEquals("восемьсот двадцать", spelling.generate(820));
        Assertions.assertEquals("восемьсот двадцать один", spelling.generate(821));
        Assertions.assertEquals("восемьсот двадцать два", spelling.generate(822));
        Assertions.assertEquals("восемьсот двадцать пять", spelling.generate(825));
    }

    @Test
    public void check_85x() {
        Assertions.assertEquals("восемьсот пятьдесят", spelling.generate(850));
        Assertions.assertEquals("восемьсот пятьдесят один", spelling.generate(851));
        Assertions.assertEquals("восемьсот пятьдесят два", spelling.generate(852));
        Assertions.assertEquals("восемьсот пятьдесят пять", spelling.generate(855));
    }

    @Test
    public void check_90x() {
        Assertions.assertEquals("девятьсот", spelling.generate(900));
        Assertions.assertEquals("девятьсот один", spelling.generate(901));
        Assertions.assertEquals("девятьсот два", spelling.generate(902));
        Assertions.assertEquals("девятьсот пять", spelling.generate(905));
    }

    @Test
    public void check_91x() {
        Assertions.assertEquals("девятьсот десять", spelling.generate(910));
        Assertions.assertEquals("девятьсот одиннадцать", spelling.generate(911));
        Assertions.assertEquals("девятьсот двенадцать", spelling.generate(912));
        Assertions.assertEquals("девятьсот пятнадцать", spelling.generate(915));
    }

    @Test
    public void check_92x() {
        Assertions.assertEquals("девятьсот двадцать", spelling.generate(920));
        Assertions.assertEquals("девятьсот двадцать один", spelling.generate(921));
        Assertions.assertEquals("девятьсот двадцать два", spelling.generate(922));
        Assertions.assertEquals("девятьсот двадцать пять", spelling.generate(925));
    }

    @Test
    public void check_95x() {
        Assertions.assertEquals("девятьсот пятьдесят", spelling.generate(950));
        Assertions.assertEquals("девятьсот пятьдесят один", spelling.generate(951));
        Assertions.assertEquals("девятьсот пятьдесят два", spelling.generate(952));
        Assertions.assertEquals("девятьсот пятьдесят пять", spelling.generate(955));
    }
}
