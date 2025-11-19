package ru.mentee.power;

public class DataTypesInAction {
    public static void main(String[] args) {
        // TODO: Создайте переменные различных типов
        int i = 10;
        int i2 = 3;
        double dbl = 5.2;
        long l = 10000000000000L;
        byte byte1 = 20;
        byte byte2 = 22;
        boolean tr = true;
        boolean fls = false;
        // TODO: Выполните и продемонстрируйте следующие операции:
        // 1. Деление целых чисел с отбрасыванием дробной части
        System.out.println("1. Целочисленное деление: ");
        System.out.println("10 / 3 = " + (i/i2) + " (дробная часть отбрасывается)" );
        // 2. Деление целого числа на число с плавающей точкой
        System.out.println("2. Деление с плавающей точкой:");
        System.out.println("10 / 5.2 = " + (i/dbl) + " (результат с плавающей точкой)" );
        // 3. Явное приведение типов (различные варианты)
        System.out.println("3. Явное приведение типов: ");
        System.out.println("double 5.2 к int: " + (int)dbl);
        System.out.println("int 65 к char \'" + ((char)65) + "\'");
        System.out.println("long 10000000000000 к int: " + (int)l + " (переполнение)");
        // 4. Автоматическое повышение типа при операциях
        System.out.println("4. Автоматическое повышение типа:");
        System.out.println("byte + byte = int: 20 + 22 = " + (byte1+byte2) );
        System.out.println("int * double = double: 10 * 5.2 = " + (i*dbl) + " тип результата double");
        // 5. Операции с boolean значениями
        System.out.println("5. Операции с boolean:");
        System.out.println("true && false = " + (tr&&fls));
        System.out.println("true || false = " + (tr||fls));
        System.out.println("!true = " + !tr);
        // 6. Работа с символами (char) и их кодами
        System.out.println("6. Операции с символами:");
        System.out.println("Символ \'A\' имеет код: " + (int)'A');
        System.out.println("Символ с кодом 66: \'" + (char)66 + "\'");
        System.out.println("\'A\' + 1 = \'" + ((char)('A'+1)) + "\' ((символ сдвигается на 1 позицию в таблице Unicode)");
        // Выведите результаты всех операций с пояснениями
    }
}
