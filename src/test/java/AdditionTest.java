import org.example.operations.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @Test
    void testAddPositiveNumbers() {
        double result = Addition.add(5, 3);
        assertEquals(8, result, "5 + 3 dovrebbe essere 8");
    }

    @Test
    void testAddNegativeNumbers() {
        double result = Addition.add(-4, -6);
        assertEquals(-10, result, "-4 + -6 dovrebbe essere -10");
    }

    @Test
    void testAddPositiveAndNegative() {
        double result = Addition.add(7, -2);
        assertEquals(5, result, "7 + -2 dovrebbe essere 5");
    }

    @Test
    void testAddWithZero() {
        double result = Addition.add(0, 9);
        assertEquals(9, result, "0 + 9 dovrebbe essere 9");

        result = Addition.add(9, 0);
        assertEquals(9, result, "9 + 0 dovrebbe essere 9");
    }

    @Test
    void testAddDecimals() {
        double result = Addition.add(2.5, 3.2);
        assertEquals(5.7, result, 1e-9, "2.5 + 3.2 dovrebbe essere 5.7");
    }
}

