// Problem: 191
// https://leetcode.com/problems/number-of-1-bits/

package bits;

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        if (n == 0) return 0;
        if ((n & 1) == 1) return 1 + hammingWeight(n >>> 1);
        else return hammingWeight(n >>> 1);
    }
}