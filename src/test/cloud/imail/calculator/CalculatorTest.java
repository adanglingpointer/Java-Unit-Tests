package cloud.imail.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void canAddZeroPlusZero() {
        Calculator calc = new Calculator();
        int sum = calc.add(0, 0);
        assertEquals(0, sum, "was expecting sum of 0");
    }

    @Test
    public void canAddOnePlusOne() {
        Calculator calc = new Calculator();
        int sum = calc.add(1, 1);
        assertEquals(2, sum);
    }
}
