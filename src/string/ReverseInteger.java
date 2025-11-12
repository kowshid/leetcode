// Problem: 7
// https://leetcode.com/problems/reverse-integer

package string;

public class ReverseInteger {
    public int reverse(int x) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(Math.abs(x)));
        stringBuilder.reverse();
        try {
            int ret = Integer.parseInt(stringBuilder.toString());
            if (x < 0) ret *= -1;
            return ret;
        } catch (Exception e) {
            return 0;
        }
    }
}