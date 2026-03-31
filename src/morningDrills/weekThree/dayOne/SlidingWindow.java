import java.util.Arrays;

public class SlidingWindow {
    public static void main(String args[]) {
        int[] num = {1,5,6,9,3,2};
        int k = 3;

        int[] result = findKSum(num,k);
        String arrays = Arrays.toString(result);
        System.out.println("result " + arrays);

    }


    public static int[] findKSum(int[] number, int k){
        int sum = 0;
        int l = 0;
        int r = 0;
        while(r < k){
            sum += number[r];
            r++;
        }

        int indexStart = 0;

        while(r < number.length){
            int newSum = sum + number[r] - number[l];
            r++;
            l++;
            if(newSum > sum){

                sum = newSum;
                indexStart = l;
            }

        }

        int[] result = new int[k];
        int resultIndex = 0;
        int times = k;
        while(times > 0){
            result[resultIndex] = number[indexStart];
            indexStart++;
            resultIndex++;
            times--;
        }

        return result;
    }
}