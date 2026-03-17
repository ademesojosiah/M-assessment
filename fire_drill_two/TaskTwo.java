import java.util.Scanner;

public class TaskTwo{

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
		
		System.out.println("The average is " + average);

		sc.close();



	}

}