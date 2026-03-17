import java.util.Scanner;


public class Circle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        	System.out.println("Enter radius: ");

        int radius = sc.nextInt();
	
        System.out.printf("Diameter: %f, Circumference: %f, Area: %f",2.0 * radius, 2 * Math.PI * radius,Math.PI * radius * radius);
    }
}