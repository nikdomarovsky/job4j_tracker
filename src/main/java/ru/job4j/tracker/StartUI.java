package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            showMenu();
            System.out.print("Выбрать: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select != 6) {
                System.out.println("Пользователь выбрал: " + select);
            } else {
                run = false;
            }
            if (select == 0) {
                String name = input.nextLine();
                System.out.println("Вы добавили новую заявку" + name);
            }
            if (select == 1) {
                System.out.println("Все заявки:");
            }
            if (select == 2) {
                System.out.println("Введите имя заявки на которую хотите поменять");
                String name = input.nextLine();
                System.out.println("Введите новое имя заявки");
                String name2 = input.nextLine();
                System.out.println("Вы изменили заявку с" + name + " на " + name2);
            }
            if (select == 3) {
                System.out.println("Напишите заявку,которую хотите удалить");
                String name = input.nextLine();
                System.out.println("Вы успешно удалили заявку с именем " + name);
            }
            if (select == 4) {
                System.out.println("Введите id заявки");
                String name = input.nextLine();
                System.out.println(name);
            }
            if (select == 5) {
                System.out.println("Введите имя заявки");
                String name = input.nextLine();
                System.out.println(name);
            }
        }
    }

    private void showMenu() {
        String[] menu = {
                "Добавить новую заявку", "Показать все заявки", "Изменить заявку",
                "Удалить заявку", "Показать заявку по id", "Показать заявки по имени",
                "Завершить программу"
        };
        System.out.println("Меню:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}