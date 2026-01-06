import org.example.operations.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {

    @Test
    void testMultiplyPositiveNumbers() {
        assertEquals(15, Multiplication.multiply(5, 3));
    }

    @Test
    void testMultiplyNegativeNumbers() {
        assertEquals(24, Multiplication.multiply(-4, -6));
    }

    @Test
    void testMultiplyPositiveAndNegative() {
        assertEquals(-14, Multiplication.multiply(7, -2));
    }

    @Test
    void testMultiplyWithZero() {
        assertEquals(0, Multiplication.multiply(0, 9));
        assertEquals(0, Multiplication.multiply(9, 0));
    }

    @Test
    void testMultiplyDecimals() {
        assertEquals(8.0, Multiplication.multiply(2.5, 3.2), 1e-9);
    }
}
