package ru.job4j.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " поезд передвигается по рельсапоезд передвигается по рельса");
    }

    @Override
    public void fuelType() {
        System.out.println(getClass().getSimpleName() + " заправляют дизелем или электричеством");
    }
}
