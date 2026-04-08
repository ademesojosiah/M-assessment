package morningDrills.weekFour.dayTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTest {

    private Divide divide;

    @BeforeEach
    void setUp() {
        divide = new Divide();
    }


    @Test
    void divide_positiveDividendAndDivisor_returnsCorrectQuotient() {
        assertEquals(3, divide.divide(9, 3));
    }

    @Test
    void divide_dividendSmallerThanDivisor_returnsZero() {
        assertEquals(0, divide.divide(2, 5));
    }

    @Test
    void divide_dividendEqualsZero_returnsZero() {
        assertEquals(0, divide.divide(0, 5));
    }

    @Test
    void divide_dividendEqualsDivisor_returnsOne() {
        assertEquals(1, divide.divide(7, 7));
    }

    @Test
    void divide_negativeDividend_returnsNegativeQuotient() {
        assertEquals(-3, divide.divide(-9, 3));
    }

    @Test
    void divide_dividendIsOne_returnsZeroOrOne() {
        assertEquals(0, divide.divide(1, 5));
        assertEquals(1, divide.divide(1, 1));
    }

    @Test
    void divide_largeNumbers_returnsCorrectQuotient() {
        assertEquals(100, divide.divide(1000, 10));
    }

    // ⚠️ BUG TEST — will expose infinite loop
    @Test
    void divide_divisorIsZero_shouldThrowException() {
        assertThrows(ArithmeticException.class, () -> {
            divide.divide(10, 0);
        });
    }

}