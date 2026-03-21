import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer:  ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        System.out.print("Enter third integer:  ");
        int c = sc.nextInt();
        System.out.print("Enter fourth integer: ");
        int d = sc.nextInt();
        System.out.print("Enter fifth integer:  ");
        int e = sc.nextInt();

        int smallest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;
        if (d < smallest) smallest = d;
        if (e < smallest) smallest = e;

        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;
        if (d > largest) largest = d;
        if (e > largest) largest = e;

        System.out.printf("Smallest: %d, Largest: %d ", smallest, largest);

    }
}