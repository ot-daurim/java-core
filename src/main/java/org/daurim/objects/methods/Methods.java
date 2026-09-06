package org.daurim.objects.methods;

public class Methods {
    public static void main(String[] args) {
        User user_001 = new User("Johnny Silverhand", 32);
        user_001.printName();  // Вызов метода



    }
}

class User {
    private final String fullName;
    private final int age;

    public User(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // Определяем метод
    public void printName() { // Где public - это модификатор доступа,
                              // а void говорит о том, что метод ничего не возращает
                              // printName - это имя метода. В () можем передавать некоторые параметры.

        System.out.println("My name is " + fullName  + ". I am "  + age + " years old");

        printComment(); // Методы могут вызывать другие методы класса
    }

    public void printComment() {
        System.out.println("Johnny Silverhand, a legend of Night City");
    }
}

