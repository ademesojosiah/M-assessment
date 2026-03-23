package fireDrill.weekOne;

import java.util.Scanner;

public class Arithmetic{

	public static void main(String[] arg){
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter 2 digits");
		System.out.println("Enter first digits");
		
		int firstNumber = sc.nextInt();

		System.out.println("Enter second digits");

		int secondNumber = sc.nextInt();

		int squareOfFirstNumber = firstNumber * firstNumber ;

		int squareOfSecondNumber = secondNumber * secondNumber ;

		int sumOfSquares = squareOfFirstNumber + squareOfSecondNumber;

		int differenceOfSquares = squareOfFirstNumber - squareOfSecondNumber;

		System.out.printf("The square of the 2 digits are %d & %d, the sum of their squares is %d and the difference of the squares is %d",squareOfFirstNumber, squareOfSecondNumber, sumOfSquares,differenceOfSquares );



	
	}
}