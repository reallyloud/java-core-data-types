package ru.mentee.power;

public class DataTypeBoundaries {
    public static void main(String[] args) {
        // TODO: Выведите минимальные и максимальные значения для всех числовых типов данных
        // Используйте константы классов-оберток (Byte, Short, Integer, Long, Float, Double)
        System.out.println("byte: от " + Byte.MIN_VALUE + " до " + Byte.MAX_VALUE);
        System.out.println("short: от " + Short.MIN_VALUE + " до " + Short.MAX_VALUE);
        System.out.println("int: от " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);
        System.out.println("long: от " + Long.MIN_VALUE + " до " + Long.MAX_VALUE);
        System.out.println("float: от " + Float.MIN_VALUE + " до " + Float.MAX_VALUE);
        System.out.println("double: от " + Double.MIN_VALUE + " до " + Double.MAX_VALUE);
        // Пример:
        System.out.println("byte: от " + Byte.MIN_VALUE + " до " + Byte.MAX_VALUE);

        // TODO: Продемонстрируйте переполнение для одного из типов
        byte a = 127;
        System.out.println("Демонстрация переполнения:");
        System.out.println("Максимальное значение byte: " + (a));
        System.out.println("После прибавления 1: " + (a+1));

        // Пример: что произойдет, если к максимальному byte добавить 1?
        //byte перейдет в int
    }
}