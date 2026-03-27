package takeHomeAssessment.weekTwo.dayThree.bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    Bank gtBank;

    @BeforeEach
    void setUp() {
        gtBank = new Bank("GTB","058");
    }

    @Test
    public void newBank_emptyListOfAccountsTest(){
        assertTrue(gtBank.getAccounts().isEmpty());

    }

    @Test
    public void createAccount_bankAccountsNotEmptyTest(){
        assertTrue(gtBank.getAccounts().isEmpty());

        String accountNumber = UUID.randomUUID().toString();

        gtBank.createAccount("josiah","1233",accountNumber);

        assertFalse(gtBank.getAccounts().isEmpty());
    }

    @Test
    public void findAccount_returnsAccountTest(){
        assertTrue(gtBank.getAccounts().isEmpty());

        String accountNumber1 = UUID.randomUUID().toString();

        gtBank.createAccount("josiah","1233",accountNumber1);

        String accountNumber2 = UUID.randomUUID().toString();
        gtBank.createAccount("silas", "2222", accountNumber2);

        assertFalse(gtBank.getAccounts().isEmpty());

        assertEquals(accountNumber1 ,gtBank.getAccount(accountNumber1).getAccountNumber());
    }

    @Test
    public void transfer5kMoney_recieverAccountBalanceIs5kTest(){
        assertTrue(gtBank.getAccounts().isEmpty());

        String accountNumber1 = UUID.randomUUID().toString();

        Account account = new Account("josiah","1233",accountNumber1);

        account.deposit(BigDecimal.valueOf(10_000),"1233");
        gtBank.addAccount(account);

        String accountNumber2 = UUID.randomUUID().toString();
        gtBank.createAccount("silas", "2222", accountNumber2);

        assertFalse(gtBank.getAccounts().isEmpty());


        gtBank.transfer(accountNumber1,"1233",accountNumber2,BigDecimal.valueOf(5000));

        assertEquals( BigDecimal.valueOf(5000),gtBank.getAccount(accountNumber2).getBalance());



    }


    @Test
    public void transfer5kMoney_senderAccountBalanceIs5kTest(){
        assertTrue(gtBank.getAccounts().isEmpty());

        String accountNumber1 = UUID.randomUUID().toString();

        Account account = new Account("josiah","1233",accountNumber1);

        account.deposit(BigDecimal.valueOf(10_000),"1233");
        gtBank.addAccount(account);

        String accountNumber2 = UUID.randomUUID().toString();
        gtBank.createAccount("silas", "2222", accountNumber2);

        assertFalse(gtBank.getAccounts().isEmpty());


        gtBank.transfer(accountNumber1,"1233",accountNumber2,BigDecimal.valueOf(5000));

        assertEquals( BigDecimal.valueOf(5000),gtBank.getAccount(accountNumber1).getBalance());



    }
}