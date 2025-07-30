package ru.job4j.converter;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert180RblThen2Euro() {
        float input = 180;
        float expected = 2;
        float output = (float) Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert180RblThen3dot4Dollar() {
        float input = 180;
        float expected = 2.4f;
        float output = (float) Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert300RblThen3dot3333Euro() {
        float input = 300;
        float expected = 3.3333f;
        float output = (float) Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert150RblThen2Dollar() {
        float input = 150;
        float expected = 2;
        float output = (float) Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}