package takeHomeAssessment.dayThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import takeHomeAssessment.dayThree.ArrayKata;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayKataTest {

    ArrayKata arrayKata;
    int[] numbers;


    @BeforeEach
    void setUp() {
     arrayKata = new ArrayKata();
     numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    }

    @Test
    public void maximumIn_returnsLargest() {
        assertEquals(10, arrayKata.maximumIn(numbers));
    }

    @Test
    public void minimumIn_returnsSmallest() {
        assertEquals(1, arrayKata.minimumIn(numbers));
    }

    @Test
    public void sumOf_returnsSum() {
        assertEquals(55, arrayKata.sumOf(numbers));
    }

    @Test
    public void sumOfEvenNumbersIn_returnsSumOfEvens() {
        assertEquals(30, arrayKata.sumOfEvenNumbersIn(numbers));
    }

    @Test
    public void sumOfOddNumbersIn_returnsSumOfOdds() {
        assertEquals(25, arrayKata.sumOfOddNumbersIn(numbers));
    }

    @Test
    public void maximumAndMinimumOf_returnsMinAndMax() {
        assertArrayEquals(new int[]{1, 10}, arrayKata.maximumAndMinimumOf(numbers));
    }

    @Test
    public void noOfOddNumbersIn_returnsCount() {
        assertEquals(5, arrayKata.noOfOddNumbersIn(numbers));
    }

    @Test
    public void noOfEvenNumbersIn_returnsCount() {
        assertEquals(5, arrayKata.noOfEvenNumbersIn(numbers));
    }

    @Test
    public void evenNumbersIn_returnsEvenArray() {
        assertArrayEquals(new int[]{2, 4, 6, 8, 10}, arrayKata.evenNumbersIn(numbers));
    }

    @Test
    public void oddNumbersIn_returnsOddArray() {
        assertArrayEquals(new int[]{1, 3, 5, 7, 9}, arrayKata.oddNumbersIn(numbers));
    }

    @Test
    public void squareNumbersIn_returnsSquareArray() {
        assertArrayEquals(new int[]{1, 4, 9}, arrayKata.squareNumbersIn(numbers));
    }
}