import arrays.*;
import math.M223_Rectangle_Area;
import math.M836_Rectangle_Overlap;

import java.util.Arrays;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        LogConfig.init();

        M223_Rectangle_Area m223 = new M223_Rectangle_Area();
        logger.info(String.valueOf(m223.computeArea(-2,-2,2,2,3,3,4,4)));

//        M836_Rectangle_Overlap m836 = new M836_Rectangle_Overlap();
//        int[] rec1 = {-521,-586,-487,992};
//        int[] rec2 = {-557,114,-180,267};
//        logger.info(String.valueOf(m836.isRectangleOverlap(rec1, rec2)));

//        A2164_Sort_Even_Odd_Indices_Independently a2164 = new A2164_Sort_Even_Odd_Indices_Independently();
//        int[] nums = {7,30,2,3,11};
//        logger.info(Arrays.toString(a2164.sortEvenOdd(nums)));

//        A977_Square_Sorted_Array a977 = new A977_Square_Sorted_Array();
//        int[] nums = {-7,-3,2,3,11};
//        logger.info(Arrays.toString(a977.sortedSquares(nums)));;

//        S344_Reverse_String s344 = new S344_Reverse_String();
//        char[] s = {};
//        logger.info("result: " + Arrays.toString(s));
//        char[] result = s344.reversedString(s);
//        logger.info("result: " + Arrays.toString(s));


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

//        A27_Remove_Element_2 s = new A27_Remove_Element_2();
//        int[] nums = {0,0,1,2,4,1,0,4,4,0,1,3};
//        int val = 1;
//        s.removeElement(nums, val);
    }
}