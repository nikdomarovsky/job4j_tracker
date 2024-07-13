package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Привет" + eng;
    }

    public static void main(String[] args) {
        DummyDic people = new DummyDic();
        String end = people.engToRus("");
        System.out.println("Человек говорит: " + end);
    }
}
