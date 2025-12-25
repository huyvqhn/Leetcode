package arrays;

import java.util.Arrays;
import java.util.logging.Logger;

public class A2164_Sort_Even_Odd_Indices_Independently {

    private static final Logger logger = Logger.getLogger(A977_Square_Sorted_Array.class.getName());

//    [4,1,2,3]
    // [2,1]
    public int[] sortEvenOdd(int[] nums) {
        int[] cnt = new int[101];

        for (int i = 0; i < nums.length; i++) {
            cnt[nums[i]] ++;
        }
        logger.info(Arrays.toString(cnt));
        return nums;
    }

//    Bubble sort
//    public int[] sortEvenOdd(int[] nums) {
//
//        int size = nums.length;
//        if (size <= 2) {
//            return nums;
//        }
//        for (int nbTail = 0; nbTail < size; nbTail++) {
//            for (int j = 0; j < size - nbTail -2; j++) {
//                if (j % 2 == 0 && nums[j] > nums[j+2]) {
//                    swap(nums, j, j+2);
//                }
//                if (j % 2 == 1 && nums[j] < nums[j+2]) {
//                    swap(nums, j, j+2);
//                }
//            }
////            logger.info(Arrays.toString(nums));
//        }
//        return nums;
//    }
//
//    private void swap(int[] nums, int i, int j) {
//        int t = nums[i];
//        nums[i] = nums[j];
//        nums[j] = t;
//    }
}
