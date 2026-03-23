package fireDrill.weekOne.fireDrillTwo;

import java.util.Scanner;

public class TaskSeven{

	public static void main(String[] arg){



		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 10 scores and get the average");
		

		int i = 0;
		float sum = 0;
		int numberOfEvenNumbers = 0;
		while(i++ < 10){
			System.out.printf("Enter score %d: ", i);
			int number = sc.nextInt();

			if(number % 2 == 0){
				sum = sum + number;
				numberOfEvenNumbers = numberOfEvenNumbers + 1;
			};
		}

		float average = sum/numberOfEvenNumbers;
				
		System.out.printf("The sum is : %.2f and average is : %.2f ", sum, average);

		sc.close();



	}

}