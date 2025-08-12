package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter = counter + 1;
            } else if (input.charAt(i) != symbol && counter == 1) {
                result = result + symbol;
                symbol = input.charAt(i);
            } else {
                result = result + symbol + counter;
                symbol = input.charAt(i);
                counter = 1;

            }
            if (i == input.length() - 1 && counter == 1) {
                result = result + symbol;
            } else if (i == input.length() - 1) {
                result = result + symbol + counter;
            }
        }
        return result;
    }
}
