package arrays;

import java.util.Arrays;
import java.util.logging.Logger;

public class A27_Remove_Element_2 {

    private static final Logger logger = Logger.getLogger(A27_Remove_Element_2.class.getName());
    public int removeElement(int[] nums, int val) {

        int i = 0, n = nums.length;
        logger.info(Arrays.toString(nums));
        while (i < n) {
            if (nums[i] == val) {
                int j = --n;
                nums[i] = nums[j];
                logger.info("--n; n = " + n);
            } else {
                i++;
                logger.info("i++; i= " + i);
            }
            logger.info("i= " + i + "; n= " + n + "; sums= " + Arrays.toString(nums));
        }
        logger.info(Arrays.toString(nums));
        logger.info("k= " + n);
        return n;
    }
}
