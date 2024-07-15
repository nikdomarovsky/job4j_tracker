package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        switch (position) {
            case 1 -> System.out.println("Пусть бегут неуклюже");
            case 2 -> System.out.println("Спокойной ночи");
            default -> System.out.println("Песня не найдена");
        }

    }

    public static void main(String[] args) {
        Jukebox musicbox = new Jukebox();
        musicbox.music(1);
        musicbox.music(2);
        musicbox.music(3);
    }

}
