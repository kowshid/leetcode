// Problem: 338
// https://leetcode.com/problems/counting-bits/

package bits;

class CountingBits {
    public int[] countBits(int n) {
        if (n == 0) {
            return new int[]{0};
        }
        int[] bitsArr = new int[n + 1];
        int twosPower = 1;

        for (int i = 1; i <= n; i++) {
            bitsArr[i] = 1 + bitsArr[i % twosPower];
            if (bitsArr[i] == 1) {
                twosPower = i;
            }
        }

        return bitsArr;
    }
}