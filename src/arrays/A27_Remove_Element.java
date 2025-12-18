package arrays;

import java.util.Arrays;
import java.util.logging.Logger;

public class A27_Remove_Element {
    private static final Logger logger = Logger.getLogger(A88_Merge_Sorted_Array.class.getName());
    public int removeElement(int[] nums, int val) {
        int size = nums.length;
        int i = size - 1;
        int count = 0;
        while (i >= 0) {
            if (val == nums[i]) {
                count ++;
                nums[i] -= 51;
            }
            i --;
        }
        if (count == size) {
            return 0;
        }
        if (count == 0) {
            return size;
        }

        logger.info(Arrays.toString(nums));
        int k = size - count;


        int iFirst = 0;
        int iLast = size - 1;
        int swapCount = 0;
        while (iFirst < iLast && swapCount < count) {
            while (nums[iFirst] >= 0 && iFirst < k) {
                iFirst ++;
            }
            while (nums[iLast] < 0 && iLast > k) {
                iLast --;
            }
            logger.info("iFirst: " + iFirst + "; iLast: " + iLast);
            nums[iFirst] = nums[iLast];
            nums[iLast] = 999;
            iFirst ++;
            iLast --;
            swapCount ++;
            logger.info(Arrays.toString(nums));
            logger.info("xxxxxxxxxxxxxxxxxxxx");
        }
        logger.info("Final: " + Arrays.toString(nums));
        logger.info("k = " + k);

        return k;
    }
}
