package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int term = 0;

        for (int index = 0; index < array.length / 2; index++) {
            term = array[index];
            array[index] = array[array.length - 1 - index];
            array[array.length - 1 - index] = term;
        }

        return array;
    }
}