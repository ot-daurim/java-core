package org.daurim.objects;

public class Class {
    public static void main(String[] args) {
        User user_001 = new User("Arthur Morgan", 32, "arthur.m@gmail.com");
        user_001.getFullName(user_001.fullName);
    }
}

// Шаг первый. Определение класса
// Мы определяем класс с помощью ключевого слова class

class User {  // User имя класса

    // Поля или переменные,
    // которые содержат некоторые данные.
    // Совокупность всех полей называют состоянием
    String fullName;
    int age;
    String email;

    // Конструктор, который в некоторых случаях можно не указывать.
    // Если в классе не определено ни одного конструктора
    // создается пустой конструктор по умолчанию,
    // который не принимает никаких параметров.
    public User(
            String fullName,
            int age,
            String email
    ) {
        this.fullName = fullName;
        this.age = age;
        this.email = email;
    }

    // Методы, которые еще можно назвать поведением
    public void getFullName(String fullName) {
        System.out.println("Полное имя персонажа: " + fullName);
    }

}
