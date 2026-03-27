package takeHomeAssessment.weekTwo.dayThree.bankApp;

import takeHomeAssessment.weekTwo.dayThree.bankApp.exceptions.BankException;
import takeHomeAssessment.weekTwo.dayThree.bankApp.exceptions.BankNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class Banks {
    private List<Bank> banks;

    public Banks() {
        banks = new ArrayList<Bank>();
    }

    public void addBank(Bank bank) {
        if(bankExists(bank)) {
            throw new BankException("Bank Already exists");
        }
        banks.add(bank);
    }

    public int getBankCount() {
        return banks.size();
    }

    public void removeBank(Bank bank) {
        if(!bankExists(bank.getBankCode(), bank.getBankName())) {
            throw new BankNotFoundException("Bank not found");
        }
        banks.remove(bank);
    }


    public boolean isEmpty() {
        return banks.isEmpty();
    }

    public boolean bankExists(Bank b) {
        for (Bank bank : banks) {
            if(bank.getBankCode().equals(b.getBankCode()) || bank.getBankName().equals(b.getBankName())) {
                return true;
            }
        }
        return false;
    }

    public boolean bankExists(String bankCode, String bankName) {
        for (Bank bank : banks) {
            if(bank.getBankCode().equals(bankCode) && bank.getBankName().equals(bankName)) {
                return true;
            }
        }
        return false;
    }

    public Bank getBank(String bankCode) {
        for (Bank bank : banks) {
            if(bank.getBankCode().equals(bankCode)) {
                return bank;
            }
        }
        throw new BankNotFoundException("Bank not found");
    }

}
