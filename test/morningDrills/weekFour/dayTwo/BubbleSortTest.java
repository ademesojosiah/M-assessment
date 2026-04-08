package morningDrills.weekFour.dayTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    private BubbleSort bubbleSort;

    @BeforeEach
    void setUp() {
        bubbleSort = new BubbleSort();
    }

    @Test
    void sort_normalUnsortedArray_returnsSorted() {
        int[] input    = {5, 3, 1, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, bubbleSort.sort(input));
    }

    @Test
    void sort_alreadySortedArray_returnsSameOrder() {
        int[] input    = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, bubbleSort.sort(input));
    }
}