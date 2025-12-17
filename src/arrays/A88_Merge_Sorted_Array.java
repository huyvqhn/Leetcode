package arrays;

import java.util.Arrays;
import java.util.logging.Logger;

public class A88_Merge_Sorted_Array {

    private static final Logger logger = Logger.getLogger(A88_Merge_Sorted_Array.class.getName());

//    Input: nums1 = [1], m = 1, nums2 = [], n = 0
//    Output: [1]
//    Explanation: The arrays we are merging are [1] and [].
//    The result of the merge is [1].

//    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//    Output: [1,2,2,3,5,6]
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int i1 = 0;
        int i2 = 0;
        int i = 0;
        int num1 = 0;
        int num2 = 0;
        int[] nums = Arrays.copyOf(nums1, m + n);
        while (i < m + n) {
            num1 = nums[i1];
            if (i2 < n) {
                num2 = nums2[i2];
            }
            logger.info("Before: i: " + i + "; i1-num1 " + i1 + " - " + num1 +
                    "; i2-num2 " + i2 + " - " + num2 + "; nums: " +
                    Arrays.toString(nums1));

            if (num1 == 0 && i1 >= m) {
                nums1[i] = num2;
                i1 ++;
                i2 ++;
            } else if (num1 < num2) {
                nums1[i] = num1;
                i1 ++;
            } else if (num1 == num2) {
                nums1[i] = num1;
                i ++;
                nums1[i] = num2;
                i1 ++;
                i2 ++;
            } else { // num1 > num2
                if (i2 == n) {
                    nums1[i] = num1;
                    i1 ++;
                } else {
                    nums1[i] = num2;
                    i2 ++;
                }
            }
            i ++;
            logger.info("After: i: " + i + "; i1-num1 " + i1 + " - " + num1 +
                    "; i2-num2 " + i2 + " - " + num2 + "; nums: " +
                    Arrays.toString(nums1));
        }
//        System.arraycopy(nums2, 0, nums1, 0, n);

        logger.info(Arrays.toString(nums1));
    }


}
