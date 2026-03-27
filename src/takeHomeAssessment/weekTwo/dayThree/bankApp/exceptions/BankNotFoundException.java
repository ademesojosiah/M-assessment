package takeHomeAssessment.weekTwo.dayThree.bankApp.exceptions;

public class BankNotFoundException extends RuntimeException {
  public BankNotFoundException(String message) {
    super(message);
  }
}
