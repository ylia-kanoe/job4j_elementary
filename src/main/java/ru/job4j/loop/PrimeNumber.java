package ru.job4j.loop;

public class PrimeNumber {

    public static int calc(int finish) {
        int count = 0;
        for (int index = 2; index <= finish; index++) {
            if (CheckPrimeNumber.check(index)) {
                count = count + 1;
            }
        }
        return count;
    }
}