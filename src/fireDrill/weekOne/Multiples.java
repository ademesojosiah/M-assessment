package fireDrill.weekOne;

import java.util.Scanner;
public class Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer:  ");
        int first = sc.nextInt();
        System.out.print("Enter second integer: ");
        int second = sc.nextInt();
        	int firstTripled = first * 3;
        	int secondDoubled = second * 2;
        if (firstTripled % secondDoubled == 0) System.out.printf("%d tripled (%d) IS a multiple of %d doubled (%d)%n", first, firstTripled, second, secondDoubled);
        if (firstTripled % secondDoubled != 0) System.out.printf("%d tripled (%d) is NOT a multiple of %d doubled (%d)%n", first, firstTripled, second, secondDoubled);
    }
}