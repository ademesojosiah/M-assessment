package morningDrills.weekTwo.dayOne;

import java.util.Scanner;

public class NumberToWords {
    static final String[] ONES = {"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
    static final String[] ELEVEN_TO_NINETEEN = {"ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN"};
    static final String[] TENS = {"TEN", "TWENTY","THIRTY","FORTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINETY"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        System.out.println("Number in word is: " + numberToWords(number));


    }

    public static String numberToWords(int number) {
        if(number < 0){
            return "Invalid number";
        }
        if(number < 10){
            return convertLessThanTenToWord(number);
        } else if (number < 100) {
            return convertLessThanHundredToWord(number);
        }else if (number < 1000) {
            return convertLessThanThousandToWord(number);
        }

        return "Invalid number";
    }

    private static String convertLessThanThousandToWord(int number) {
        int thousand = number / 1000;
        int hundred = number % 1000;

        String hundredInWords = (hundred > 0) ? convertLessThanHundredToWord(thousand) : "";
        return ONES[thousand+1] + hundredInWords;
    }

    private static String convertLessThanHundredToWord(int number) {
        if(number == 10){
         return TENS[0];
        }

        if(number < 20){
            return ELEVEN_TO_NINETEEN[(number%10)-1];
        }

        int tens = number / 10;
        int units = number % 10;

        String unitInWords = (units > 0) ? ONES[units] : "";
        return TENS[tens-1] + " " + unitInWords;

    }

    private static String convertLessThanTenToWord(int number) {
        return ONES[number];
    }

}
