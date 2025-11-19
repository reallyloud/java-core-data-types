package ru.mentee.power.datatype;

public class MenteeDemo {
    public static void main(String[] args) {
        Mentee mentee1 = new Mentee("Олег","Иванов", 23,4,3);
        Mentee mentee2 = new Mentee("Геннадий","Вербицкий", 27,2,5);
        Mentee mentee3 = new Mentee("Евгений","Сливочников", 65,5,1);

        System.out.println("Является ли " + mentee1.getFirstName() + " отличником? " + mentee1.isExcellent());
        System.out.println("Является ли " + mentee2.getFirstName() + " отличником? " + mentee2.isExcellent());
        System.out.println("Является ли " + mentee3.getFirstName() + " отличником? " + mentee3.isExcellent());

        mentee1.displayInfo();
        mentee1.advanceToNextLevel();
        mentee1.displayInfo();

    }
}
