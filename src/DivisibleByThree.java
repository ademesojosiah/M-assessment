import java.util.Scanner;
public class DivisibleByThree {
    public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
      System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        if (number % 3 == 0) System.out.printf("%d is divisible by 3%n", number);
        if (number % 3 != 0) System.out.printf("%d is NOT divisible by 3%n", number);
    }
}