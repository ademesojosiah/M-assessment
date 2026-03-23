package fireDrill.weekOne;

import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer:  ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        System.out.print("Enter third integer:  ");
        int c = sc.nextInt();

        int sum     = a + b + c;
        int average = sum / 3;
        int product = a * b * c;

        int smallest = a;
        if (b < smallest)smallest = b;
        if (c < smallest)smallest = c;

        int largest = a;
        if (b > largest)largest = b;
        if (c > largest)largest = c;

        System.out.printf("The Sum: %d, Average : %d, Product : %d, Smallest : %d, Largest %d", sum, average,product,smallest,largest);
    }
}