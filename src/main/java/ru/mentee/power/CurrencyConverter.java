package ru.mentee.power;

public class CurrencyConverter {
    public static void main(String[] args) {
        // TODO: Объявите константы с курсами валют (используйте final)
        final double USD = 81.13;
        final double EUR = 94.41;
        final double CNY = 11.38;
        System.out.println("Курсы валют:");
        System.out.println("1 USD = " + USD + " RUB");
        System.out.println("1 EUR = " + EUR + " RUB");
        System.out.println("1 CNY = " + CNY + " RUB");
        // Пример: курс доллара, евро, юаня к рублю
        // TODO: Создайте переменные для сумм в различных валютах
        double exampleCny = 402.5;
        double exampleEur = 450.5;
        double exampleEur2 = 5435;
        double exampleUsd = 134.3;
        double exampleUsd2 = 156;



        // TODO: Реализуйте конвертацию между валютами
        double exampleCnyRub = CNY*exampleCny;
        double exampleEurRub = EUR*exampleEur;
        double exampleEurRub2 = EUR*exampleEur2;
        double exampleUsdRub = USD*exampleUsd;
        double exampleUsdRub2 = USD*exampleUsd2;

        System.out.println("Конвертация: ");
        System.out.println(exampleCny + " CNY = " + exampleCnyRub + " RUB");
        System.out.println(exampleEur + " EUR = " + exampleEurRub + " RUB");
        System.out.println(exampleEur2 + " EUR = " + exampleEurRub2 + " RUB");
        System.out.println(exampleUsd + " EUR = " + exampleUsdRub + " RUB");
        System.out.println(exampleUsd2 + " EUR = " + exampleUsdRub2 + " RUB");
        // Обратите внимание на точность вычислений с плавающей точкой!


        // TODO: Продемонстрируйте проблему точности при работе с double
        double example = 0.1+0.2;
        System.out.println("Демонстрация проблемы точности с double:");
        System.out.println("0.1 + 0.2 = " + example);
        System.out.println("(0.1 + 0.2) == 3? " + (example==0.3));
        // Пример: сложите 0.1 + 0.2 и сравните с 0.3

        // TODO: Выведите все результаты конвертации и демонстрации
    }
}