// Problem: 66
// https://leetcode.com/problems/plus-one/

package arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int index = digits.length - 1;

        if (digits[index] != 9) {
            digits[index]++;
            return digits;
        }

        while (index >= 0) {
            if (digits[index] != 9) {
                digits[index]++;
                break;
            }
            digits[index] = 0;
            index--;
        }

        if (digits[0] == 0 && index == -1) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }

        return digits;
    }
}