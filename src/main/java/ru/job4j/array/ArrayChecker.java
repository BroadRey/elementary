package ru.job4j.array;

public class ArrayChecker {
    public static boolean isMono(boolean[] data) {
        boolean result = true;
        for (int i = 1; i < data.length; i++) {
            if (data[i] != data[i - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}