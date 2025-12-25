package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class M223_Rectangle_Area {
    private static final Logger logger = Logger.getLogger(M836_Rectangle_Overlap.class.getName());

    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {

        boolean notOverlap = bx2 <= ax1 || bx1 >= ax2 || by1 >= ay2 || by2 <= ay1;
        int overlapSquare = 0;
        if (!notOverlap) {
            int width = Math.min(ax2, bx2) - Math.max(ax1, bx1);
            int height = Math.min(ay2, by2) - Math.max(ay1,by1);
            overlapSquare = width * height;
        }

        return square(ax1, ay1, ax2, ay2) + square(bx1, by1, bx2, by2) - overlapSquare;
    }

    private int square(int x1, int y1, int x2, int y2) {
        return (x2 - x1) * (y2- y1);
    }

}
