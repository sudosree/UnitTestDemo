import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator;

    /**
     * set up test environment
     */
    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        Assertions.assertEquals(5, calculator.add(2,3));
        Assertions.assertEquals(6, calculator.add(3,3));
        Assertions.assertEquals(14, calculator.add(8,6));
    }
}
