package takeHomeAssessment.dayThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditCardValidatorTest {

    @Test
    public void cardType_returnsVisa() {
        assertEquals("Visa", CreditCardValidator.getCardType("4388576018410707"));
    }


    @Test
    public void cardType_returnsInvalidCard() {
        assertEquals("Invalid Card", CreditCardValidator.getCardType("123"));
    }

    @Test
    public void isValidCreditCard_returnsTrue() {
        assertTrue(CreditCardValidator.isValidCreditCard("4388576018410707"));
    }

    @Test
    public void isValidCreditCard_returnsFalse() {
        assertFalse(CreditCardValidator.isValidCreditCard("4388576018402626"));
    }

}