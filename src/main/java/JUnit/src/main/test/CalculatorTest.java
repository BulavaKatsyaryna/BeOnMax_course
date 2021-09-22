import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int expected = 15;
        int result = calculator.add(10, 5);
        assertEquals(expected, result);
    }
}