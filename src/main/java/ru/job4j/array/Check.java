package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean temp = data[0];
            for (boolean item : data) {
                if (temp != item) {
                    result = false;
                    return result;
                }
            }
        return result;
    }
}
