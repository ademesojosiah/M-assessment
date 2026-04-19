package morningDrills.weekFive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
class ProductExceptSelfTest {


    @Test
    void testProductExceptSelf() {
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();

        int[] result = productExceptSelf.productExceptSelf( new int[]{2,1,5,6});

        System.out.println(Arrays.toString(result));

        Assertions.assertArrayEquals(new int[]{30,60,12,10}, result);
    }

    @Test
    void testProductExceptSelf_usingBruteForce() {
        ProductExceptSelf productExceptSelf = new ProductExceptSelf();

        int[] result = productExceptSelf.productOfArrayExceptSelfWithBruteForce( new int[]{2,1,5,6});

        System.out.println(Arrays.toString(result));

        Assertions.assertArrayEquals(new int[]{30,60,12,10}, result);
    }

}