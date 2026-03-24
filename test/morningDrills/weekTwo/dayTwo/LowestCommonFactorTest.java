package morningDrills.weekTwo.dayTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LowestCommonFactorTest {


    LowestCommonFactor lowestCommonFactor;

    @BeforeEach
    void setUp() {
        lowestCommonFactor = new LowestCommonFactor();
    }

    @Test
    public void testLowestCommonFactor_with50_20_30_returns300() {
        int LCM = lowestCommonFactor.calculateLowestCommonFactor(50,20,30);

        assertEquals(300,LCM);
    }


    @Test
    public void testLowestCommonFactor_with12_18_returns36() {
        int LCM = lowestCommonFactor.calculateLowestCommonFactor(12,18);

        assertEquals(36,LCM);
    }

    @Test
    public void testLowestCommonFactor_withInvalidNumber() {
        assertThrows(ArithmeticException.class,()-> lowestCommonFactor.calculateLowestCommonFactor(12,18,0));

    }


}
