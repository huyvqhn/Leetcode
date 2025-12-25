package math;

import arrays.A977_Square_Sorted_Array;

import java.util.logging.Logger;

public class M836_Rectangle_Overlap {

    private static final Logger logger = Logger.getLogger(M836_Rectangle_Overlap.class.getName());
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

//        if (rec1[2] <= rec2[0] || rec1[0] >= rec2[2] || rec1[1] >= rec2[3] || rec1[3] <= rec2[1]) {
//            return false;
//        }
//        return true;

        int x1a = rec1[0];
        int x2a = rec1[2];
        int y1a = rec1[1];
        int y2a = rec1[3];
        int x1b = rec2[0];
        int x2b = rec2[2];
        int y1b = rec2[1];
        int y2b = rec2[3];

        if (x1a == x2a || y1a == y2a || x1b == x2b || y1b == y2b) {
            return false;
        }
        if (existOverlap(rec1, rec2) || existOverlap(rec2, rec1)) {
            return true;
        }
        if (x1b <= x1a && x2b >= x2a && y1a <= y1b && y2a >= y2b) {
            return true;
        }
        if (x1a <= x1b && x2b <= x2a && y1a >= y1b && y2a <= y2b) {
            return true;
        }
        if (x1a == x1b || x2a == x2b) {
            return (y1a <= y1b && y2b <= y2a) || (y1b <= y1a && y2a <= y2b);
        }
        if (y1a == y1b || y2a == y2b) {
            return (x1a <= x1b && x2b <= x2a) || (x1b <= x1a && x2a <= x2b);
        }
        return false;
    }

    private boolean existOverlap(int[] x, int[] y) {
        if (isPointInRec(x[0], x[1], y)) {
            return true;
        }
        if (isPointInRec(x[2], x[3], y)) {
            return true;
        }
        if (isPointInRec(x[2], x[1], y)) {
            return true;
        }
        if (isPointInRec(x[0], x[3], y)) {
            return true;
        }
        return false;
    }

    private boolean isPointInRec(int x, int y, int[] rec) {
        if (rec[0] < x && x < rec[2] && rec[1] < y && y < rec[3]) {
            return true;
        }
        return false;
    }

}
