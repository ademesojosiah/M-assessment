package takeHomeAssessment.dayThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import takeHomeAssessment.dayThree.Kata;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {

    Kata kata;

    @BeforeEach
    void setUp() {
        kata = new Kata();
    }

    @Test
    public void isEven_returnsTrue() {
        assertTrue(kata.isEven(4));
    }

    @Test
    public void isEven_returnsFalse() {
        assertFalse(kata.isEven(3));
    }

    @Test
    public void isPrimeNumber_returnsTrue() {
        assertTrue(kata.isPrimeNumber(7));
    }

    @Test
    public void isPrimeNumber_returnsFalse() {
        assertFalse(kata.isPrimeNumber(10));
    }

    @Test
    public void subtract_7And3_returns4() {
        assertEquals(4, kata.subtract(7, 3));
    }

    @Test
    public void divide_returnsValidResult() {
        assertEquals(2.5f, kata.divide(5, 2));
    }

    @Test
    public void factorOf_number10_returns4() {
        assertEquals(4, kata.factorOf(10));
    }

    @Test
    public void isSquare_returnsTrue() {
        assertTrue(kata.isSquare(25));
    }


    @Test
    public void isPalindrome_returnsTrue() {
        assertTrue(kata.isPalindrome(54145));
    }

    @Test
    public void isPalindrome_returnsFalse() {
        assertFalse(kata.isPalindrome(12345));
    }

    @Test
    public void factorialOf5_returns120() {
        assertEquals(120, kata.factorialOf(5));
    }

    @Test
    public void squareOf5_returns25() {
        assertEquals(25, kata.squareOf(5));
    }
}