package ru.job4j.calculator;

public class Fit {
    /**
     * Formula for man's weight: (height in cm - 100) * 1.15
     */
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    /**
     * Formula for woman's weight: (height in cm - 110) * 1.15
     */
    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 cm is " + man + " kg");
    }
}
