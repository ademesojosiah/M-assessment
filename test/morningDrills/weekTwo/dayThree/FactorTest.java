package morningDrills.weekTwo.dayThree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FactorTest {

    @Test
    void calculateFactorsOfNumber() {
        Factor factor = new Factor();

        int[] numbers = factor.calculateFactorsOfNumber(20);

        assertEquals(5,numbers[2]);
    }

    @Test
    void calculateNumberOfFactorsOfNumber() {

        Factor factor = new Factor();
        int total = factor.calculateNumberOfFactorsOfNumber(20);

        assertEquals(5,total);
    }

    @Test
    void calculateListOfUniqueFactorsOfNumber() {
        Factor factor = new Factor();

        List<Integer> list = factor.calculateListOfUniqueOfNumber(30);

        assertEquals(List.of(2,3,5),list);
    }
}