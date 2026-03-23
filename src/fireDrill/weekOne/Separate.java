package fireDrill.weekOne;

import java.util.Scanner;


public class Separate {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter a 5-digit integer: ");

        int number = sc.nextInt();

        int digit1 = number / 10000;
        int digit2 = number % 10000 / 1000;
        int digit3 = number % 1000  / 100;
        int digit4 = number % 100   / 10;
        int digit5 = number % 10;
        System.out.printf("%d   %d   %d   %d   %d",
            digit1, digit2, digit3, digit4, digit5);
    }
}