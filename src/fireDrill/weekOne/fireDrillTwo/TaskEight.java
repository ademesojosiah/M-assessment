package fireDrill.weekOne.fireDrillTwo;

import java.util.Scanner;

public class TaskEight{

	public static void main(String[] arg){



		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 10 scores and get the average");
		

		int i = 0;
		int sum = 0;
		while(i++ < 10){
			System.out.printf("Enter score %d: ", i);
			int number = sc.nextInt();

			while(number < 0 || number > 100){
				System.out.println("Enter a valid number between 0-100 ");
				System.out.printf("Enter score %d: ", i);
				number = sc.nextInt();				
			};
			sum = sum + number;

		}
				
		System.out.printf("The sum of valid scores between 0-100 is : %d", sum);

		sc.close();


	}

}