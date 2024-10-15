package ru.job4j.oop;

public class OverloadRunner {
    public int print(String name, int age, boolean allow) {
        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        System.out.println("Your allow: " + allow);
        return age;
    }
}