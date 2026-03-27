package takeHomeAssessment.weekTwo.dayThree.bankApp;

import takeHomeAssessment.weekTwo.dayThree.bankApp.exceptions.BankAccountNotFoundException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bankName;
    private String bankCode;
    private List<Account> accounts;
    public Bank(String bankName, String bankCode) {
        this.bankName = bankName;
        this.accounts = new ArrayList<Account>();
        this.bankCode = bankCode;
    }

    public String getBankName() {
        return bankName;
    }

    public String getBankCode() {
        return bankCode;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void createAccount(String accountName, String pin,String accountNumber) {
        Account account = new Account(accountName, pin, accountNumber);
        addAccount(account);
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account getAccount(String accountNumber) {
        for (Account account : accounts) {
            if(account.getAccountNumber().equals(accountNumber)) return account;
        }
        throw new BankAccountNotFoundException("Account not found");
    }

    public void transfer(String sender,String pin ,String receiver, BigDecimal amount) {
        Account senderAccount = getAccount(sender);
        Account receiverAccount = getAccount(receiver);

        senderAccount.withdraw(amount,pin);
        receiverAccount.depositFromBank(amount);
    }
}
