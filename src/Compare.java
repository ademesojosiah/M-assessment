import java.util.Scanner;

public class Compare{

	public static void main(String[] arg){
	
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Enter an integer: ");
       		 int number = sc.nextInt();

       		 int square = number * number;

       	 if (number > 100)System.out.printf("The number %d is greater than 100%n", number);
        if (number == 100) System.out.printf("The number %d is equal to 100%n", number);
        if (number < 100) System.out.printf("The number %d is less than 100%n", number);

        if (square > 100)System.out.printf("The square %d is greater than 100%n", square);
        if (square == 100)System.out.printf("The square %d is equal to 100%n", square);
        if (square < 100)System.out.printf("The square %d is less than 100%n", square);					

	
	}
}