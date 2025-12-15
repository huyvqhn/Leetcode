package arrays;

import java.util.logging.Logger;

public class A1295_FindNumbersWithEvenNumberOfDigits {

    private static final Logger logger =
            Logger.getLogger(A1295_FindNumbersWithEvenNumberOfDigits.class.getName());

    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if (evenDigit(num)) {
                count++;
            }
        }

        return count;
    }

    private boolean evenDigit(int num) {
        if (10 <= num && num < 100 || 1000 <= num && num < 10000 || num == 100000) {
            return true;
        }
        return false;
    }
}
