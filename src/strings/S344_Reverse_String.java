package strings;

public class S344_Reverse_String {
    public char[] reversedString(char[] s) {
        int size = s.length;
        for (int left = 0; left < size; left++) {
            int right = size - 1 - left;
            if (left < right) {
                swap(s, left, right);
            }
        }

        return s;
    }

    private char[] swap(char[] s, int left, int right) {
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        return s;
    }
}
