package fireDrillTwo;

import java.util.Scanner;

public class TaskTen{

	public static void main(String[] arg){



		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 10 scores and get the average");
		

		int i = 0;
		float sum = 0;
		int numberOfValidNumbers = 0;
		while(i++ < 10){
			System.out.printf("Enter score %d: ", i);
			int number = sc.nextInt();

			if(number > 0 && number < 100){
				sum = sum + number;
				numberOfValidNumbers = numberOfValidNumbers + 1;
			};

		}

		float average = sum/numberOfValidNumbers;
				
		System.out.printf("The average from task 9 is : %.2f", average);

		sc.close();

	}

}