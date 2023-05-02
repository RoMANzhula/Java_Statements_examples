public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = 5;
        int i = 10;
        int j = 15;
        int result = 0;

        ////математические операторы
        result = x + y; //оператор сложения
        result = j - i; //оператор вычитания
        result = x * y; //оператор умножения
        result = j / i; //оператор деления (вывод = 1, остаток просто отбрасывается для int)
        result = j % i; //остаток от деления (вывод = 5)
        result = -y; //смена полярности значения переменной на минус (если был минусовый, то поменяет на +)
        result = +y; //бесполезный оператор (не меняет ничего)


        ////операторы сравнения - тип данных boolean (true/false)
        if (x < y) result = 100; //оператор меньше (если меньше, то true)
        if (i > j) result = 500; //оператор больше (если больше, то true)
        if (x <= y) result = 100; //оператор меньше либо равно
        if (i >= j) result = 500; //оператор больше либо равно
        if (x == y) result = 100; //оператор равенства
        if (i != j) result = 500; //оператор неравенства


        ////логические операторы
        if (x == y && i == j) result = 100; //оператор "И" (если оба из условий верны, т.е. true, то результат выражения true)
        if (x == y || i == j) result = 100; //оператор "ИЛИ" (если одно из условий верное, т.е. true, то результат выражения true)
        if (!true) result = 100; //оператор "НЕ" (результат выражения true, только если условие равно false)


        ////побитовые операторы (1 - это true, 0 - это false)
        if ((1 & 1) == 1) result = 101; //побитовый "И" - если оба из условий true, то и результат true
        if ((1 & 0) == 0) result = 102; //побитовый "И" - если одно из условий false, то и результат false
        if ((1 | 0) == 1) result = 103; //побитовый "ИЛИ" - если одно из условий true, то и результат true
        if ((1 | 1) == 1) result = 104; //побитовый "ИЛИ" - если одно из условий true, то и результат true
        if ((0 | 0) == 0) result = 105; //побитовый "ИЛИ" - если оба из условий false, то и результат false
        //(~1 == 0) побитовое "НЕ" - !true == false
        //(~0 == 1) побитовое "НЕ" - !false == true
        //0 ^ 0 == 0 побитовый "ХОР"-"исключающее или" - если оба условия false, то и результат false
        //1 ^ 1 == 0 побитовый "ХОР"-"исключающее или" - если оба условия true, то результат false
        //1 ^ 0 == 1 побитовый "ХОР"-"исключающее или" - если одно из условий true, а второе false, то результат true
        //0 ^ 1 == 1 побитовый "ХОР"-"исключающее или" - если одно из условий false, а второе true, то результат true
        //x >> y - побитовый сдвиг вправо (передвигает биты числа х на у разрядов вправо (пример 00101101 >> 1 = 00010110)),
            //для отрицательных чисел новые разряды заполняются 1 (10001010 >> 2 = 11100010)
        //х << у - побитовый сдвиг влево (передвигает биты числа х на у разрядов вправо (пример 00101101 << 1 = 010110100)),
            //для отрицательных чисел новые разряды заполняются 1 (10001010 >> 2 = 11100010)
        //х >>> у - побитовый сдвиг вправо с заполнением битов(разрядов) нулями(т.е. отрицательное число(с 1 в самом начале) перестает
            //быть отрицательным (пример 10001010 >>> 2 = 00100010))


        ////операторы присваивания
        result += y; //аналогично result = result + y
        result -= y; //аналогично result = result - y
        result *= y; //аналогично result = result * y
        result /= y; //аналогично result = result / y
        result %= y; //аналогично result = result % y (остатком от деления 105 на 5 будет 0)
        boolean a = true; boolean b = false;
        a |= b; //аналогично a = a | b (вернет true, т.к. побитовый "ИЛИ", при наличии true в одном из условий, вернет true)
        a &= b; //аналогично a = a & b (вернет true, т.к. побитовый "И", при наличии false в одном из условий, вернет false)


        ////оператор инкремента и декремента
        result = y++; //постфиксный инкремент (вначале result присваивается значение у, а после у увеличивается на 1)
        result = ++y; //префиксный инкремент (в переменную result записывается уже увеличенное на 1 значение у)
            //результатом следующего вычисления будет result = ++х + ++х --- result = 2 + 3
        result = y--; //постфиксный декремент (вначале result присваивается значение у, а после у уменьшается на 1)
        result = --y; //префиксный декремент (в переменную result записывается уже уменьшенное на 1 значение у)


        ////тернарный оператор
        result = x > y ? i : j; //аналогично - if(x > y) { i } else { j }

    }
}