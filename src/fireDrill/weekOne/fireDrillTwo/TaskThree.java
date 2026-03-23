package fireDrill.weekOne.fireDrillTwo;

import java.util.Scanner;

public class TaskThree{

	public static void main(String[] arg){



		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 10 scores and get the average");
		

		int i = 0;
		float sum = 0;
		while(i++ < 10){
			System.out.printf("Enter score %d: ", i);
			int number = sc.nextInt();
			sum = sum + number;
		}

		
		float average = sum/10;
		
		System.out.printf("The sum is : %.2f and average is : %.2f ", sum, average);

		sc.close();



	}

}