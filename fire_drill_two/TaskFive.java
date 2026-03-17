import java.util.Scanner;

public class TaskFive{

	public static void main(String[] arg){



		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 10 scores and get the average");
		

		int i = 0;
		int sum = 0;
		while(i++ < 10){
			System.out.printf("Enter score %d: ", i);
			int number = sc.nextInt();

			if(number % 2 == 0){
				sum = sum + number;
			};
		}

				
		System.out.print("The sum of the even numbers is  "+ sum);


		sc.close();

	}

}