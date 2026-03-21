package take_home_assessment.dayThree;

import java.util.Scanner;

public class CreditCardValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hello, Kindly Enter Card details to verify: ");
        String cardNumber = scanner.nextLine();

        System.out.println("**************************************************");
        System.out.println("**Credit Card Type: " + getCardType(cardNumber));
        System.out.println("**Credit Card Number: " + cardNumber);
        System.out.println("**Credit Card Digit Length: " + cardNumber.length());
        System.out.println("**Credit Card Validity Status: " + (isValidCreditCard(cardNumber) ? "Valid" : "Invalid"));
        System.out.println("**************************************************");

        scanner.close();
    }

    private static boolean hasValidLength(String cardNumber) {
        return cardNumber.length() >= 13 && cardNumber.length() <= 16;
    }

    private static String getCardType(String cardNumber) {
        if (!hasValidLength(cardNumber)) {
            return "Invalid Card";
        }

        if (cardNumber.startsWith("37")) {
            return "American Express";
        } else if (cardNumber.startsWith("4")) {
            return "Visa";
        } else if (cardNumber.startsWith("5")) {
            return "MasterCard";
        } else if (cardNumber.startsWith("6")) {
            return "Discover";
        } else {
            return "Invalid Card";
        }
    }

    private static int[] convertCardNumberToIntegerArray(String cardNumber) {
        int[] digitArray = new int[cardNumber.length()];
        for (int i = 0; i < cardNumber.length(); i++) {
            digitArray[i] = Integer.parseInt(String.valueOf(cardNumber.charAt(i)));
        }
        return digitArray;
    }

    private static int getSumOfDoubledSecondDigitsFromRightToLeft(int[] digitArray) {
        int sumOfDoubledEvenPositionDigits = 0;
        int n = digitArray.length - 2;
        while(n >= 0){
            int doubleValue =  digitArray[n] * 2;
            if(doubleValue > 9){
                doubleValue = (doubleValue / 10) + (doubleValue % 10);
            }
            sumOfDoubledEvenPositionDigits += doubleValue;
            n -= 2;
        }
        return sumOfDoubledEvenPositionDigits;
    }

    private static int getSumOfOddPositionDigitsFromRightToLeft(int[] digitArray) {
        int sumOfOddPositionDigits = 0;
        int n = digitArray.length - 1;
        while(n >= 0){
            int oddValue = digitArray[n];
            sumOfOddPositionDigits += oddValue;
            n -= 2;
        }
        return sumOfOddPositionDigits;
    }

    private static boolean isValidCreditCard(String cardNumber) {
        if (!hasValidLength(cardNumber)) {
            return false;
        }

        int[] digitArray = convertCardNumberToIntegerArray(cardNumber);

        int totalSum = getSumOfDoubledSecondDigitsFromRightToLeft(digitArray)
                     + getSumOfOddPositionDigitsFromRightToLeft(digitArray);

        return totalSum % 10 == 0;
    }
}