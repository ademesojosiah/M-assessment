package morningDrills.weekTwo.dayTwo;

import java.util.Arrays;

public class LowestCommonFactor {
    public static void main(String[] args) {

    }

    public int calculateLowestCommonFactor(int... listOfNumbers) {

        int LCM = 1;

        int[] numbers = listOfNumbers.clone();

        int i = 2;
        boolean done = false;
        while (!done) {
            if(isDivisible(numbers, i)) {
                numbers = calculateAndReturnDividedResult(numbers, i);
                System.out.println(Arrays.toString(numbers));
                LCM *= i;
            }else{
                i++;
            }

            if(allOnes(numbers)) {
                done = true;
            }

        }


        return LCM;
    }

    public boolean isDivisible(int[] numbers, int divisor) {
        for (int number : numbers) {
            if(number == 0){
                throw new ArithmeticException("");
            }
            if(number % divisor == 0) {
                return true;
            }
        }
        return false;
    }

    public int[] calculateAndReturnDividedResult(int[] numbers, int divisor){

        int[] result = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % divisor == 0){
                result[i] = numbers[i] / divisor;
            }else{
                result[i] = numbers[i];
            }
        }
        return result;
    }

    public boolean allOnes(int[] numbers) {
        for(int number : numbers){
            if(number != 1){
                return false;
            }
        }
        return true;
    }
}
