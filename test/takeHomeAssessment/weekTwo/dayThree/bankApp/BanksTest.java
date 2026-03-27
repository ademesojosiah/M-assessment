package takeHomeAssessment.weekTwo.dayThree.bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import takeHomeAssessment.weekTwo.dayThree.bankApp.exceptions.BankException;
import takeHomeAssessment.weekTwo.dayThree.bankApp.exceptions.BankNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class BanksTest {

    Banks banks;

    @BeforeEach
    void setUp() {
        banks = new Banks();
    }

    @Test
    void newBanks_returnsIsEmptyTrueTest() {
        assertTrue(banks.isEmpty());
    }

    @Test
    void addBankToBanks_returnsIsEmptyFalseTest() {
        assertTrue(banks.isEmpty());
        Bank gtBank = new Bank("GTB","058");
        banks.addBank(gtBank);
        assertFalse(banks.isEmpty());
    }

    @Test
    void removeBankFromBanks_returnsIsEmptyTrueTest() {
        assertTrue(banks.isEmpty());


        banks.addBank(new Bank("GTB","058"));
        banks.removeBank(new Bank("GTB","058"));
        assertFalse(banks.isEmpty());
    }

    @Test
    void removeBankThatDoesNotExistsFromBanks_throwsBankExceptionTest() {
        assertTrue(banks.isEmpty());
        banks.addBank(new Bank("GTB","058"));
        assertThrows(BankNotFoundException.class,()->banks.removeBank(new Bank("Access","058")));

    }
    @Test
    void addBankThatAlreadyExists_throwsBankAlreadyExistsException() {
        assertTrue(banks.isEmpty());

        Bank gtBank = new Bank("GTB","058");
        banks.addBank(gtBank);

        assertFalse(banks.isEmpty());

        Bank access = new Bank("GTB","058");
        assertThrows(BankException.class,()-> banks.addBank(access));


    }


    @Test
    void addTwoBankToBanks_returnTwoAsBankSizeTest(){
        assertTrue(banks.isEmpty());
        Bank gtBank = new Bank("GTB","058");
        banks.addBank(gtBank);

        Bank access = new Bank("Access Bank Plc","044");
        banks.addBank(access);

        assertFalse(banks.isEmpty());

        assertEquals(2,banks.getBankCount());

    }

    @Test
    void addTwoBankToBanks_removeOneBank_banksCountReturnsOneTest(){
        assertTrue(banks.isEmpty());
        Bank gtBank = new Bank("GTB","058");
        banks.addBank(gtBank);

        Bank access = new Bank("Access Bank Plc","044");
        banks.addBank(access);

        assertFalse(banks.isEmpty());

        assertEquals(2,banks.getBankCount());

        banks.removeBank(access);

        assertEquals(1,banks.getBankCount());
    }

    @Test
    void addBankToBanks_getBank_returnsBankAddedTest(){
        assertTrue(banks.isEmpty());
        Bank gtBank = new Bank("GTB","058");
        banks.addBank(gtBank);

        Bank access = new Bank("Access Bank Plc","044");
        banks.addBank(access);

        assertFalse(banks.isEmpty());

        assertEquals(2,banks.getBankCount());

        assertEquals(access.getBankCode(), banks.getBank(access.getBankCode()).getBankCode() );
        assertEquals(access.getBankName(), banks.getBank(access.getBankCode()).getBankName() );
    }



}