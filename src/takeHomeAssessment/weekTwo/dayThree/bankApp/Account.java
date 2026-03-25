package takeHomeAssessment.weekTwo.dayThree.bankApp;

import takeHomeAssessment.weekTwo.dayThree.bankApp.exceptions.InsufficientFundsException;
import takeHomeAssessment.weekTwo.dayThree.bankApp.exceptions.InvalidAmountException;
import takeHomeAssessment.weekTwo.dayThree.bankApp.exceptions.InvalidPinException;

import java.math.BigDecimal;
import java.util.UUID;

public class Account {
    private BigDecimal balance;
    private String pin;
    private String accountNumber;
    private String accountName;

    public Account(String pin) {
        this.pin = pin;
        this.balance = new BigDecimal(0);
        this.accountNumber = UUID.randomUUID().toString();
    }

    public Account(String name ,String pin, String accountNumber) {
       this.accountName = name;
        this.pin = pin;
        this.accountNumber = accountNumber;
        this.balance = new BigDecimal(0);
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(BigDecimal amount, String pin) {
        validate(pin);
        validate(amount);
        this.balance = this.balance.add(amount);
    }

    public void depositFromBank(BigDecimal amount) {
        validate(amount);
        this.balance = this.balance.add(amount);
    }

    private void validate(BigDecimal amount) {
        if (amount.compareTo(BigDecimal.ZERO) < 0) throw new InvalidAmountException("Invalid amount");
    }

    private void validate(String pin) {
        if(!this.pin.equals(pin)) throw new InvalidPinException("Invalid pin");
    }

    public void withdraw(BigDecimal amount, String pin) {
        validate(pin);
        validate(amount);
        validateBalance(amount);
        this.balance = this.balance.subtract(amount);
    }

    private void validateBalance(BigDecimal amount) {
        if (this.balance.compareTo(amount) < 0) throw new InsufficientFundsException("Insufficient funds");
    }

    public void changePin(String newPin, String oldPin) {
        validate(oldPin);
        this.pin = newPin;
    }
}
