import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalculatorTest {

    @Test
    public void add() {
        Calculator calculator = new Calculator();
        double expected = 15;
        double result = calculator.add(10, 5);
        assertEquals(expected, result, 0.000001);
    }

    @Test
    public void when5AddTo10AsStringThenResult15() {
        Calculator calculator = new Calculator();
        double expected = 15;
        double result = calculator.add("10", "5");
        assertEquals(expected, result, 0.000001);
    }

    @Test(expected = Exception.class)
    public void whenInputIncorrectValueThenThrowException() {
        Calculator calculator = new Calculator();
            calculator.add("dhmd", "5");
    }

}