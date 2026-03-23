package takeHomeAssessment.weekOne;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PizzaWahalaTest {



    @Test
    public void calculateOrder45Odogwu_return4Boxes3Left() {
        int[] result = PizzaWahala.calculateOrder(45, "Odogwu");
        assertEquals(4, result[0]);
        assertEquals(3, result[1]);
        assertEquals(20800, result[2]);
    }

    @Test
    public void calculateOrder45BigBoys_returns6Boxes3LeftOver24000() {
        int[] result = PizzaWahala.calculateOrder(45, "Big boys");
        assertEquals(6, result[0]);
        assertEquals(3, result[1]);
        assertEquals(24000, result[2]);
    }

    @Test
    public void calculateOrder45SmallMoney_returns8Boxes3LeftOver23200() {
        int[] result = PizzaWahala.calculateOrder(45, "Small Money");
        assertEquals(8, result[0]);
        assertEquals(3, result[1]);
        assertEquals(23200, result[2]);
    }

    @Test
    public void calculateOrder45SapaSize_returns12Boxes3LeftOver30000() {
        int[] result = PizzaWahala.calculateOrder(45, "Sapa size");
        assertEquals(12, result[0]);
        assertEquals(3, result[1]);
        assertEquals(30000, result[2]);
    }
}