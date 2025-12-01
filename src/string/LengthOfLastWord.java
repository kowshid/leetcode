// Problem: 58
// https://leetcode.com/problems/length-of-last-word/

package string;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {

        char terminator = ' ';
        int length = 0;
        int i = s.length() - 1;

        for (; i >= 0; i--) {
            if (s.charAt(i) != terminator) {
                break;
            }
        }

        for (; i >= 0; i--) {
            if (s.charAt(i) == terminator) {
                break;
            }
            length++;
        }

        return length;
    }
}
