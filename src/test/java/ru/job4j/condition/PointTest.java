package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints00And20Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2.0;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
        Point a = new Point(-1, -1);
        Point b = new Point(1, 1);
        double expected = 2.83;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        Point a = new Point(-2, -2);
        Point b = new Point(2, 2);
        double expected = 5.66;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints0And2And2AndMinus5Then5Dot66() {
        Point a = new Point(0, 2);
        Point b = new Point(2, -5);
        double expected = 7.28;
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}