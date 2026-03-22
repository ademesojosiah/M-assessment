package morningDrills;

import java.util.Scanner;

public class AltUniverse{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number : ");

		int firstNumber = sc.nextInt();

		System.out.println("Enter second number : ");

		int secondNumber = sc.nextInt();

		if(firstNumber == 0 || secondNumber == 0 ){

			System.out.printf("The multiplication of %d and %d is : %d ", firstNumber, secondNumber, 0 );

		}

		int multiplication = 0;

		int index = secondNumber;

		while(index != 0){
			multiplication = multiplication + firstNumber;	
			index = index - 1;
		}
		
		if(firstNumber != 0 && secondNumber !=0 ){

		 System.out.printf("The multiplication of %d and %d is : %s ", firstNumber, secondNumber, multiplication );
		}
		
	}

}