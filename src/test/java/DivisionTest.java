import org.example.operations.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    void testDividePositiveNumbers() {
        assertEquals(2, Division.divide(6, 3));
    }

    @Test
    void testDivideNegativeNumbers() {
        assertEquals(2, Division.divide(-6, -3));
    }

    @Test
    void testDividePositiveAndNegative() {
        assertEquals(-3, Division.divide(9, -3));
    }

    @Test
    void testDivideWithDecimals() {
        assertEquals(0.5, Division.divide(1.0, 2.0), 1e-9);
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Division.divide(5, 0);
        });
        assertEquals("Divisione per zero non permessa", exception.getMessage());
    }
}
