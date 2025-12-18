import arrays.A1295_FindNumbersWithEvenNumberOfDigits;
import arrays.A27_Remove_Element;
import arrays.A88_Merge_Sorted_Array;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        LogConfig.init();
//        A1295_FindNumbersWithEvenNumberOfDigits s = new A1295_FindNumbersWithEvenNumberOfDigits();
//        int result = s.findNumbers(new int[]{555,901,482,1771});
//        logger.info("result: " + result);

//        A88_Merge_Sorted_Array s = new A88_Merge_Sorted_Array();
////        int[] nums1 = {1,2,3,0,0,0};
//        int[] nums1 = {-1,0,5,5,8,0,0};
//        int m = 5;
////        int[] nums2 = {2,5,6};
//        int[] nums2 = {2,5};
//        int n = 2;
//        s.merge(nums1, m, nums2, n);
////        [-1,0,0,1,2,2,3,3,3]

        A27_Remove_Element s = new A27_Remove_Element();
        int[] nums = {0,0,1,2,4,1,0,4,4,0,1,3};
        int val = 1;
        s.removeElement(nums, val);
    }
}