package ua.hillel.example.calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void addTest_success() {
        double a = 10;
        double b = 20;
        double expected = 30;
        double actual = calculator.add(a, b);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void subtractTest_success() {
        double a = 10;
        double b = 20;
        double expected = -10;
        double actual = calculator.subtract(a, b);

        Assertions.assertEquals(expected, actual);
    }
}
