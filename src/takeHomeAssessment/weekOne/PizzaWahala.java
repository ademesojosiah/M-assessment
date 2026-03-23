package takeHomeAssessment.weekOne;

import java.util.Scanner;

public class PizzaWahala {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of guests: ");
        double numberOfGuests = scanner.nextInt();

        System.out.println("Enter pizza type (Sapa size / Small Money / Big boys / Odogwu): ");
        scanner.nextLine();
        String pizzaType = scanner.nextLine();

        int[] orderResult = calculateOrder(numberOfGuests, pizzaType);

        System.out.println("---------- Order Summary ----------");
        System.out.println("Number of boxes to buy : " + orderResult[0] + " boxes");
        System.out.println("Left over slices       : " + orderResult[1] + " slices");
        System.out.println("Total price            : " + orderResult[2]);

        scanner.close();
    }


    public static int[] calculateOrder(double numberOfGuests,String pizzaType) {
        int slicesPerBox;
        int pricePerBox;

        switch (pizzaType.toLowerCase()) {
            case "sapa size":
                slicesPerBox = 4;
                pricePerBox = 2500;
                break;
            case "small money":
                slicesPerBox = 6;
                pricePerBox = 2900;
                break;
            case "big boys":
                slicesPerBox = 8;
                pricePerBox = 4000;
                break;
            case "odogwu":
                slicesPerBox = 12;
                pricePerBox = 5200;
                break;
            default:
                System.out.println("Invalid pizza type!");
                return null;
        }

        int numberOfBoxes = (int) Math.ceil( numberOfGuests / slicesPerBox);
        int totalSlices = numberOfBoxes * slicesPerBox;
        int leftOverSlices = (int)  (totalSlices - numberOfGuests);
        int totalPrice = numberOfBoxes * pricePerBox;

        return new int[]{numberOfBoxes, leftOverSlices,totalPrice};
    }
}
