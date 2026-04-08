package morningDrills.weekFour.dayTwo;

public class Divide {

    public int divide(int number, int divisor){

        int result = 0;

        if(number == 0){
            return 0;
        }

        if(divisor == 0){
            throw new ArithmeticException("invalid divisor");
        }

        if(number < 0){
            while (number <= divisor){
                number = number + divisor;
                if(number > 0){
                    break;
                }
                result --;
            }

        }else{
            while (number >= divisor){
                number = number - divisor;
                result ++;
            }



        }


        return result;

    }

}
