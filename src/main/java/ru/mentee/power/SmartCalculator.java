package ru.mentee.power;

public class SmartCalculator {
    public static void main(String[] args) {
        // TODO: Реализуйте калькулятор, который:
        // 1. Выполняет основные арифметические операции
        int i1 = 3;
        int i2 = 4;
        double dbl1 = 5.3;
        double dbl2 = 1.2;
        System.out.println("Сложение: 3 + 4 = " + (i1 + i2) + " (тип: int) ");
        System.out.println("Вычитание: 5.3 - 1.2 = " + (dbl1 - dbl2) + " (тип: double) ");
        System.out.println("Умножение: 2.4 * 5.6 = " + (double) (2.4 * 5.6) + " (тип: double) ");
        System.out.println("Деление: 7.6 / 3.7 = " + (double) (7.6 / 3.7) + " (тип: double) ");
        System.out.println("Деление целочисленное: 5 / 2 = " + (int) (5 / 2) + " (тип: int) ");
        System.out.println("Остаток от деления: 5 / 2 = " + (int) (5 % 2) + " (тип: int) ");
        System.out.println("Возведение в степень: 2 ^ 5 = " + (double) (Math.pow(2, 5)) + " (тип: double) ");
        System.out.println("");
        System.out.println("Обработка особых случаев:");
        System.out.println("Попытка деления на ноль (для double): " + (5.0 / 0));
        String except = "";
        try {
            int test = (int) 5 / 0;
        } catch (Exception ex) {
            except = ex.toString();
        }
        System.out.println("Попытка деления на ноль (для int): " + except);
        // 2. Умеет работать с разными типами данных
        // 3. Выбирает правильный тип результата
        // 4. Обрабатывает особые случаи (деление на ноль)

        // Примеры операций:
        // 1. Сложение целых чисел
        // 2. Умножение целого числа на дробное
        // 3. Деление с правильным выбором типа результата
        // 4. Возведение в степень (можно использовать Math.pow)

        // TODO: Прокомментируйте, почему выбран тот или иной тип для результата

        // Выведите все результаты с пояснениями
    }
}