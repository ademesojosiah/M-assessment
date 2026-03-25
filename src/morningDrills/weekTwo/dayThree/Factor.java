package morningDrills.weekTwo.dayThree;

import java.util.ArrayList;
import java.util.List;

public class Factor {

    public int[] calculateFactorsOfNumber(int number) {

        int[] factors = new int[calculateNumberOfFactorsOfNumber(number)];

        if(number <= 0){
            throw new ArithmeticException("Number must be greater than zero");
        }

        int index = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    public int calculateNumberOfFactorsOfNumber(int number) {
        int factors = 0;
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                factors = factors + 1;
            }
        }

        return factors;
    }



    public List<Integer> calculateListOfUniqueOfNumber(int number) {

        List<Integer> list = new ArrayList<Integer>();

        boolean flag = false;

        int factor = 2;

        int currNumber = number;
        while(!flag){
            if(currNumber % factor == 0){
                currNumber = currNumber / factor;
                list.add(factor);
            }else{
                factor++;
            }

            if(currNumber == 1){
                flag = true;
            }
        }
        return list;


    }
}
