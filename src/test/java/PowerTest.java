import org.example.operations.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PowerTest {

    @Test
    void testPositiveExponent() {
        assertEquals(8, Power.power(2, 3));
    }

    @Test
    void testZeroExponent() {
        assertEquals(1, Power.power(5, 0));
    }

    @Test
    void testExponentOne() {
        assertEquals(7, Power.power(7, 1));
    }

    @Test
    void testNegativeExponent() {
        assertEquals(0.25, Power.power(2, -2), 1e-9);
    }

    @Test
    void testZeroBase() {
        assertEquals(0, Power.power(0, 5));
    }

    @Test
    void testZeroBaseZeroExponent() {
        assertEquals(1, Power.power(0, 0)); // convenzione matematica
    }

    @Test
    void testDecimalBaseAndExponent() {
        assertEquals(Math.pow(2.5, 3.2), Power.power(2.5, 3.2), 1e-9);
    }
}
