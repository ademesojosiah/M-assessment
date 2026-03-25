package takeHomeAssessment.weekTwo.dayThree.bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import takeHomeAssessment.weekTwo.dayThree.bankApp.exceptions.InsufficientFundsException;
import takeHomeAssessment.weekTwo.dayThree.bankApp.exceptions.InvalidAmountException;
import takeHomeAssessment.weekTwo.dayThree.bankApp.exceptions.InvalidPinException;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    Account josiahAccount;
    String pin;

    @BeforeEach
    void setUp() {
        pin = "1234";
        josiahAccount = new Account(pin);
    }

    @Test
    void newAccount_balanceIsZero() {
        assertEquals(BigDecimal.ZERO,josiahAccount.getBalance());
    }

    @Test
    void deposit5k_balanceIs5Test() {
        assertEquals(BigDecimal.ZERO,josiahAccount.getBalance());

        josiahAccount.deposit(BigDecimal.valueOf(5_000),pin);

        assertEquals(BigDecimal.valueOf(5_000),josiahAccount.getBalance());
    }

    @Test
    void withdraw5kWithWrongPin_throwInvalidPinExceptionTest() {
        assertEquals(BigDecimal.ZERO,josiahAccount.getBalance());

        String wrongPin = "wrongPin";
        assertThrows(InvalidPinException.class,()-> josiahAccount.deposit(BigDecimal.valueOf(5_000),wrongPin));


        assertEquals(BigDecimal.valueOf(0),josiahAccount.getBalance());

    }

    @Test
    void deposit5kTwice_balanceIs10kTest() {
        assertEquals(BigDecimal.ZERO,josiahAccount.getBalance());
        josiahAccount.deposit(BigDecimal.valueOf(5_000),pin);
        josiahAccount.deposit(BigDecimal.valueOf(5_000),pin);
        assertEquals(BigDecimal.valueOf(10_000),josiahAccount.getBalance());
    }

    @Test
    void depositNegativeNumber_throwInvalidAmountExceptionTest() {
        assertEquals(BigDecimal.ZERO,josiahAccount.getBalance());

        josiahAccount.deposit(BigDecimal.valueOf(5_000),pin);

        assertEquals(BigDecimal.valueOf(5_000),josiahAccount.getBalance());

        assertThrows(InvalidAmountException.class,()-> josiahAccount.deposit(BigDecimal.valueOf(-5_000),pin) );

        assertEquals(BigDecimal.valueOf(5_000),josiahAccount.getBalance());

    }

    @Test
    void deposit5k_withdraw2k_balanceIs3kTest() {
        assertEquals(BigDecimal.ZERO,josiahAccount.getBalance());
        josiahAccount.deposit(BigDecimal.valueOf(5_000),pin);
        assertEquals(BigDecimal.valueOf(5_000),josiahAccount.getBalance());
        josiahAccount.withdraw(BigDecimal.valueOf(2_000),pin);
        assertEquals(BigDecimal.valueOf(3_000),josiahAccount.getBalance());
    }

    @Test
    void deposit5k_withdraw10k_throwInsufficientFundsExceptionTest() {
        assertEquals(BigDecimal.ZERO,josiahAccount.getBalance());
        josiahAccount.deposit(BigDecimal.valueOf(5_000),pin);

        assertEquals(BigDecimal.valueOf(5_000),josiahAccount.getBalance());

        assertThrows(InsufficientFundsException.class,()->josiahAccount.withdraw(BigDecimal.valueOf(10_000),pin));

        assertEquals(BigDecimal.valueOf(5_000),josiahAccount.getBalance());

    }
    @Test
    void withdrawWithWrongPin_throwInvalidPinException(){
        assertEquals(BigDecimal.ZERO,josiahAccount.getBalance());

        josiahAccount.deposit(BigDecimal.valueOf(5_000),pin);
        String wrongPin = "wrongPin";
        assertThrows(InvalidPinException.class,()->  josiahAccount.withdraw(BigDecimal.valueOf(5_000),wrongPin));

        assertEquals(BigDecimal.valueOf(5_000),josiahAccount.getBalance());
    }

    @Test
    void deposit5k_changePinAndWithdraw2k_balanceIs3kTest() {
        assertEquals(BigDecimal.ZERO,josiahAccount.getBalance());
        josiahAccount.deposit(BigDecimal.valueOf(5_000),pin);
        String newPin = "12344";
        josiahAccount.changePin(newPin,pin);

        josiahAccount.withdraw(BigDecimal.valueOf(2_000),newPin);

        assertEquals(BigDecimal.valueOf(3_000),josiahAccount.getBalance());

    }

    @Test
    void deposit5kChangePin_useWrongPinForWithdraw(){
        assertEquals(BigDecimal.ZERO,josiahAccount.getBalance());
        josiahAccount.deposit(BigDecimal.valueOf(5_000),pin);
        String newPin = "12344";
        josiahAccount.changePin(newPin,pin);

        assertThrows(InvalidPinException.class, ()-> josiahAccount.withdraw(BigDecimal.valueOf(2_000),pin));

        assertEquals(BigDecimal.valueOf(5_000),josiahAccount.getBalance());


    }

    @Test
    void withdrawNegativeNumber_throwInvalidAmountExceptionTest() {
        assertEquals(BigDecimal.ZERO,josiahAccount.getBalance());
        josiahAccount.deposit(BigDecimal.valueOf(10_000),pin);
        assertThrows(InvalidAmountException.class,()-> josiahAccount.withdraw(BigDecimal.valueOf(-5_000),pin));

        assertEquals(BigDecimal.valueOf(10_000),josiahAccount.getBalance());
    }
}