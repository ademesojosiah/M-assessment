package morningDrills.weekFive;

import java.util.Arrays;

public class ProductExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];

        int[] prefix = new int[nums.length];

        int[] suffix = new int[nums.length];

        prefix[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i-1] * prefix[i-1];
        }

        suffix[nums.length-1] = 1;
        for (int i = nums.length-2; i >= 0; i--) {
            suffix[i] = nums[i+1] * suffix[i+1];

        }

        for(int i = 0; i< result.length; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        return result;
    }

    public int[] productOfArrayExceptSelf(int[] arr) {
//        [2,1,5,6]
        int[] result = new int[arr.length];
        int prefix = 1;
        int subfix = 1;
        for (int i = 0; i < arr.length; i++) {
            result[i] = prefix;
            prefix *= arr[i];
        }

        System.out.println(Arrays.toString(result));

        for(int i = arr.length - 1; i >= 0; i--) {
            result[i] *= subfix;
            subfix *= arr[i];
        }


        return result;

    }

    public int[] productOfArrayExceptSelfWithBruteForce(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int currMul = 1;
            for (int j = 0; j < arr.length; j++) {
                if (j != i) {
                    currMul *= arr[j];
                }
            }
            result[i] = currMul;
        }

        return result;
    }
}
