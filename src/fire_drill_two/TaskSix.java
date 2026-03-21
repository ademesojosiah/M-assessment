package fire_drill_two;

import java.util.Scanner;

public class TaskSix{

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
				
		System.out.print("The average of the even numbers is  "+ average);


		sc.close();

	}

}