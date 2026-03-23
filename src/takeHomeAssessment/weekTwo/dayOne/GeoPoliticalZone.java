package takeHomeAssessment.weekTwo.dayOne;

import takeHomeAssessment.weekTwo.dayOne.enums.PoliticalZones;

import java.util.Scanner;

public class GeoPoliticalZone {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter state : ");
        String state = sc.nextLine();

        System.out.println();
        System.out.printf("The Geo-political Zone of %S is %s",state, PoliticalZones.getGeoPoliticalZone(state));

    }
}
