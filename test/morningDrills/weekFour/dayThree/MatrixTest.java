package morningDrills.weekFour.dayThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    private Matrix matrix;

    @BeforeEach
    void setUp() {
        matrix = new Matrix();
    }

    @Test
    void sum_bugExposure_firstRowUsedForSum_not_secondRow() {
        int[][] magicSquare = {
                {2, 7, 6},
                {9, 5, 1},
                {4, 3, 8}
        };
        assertTrue(matrix.sum(magicSquare));
    }

    @Test
    void sum_bugExposure_wrongRowForSumCalculation() {

        int[][] magicSquare = {
                {2, 7, 6},
                {1, 2, 3},
                {4, 3, 8}
        };
        assertFalse(matrix.sum(magicSquare));
    }

    @Test
    void sum_bugExposure_diagonalRecalculatedInsideLoop() {
        int[][] magicSquare = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}
        };
        assertTrue(matrix.sum(magicSquare));
    }

}