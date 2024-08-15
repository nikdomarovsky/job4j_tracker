package ru.job4j.ex;

import java.security.Key;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                result = i;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Элемент не найден");
        }
        return result;
    }

    public static void main(String[] args) {
        String[] array = {"car", "home", "door" };
        String key = "home";
        try {
            int index = indexOf(array, key);
            System.out.println(index);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}