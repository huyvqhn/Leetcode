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
//    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (m == 0) {
            nums1 = nums2;
        } else {
            int[] nums0 = new int[m + n];
            int index = 0;
            int index2 = 0;
            for (int i = 0; i < m; i ++) {
                while (nums1[i] >= nums2[index]) {
                    nums0[index] = nums2[index2];
                    index2 ++;
                    index ++;
                    if (index == n) {
                        break;
                    }
                }
                nums0[index] = nums1[i];
                index ++;
            }
            nums1 = nums0;
            logger.info(Arrays.toString(nums0));
        }
        logger.info(Arrays.toString(nums1));
    }
}
