package take_home_assessment.dayThree;

public class ArrayKata {

    public int maximumIn(int[] numbers) {
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    public int minimumIn(int[] numbers) {
        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public int sumOf(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public int sumOfEvenNumbersIn(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

    public int sumOfOddNumbersIn(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                sum += number;
            }
        }
        return sum;
    }

    public int[] maximumAndMinimumOf(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        return new int[]{min, max};
    }

    public int noOfOddNumbersIn(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    public int noOfEvenNumbersIn(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public int[] evenNumbersIn(int[] numbers) {
        int count = noOfEvenNumbersIn(numbers);
        int[] evenNumbers = new int[count];
        int index = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers[index++] = number;
            }
        }
        return evenNumbers;
    }

    public int[] oddNumbersIn(int[] numbers) {
        int count = noOfOddNumbersIn(numbers);
        int[] oddNumbers = new int[count];
        int index = 0;
        for (int number : numbers) {
            if (number % 2 != 0) {
                oddNumbers[index++] = number;
            }
        }
        return oddNumbers;
    }

    public int[] squareNumbersIn(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (isSquare(number)) {
                count++;
            }
        }

        int[] squareNumbers = new int[count];
        int index = 0;
        for (int number : numbers) {
            if (isSquare(number)) {
                squareNumbers[index++] = number;
            }
        }
        return squareNumbers;
    }

    private boolean isSquare(int number) {
        if (number < 0) {
            return false;
        }
        int i = 0;
        while (i++ < number) {
            if (i * i == number) {
                return true;
            }
        }
        return false;
    }
}