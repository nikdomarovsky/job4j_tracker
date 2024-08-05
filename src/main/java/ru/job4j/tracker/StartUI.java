package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item("Example Item");
        LocalDateTime created = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        String formattedDate = created.format(formatter);
        System.out.println("Created date: " + formattedDate);
        Item item2 = new Item();
        System.out.println(item2);
    }
}