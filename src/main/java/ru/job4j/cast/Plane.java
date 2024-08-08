package ru.job4j.cast;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " поскольку самолет летает по воздуху");
    }

    @Override
    public void fuelType() {
        System.out.println(getClass().getSimpleName() + " заправляют авиационное топливо ");
    }
}
