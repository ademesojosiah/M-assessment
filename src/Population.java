import java.util.Scanner;

public class Population {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter current world population:");

        long population = sc.nextLong();

        System.out.println("Enter annual growth rate (e.g. 8 for 0.8%, 9 for 0.9%): ");

        long growthRate = sc.nextLong();



        long year1 = population + (population * growthRate / 10000);

        long year2 = year1     + (year1     * growthRate / 10000);

        long year3 = year2     + (year2     * growthRate / 10000);

        long year4 = year3     + (year3     * growthRate / 10000);

        long year5 = year4     + (year4     * growthRate / 10000);

        System.out.printf("Population after year 1: %d%n", year1);
        System.out.printf("Population after year 2: %d%n", year2);
        System.out.printf("Population after year 3: %d%n", year3);
        System.out.printf("Population after year 4: %d%n", year4);
        System.out.printf("Population after year 5: %d%n", year5);
    }
}
