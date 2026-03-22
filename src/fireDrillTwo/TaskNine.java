package fireDrillTwo;

import java.util.Scanner;

public class TaskNine{

	public static void main(String[] arg){



		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 10 scores and get the average");
		

		int i = 0;
		int sum = 0;
		while(i++ < 10){
			System.out.printf("Enter score %d: ", i);
			int number = sc.nextInt();

			if(number > 0 && number < 100){
				sum = sum + number;
			};

		}
				
		System.out.printf("The sum of valid scores between 0-100 is : %d", sum);

		sc.close();

	}

}