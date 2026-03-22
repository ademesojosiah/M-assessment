package takeHomeAssessment.dayThree;

public class Kata {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public boolean isPrimeNumber(int number) {

        if (number <= 1) {
            return false;
        }

        for (int i = 2; i < number;) {
            if (number % i == 0) {
                return false;
            }

            i++;
        }
        return true;
    }

    public int subtract(int a, int b) {
        if (a > b) {
            return a - b;
        } else {
            return b - a;
        }
    }

    public float divide(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return (float) a / b;
    }

    public int factorOf(int number) {
        int count = 0;
        int i = 0;
        while  (i++ < number) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    public boolean isSquare(int number) {
        if (number < 0) {
            return false;
        }

        int i = 0;
        while  (i++ < number) {
            if (i * i == number) {
                return true;
            }
        }
        return false;

    }

    public boolean isPalindrome(int number) {
        String s = String.valueOf(number);
        int length = s.length();

        int left = 0;
        int right = length - 1;

        while (left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    public long factorialOf(int number) {

        if (number == 0 || number == 1) {
            return 1;
        }

        int index = number;
        long total = number;

        while (index-- > 1) {
            total *= index;
        }

        return total;
    }

    public long squareOf(int number) {
        long sum = number;
        return sum * sum;
    }

}
