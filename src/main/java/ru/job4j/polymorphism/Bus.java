package ru.job4j.polymorphism;

import ru.job4j.tracker.Tracker;

public class Bus implements Transport {

    @Override
    public void move() {
        System.out.println("Движение автобуса");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Количество пассажиров" + count);
    }

    @Override
    public int refuel(int fuel) {
        int cost = fuel * 70;
        System.out.println("Не хватает литров бензина " + fuel + "Стоимость выйдет " + cost);
        return cost;
    }
}
