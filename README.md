# Number Spelling

### Текстовое представление чисел на русском языке
- Целые числа от -999_999_999_999_999 до 999_999_999_999_999 включительно
- Склонение по падежам, числам, роду, одушевленности

### Использование:

По-умолчанию (им.п, ед.ч, м.р, неодуш.)
```
import ahodanenok.number.spelling.NumberSpelling;
...
NumberSpelling spelling = new NumberSpelling();

System.out.println(spelling.generate(14));
// -> четырнадцать

System.out.println(spelling.generate(22));
// -> двадцать два

System.out.println(spelling.generate(-327));
// -> минус триста двадцать семь

System.out.println(spelling.generate(1_000_001));
// -> один миллион один

System.out.println(spelling.generate(999_999_999_999_999L));
// -> девятьсот девяносто девять триллионов девятьсот девяносто девять миллиардов девятьсот девяносто девять миллионов девятьсот девяносто девять тысяч девятьсот девяносто девять
```

Склонение
```
import ahodanenok.number.spelling.*;
...
NumberSpelling spelling = new NumberSpelling();

SpellingContext context = SpellingContext.builder().withCase(Case.ACCUSATIVE).withGender(Gender.FEMININE).withAnimacy(Animacy.ANIMATE).build();
System.out.println(spelling.generate(2, context));
// -> двух

SpellingContext context = SpellingContext.builder().withCase(Case.ACCUSATIVE).withGender(Gender.FEMININE).withAnimacy(Animacy.INANIMATE).build();
System.out.println(spelling.generate(2, context));
// -> две

SpellingContext context = SpellingContext.builder().withCase(Case.DATIVE).withCount(Count.SINGULAR).withGender(Gender.MASCULINE).build();
System.out.println(spelling.generate(-120501, context));
// -> минус ста двадцати тысячам пятистам одному
```
