package takeHomeAssessment.weekOne;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckoutAppTest {

    int[] productQuantities;
    double[] productPricesPerUnit;

    @BeforeEach
    void setUp() {
        productQuantities = new int[]{2, 2};
        productPricesPerUnit = new double[]{2100.0, 550.0};
    }

    @Test
    public void calculateSubTotal_returns5300() {
        assertEquals(5300.0, CheckoutApp.calculateSubTotal(productQuantities, productPricesPerUnit, 2));
    }

    @Test
    public void calculateDiscountAmount_returns424() {
        assertEquals(424.0, CheckoutApp.calculateDiscountAmount(5300.0, 8));
    }

    @Test
    public void calculateAmountDue_returns5273() {
        assertEquals(5273.5, CheckoutApp.calculateAmountDue(5300.0, 424.0, 397.5));
    }
}