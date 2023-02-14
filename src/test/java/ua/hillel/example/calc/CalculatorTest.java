package ua.hillel.example.calc;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeAll
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void addTest_success() {
        double a = 10;
        double b = 20;
        double expected = 30;
        double actual = calculator.add(a, b);

        assert expected == actual;
    }


    @Test
    public void subtractTest_success() {
        double a = 10;
        double b = 20;
        double expected = -10;
        double actual = calculator.subtract(a, b);

        assert expected == actual;
    }
}
