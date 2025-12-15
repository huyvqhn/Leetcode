import arrays.A1295_FindNumbersWithEvenNumberOfDigits;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        LogConfig.init();
        A1295_FindNumbersWithEvenNumberOfDigits s = new A1295_FindNumbersWithEvenNumberOfDigits();
        int result = s.findNumbers(new int[]{555,901,482,1771});
        logger.info("result: " + result);
    }
}