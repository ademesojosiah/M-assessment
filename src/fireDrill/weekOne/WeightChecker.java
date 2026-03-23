package fireDrill.weekOne;

import java.util.Scanner;


public class WeightChecker {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Enter weight in pounds: ");
        	int weight = sc.nextInt();

        System.out.println("Enter height in inches: ");
        int height = sc.nextInt();

        int bmi = (weight * 703) / (height * height);
        System.out.printf("Your BMI is: %d%n", bmi);
        System.out.println("");
        System.out.println("NHLBI BMI Categories:");
        System.out.println("Underweight:    Below 18.5");
        System.out.println("Healthy weight: 18.5 to 24.9");
        System.out.println("Overweight:     25.0 to 29.9");
        System.out.println("Obese:          30.0 and above");

        System.out.println("");

        if (bmi < 18) System.out.println("Your category: Underweight");

        if (bmi >= 18 && bmi <= 24) System.out.println("Your category: Healthy weight");

        if (bmi >= 25 && bmi <= 29) System.out.println("Your category: Overweight");

        if (bmi >= 30) System.out.println("Your category: Obese");

        System.out.println("Note: for most adult a healthy BMI is between 18.5 and 24.9");

    }
}