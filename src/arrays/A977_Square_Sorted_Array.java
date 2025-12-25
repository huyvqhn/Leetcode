package arrays;

import java.util.logging.Logger;

public class A977_Square_Sorted_Array {
    private static final Logger logger = Logger.getLogger(A977_Square_Sorted_Array.class.getName());
    public int[] sortedSquares(int[] nums) {
        int size = nums.length;
        int[] res = new int[size];
        int left = 0;
        int right = size - 1;
        int index = size - 1;

        while (left <= right) {
            int leftNum = nums[left] * nums[left];
            int rightNum = nums[right] * nums[right];

            if (leftNum <= rightNum) {
                res[index--] = rightNum;
                right --;
            } else {
                res[index--] = leftNum;
                left ++;
            }
        }

        return res;
    }

    private int fAbs(int num) {
        return num >= 0 ? num : - num;
    }

//    public int[] sortedSquares(int[] nums) { Selection sort
//        int size = nums.length;
//        for (int i = 0; i < size; i++) {
//            int minIndex = i;
//
//            // Find min in [nums[i+1], nums[size]]
//            for (int j = i+1; j < size; j++) {
//                if (fAbs(nums[minIndex]) >fAbs(nums[j])) {
//                    minIndex = j;
//                }
//            }
//
//            if (minIndex != i) {
//                int t = nums[minIndex];
//                nums[minIndex] = nums[i];
//                nums[i] = t * t;
//            } else {
//                nums[i] = nums[i] * nums[i];
//            }
//        }
//
//        return nums;
//    }
}
