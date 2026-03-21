package take_home_assessment.dayThree;

import java.util.Scanner;

public class PizzaWahala {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of guests: ");
        double numberOfGuests = scanner.nextInt();

        System.out.println("Enter pizza type (Sapa size / Small Money / Big boys / Odogwu): ");
        scanner.nextLine();
        String pizzaType = scanner.nextLine();

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
                return;
        }

        int numberOfBoxes = (int) Math.ceil( numberOfGuests / slicesPerBox);
        int totalSlices = numberOfBoxes * slicesPerBox;
        int leftOverSlices = (int) (totalSlices - numberOfGuests);
        int totalPrice = numberOfBoxes * pricePerBox;

        System.out.println("---------- Order Summary ----------");
        System.out.println("Number of boxes to buy : " + numberOfBoxes + " boxes");
        System.out.println("Left over slices       : " + leftOverSlices + " slices");
        System.out.println("Total price            : " + totalPrice);

        scanner.close();
    }}
