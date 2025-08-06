package ru.job4j.loop;

public class Savings {

    public static int years(double goal, double annualDeposit, double percent) {
        int years = 0;
        double total = 0;
        do {
            total = total + annualDeposit + (total * percent / 100);
            years = years + 1;
        } while (total <= goal);
        return years;
    }
}
