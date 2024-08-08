package ru.job4j.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " автобус двигается по скоростным трассам");
    }

    @Override
    public void fuelType() {
        System.out.println(getClass().getSimpleName() + " заправляют дизелем или газом ");
    }
}
