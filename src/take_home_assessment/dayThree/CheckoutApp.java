package take_home_assessment.dayThree;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CheckoutApp {

    static final double VAT_PERCENTAGE = 7.5;
    static final String STORE_NAME = "SEMICOLON STORES";
    static final String STORE_BRANCH = "MAIN BRANCH";
    static final String STORE_LOCATION = "LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.";
    static final String STORE_TELEPHONE = "TEL: 03293828343";
    static final String DIVIDER_EQUALS = "====================================================";
    static final String DIVIDER_DASHES = "----------------------------------------------------";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the customer's Name: ");
        String customerName = scanner.nextLine();

        String[] productNames = new String[50];
        int[] productQuantities = new int[50];
        double[] productPricesPerUnit = new double[50];
        int totalNumberOfProducts = 0;

        String addMoreItemsResponse = "yes";

        while (addMoreItemsResponse.equalsIgnoreCase("yes")) {
            System.out.print("What did the user buy? ");
            productNames[totalNumberOfProducts] = scanner.nextLine();

            System.out.print("How many pieces? ");
            productQuantities[totalNumberOfProducts] = scanner.nextInt();

            System.out.print("How much per unit? ");
            productPricesPerUnit[totalNumberOfProducts] = scanner.nextDouble();
            scanner.nextLine();

            totalNumberOfProducts++;

            System.out.print("Add more Items? ");
            addMoreItemsResponse = scanner.nextLine();
        }

        System.out.print("What is your name? ");
        String cashierName = scanner.nextLine();

        System.out.print("How much discount will he get? ");
        double discountPercentage = scanner.nextDouble();

        double subTotal = calculateSubTotal(productQuantities, productPricesPerUnit, totalNumberOfProducts);
        double discountAmount = calculateDiscountAmount(subTotal, discountPercentage);
        double vatAmount = calculateVatAmount(subTotal);
        double amountDue = calculateAmountDue(subTotal, discountAmount, vatAmount);



        printInvoice(customerName, cashierName, productNames, productQuantities,
                productPricesPerUnit, totalNumberOfProducts,
                subTotal, discountAmount, vatAmount, amountDue);
        System.out.println(DIVIDER_EQUALS);
        System.out.println("THIS IS NOT A RECEIPT KINDLY PAY " + amountDue);
        System.out.println(DIVIDER_EQUALS);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.print("How much did the customer give to you? ");
        double amountPaidByCustomer = scanner.nextDouble();
        double balanceToReturnToCustomer = amountPaidByCustomer - amountDue;

        printInvoice(customerName, cashierName, productNames, productQuantities,
                productPricesPerUnit, totalNumberOfProducts,
                subTotal, discountAmount, vatAmount, amountDue);
        printPaymentSummary(amountPaidByCustomer, balanceToReturnToCustomer);

        scanner.close();
    }

    private static double calculateSubTotal(int[] productQuantities, double[] productPricesPerUnit, int totalNumberOfProducts) {
        double subTotal = 0;
        for (int i = 0; i < totalNumberOfProducts; i++) {
            subTotal += productQuantities[i] * productPricesPerUnit[i];
        }
        return subTotal;
    }

    private static double calculateDiscountAmount(double subTotal, double discountPercentage) {
        return subTotal * discountPercentage / 100;
    }

    private static double calculateVatAmount(double subTotal) {
        return subTotal * VAT_PERCENTAGE / 100;
    }

    private static double calculateAmountDue(double subTotal, double discountAmount, double vatAmount) {
        return subTotal - discountAmount + vatAmount;
    }

    private static String getCurrentDateAndTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMM-yy h:mm:ss a");
        return LocalDateTime.now().format(dateTimeFormatter);
    }

    private static void printInvoice(String customerName, String cashierName,
                                     String[] productNames, int[] productQuantities,
                                     double[] productPricesPerUnit, int totalNumberOfProducts,
                                     double subTotal, double discountAmount,
                                     double vatAmount, double amountDue) {

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(STORE_NAME);
        System.out.println(STORE_BRANCH);
        System.out.println(STORE_LOCATION);
        System.out.println(STORE_TELEPHONE);
        System.out.println("Date : " + getCurrentDateAndTime());
        System.out.println("Cashier: " + cashierName);
        System.out.println("Customer Name: " + customerName);
        System.out.println(DIVIDER_EQUALS);
        System.out.println("        ITEM        QTY       PRICE     TOTAL(NGN)");
        System.out.println(DIVIDER_DASHES);

        for (int i = 0; i < totalNumberOfProducts; i++) {
            double totalPricePerProduct = productQuantities[i] * productPricesPerUnit[i];
        System.out.println( "      " + productNames[i] + "           " +productQuantities[i] + "     " +productPricesPerUnit[i] + "     " + totalPricePerProduct);
        }

        System.out.println(DIVIDER_DASHES);
        System.out.println("                    Sub Total:      " + subTotal);
        System.out.println("                     Discount:      " + discountAmount);
        System.out.println("                  VAT @ " + VAT_PERCENTAGE + "%:      " + vatAmount);
        System.out.println(DIVIDER_EQUALS);
        System.out.println("                   Bill Total:      " + amountDue);
    }

    private static void printPaymentSummary(double amountPaidByCustomer, double balanceToReturnToCustomer) {
        System.out.println("                  Amount Paid:      " + amountPaidByCustomer);
        System.out.println("                     Balance:      " + balanceToReturnToCustomer);
        System.out.println(DIVIDER_EQUALS);
        System.out.println("         THANK YOU FOR YOUR PATRONAGE");
        System.out.println(DIVIDER_EQUALS);
    }
}