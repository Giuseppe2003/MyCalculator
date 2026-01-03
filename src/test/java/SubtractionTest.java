import org.example.operations.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {

    @Test
    void testSubtractPositiveNumbers() {
        assertEquals(2, Subtraction.subtract(5, 3));
    }

    @Test
    void testSubtractNegativeNumbers() {
        assertEquals(2, Subtraction.subtract(-4, -6));
    }

    @Test
    void testSubtractPositiveAndNegative() {
        assertEquals(9, Subtraction.subtract(7, -2));
    }

    @Test
    void testSubtractWithZero() {
        assertEquals(-9, Subtraction.subtract(0, 9));
        assertEquals(9, Subtraction.subtract(9, 0));
    }

    @Test
    void testSubtractDecimals() {
        assertEquals(-0.7, Subtraction.subtract(2.5, 3.2), 1e-9);
    }
}
