// Problem: 283
// https://leetcode.com/problems/move-zeroes/

package arrays;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        if (nums.length <= 1) return;
        int nonZeroNumberCount = 0;
        int currentIndexToWriteNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[currentIndexToWriteNumber++] = nums[i];
                nonZeroNumberCount++;
            }
        }

        for (int i = nonZeroNumberCount; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public void moveZeroesModerate(int[] nums) {
        if (nums.length <= 1) return;
        int currentZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[currentZeroIndex++] = temp;
            }
        }
    }

    public void moveZeroesBad(int[] nums) {
        if (nums.length <= 1) return;
        int zeroPos = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0 && zeroPos < 0) {
                zeroPos = i;
            } else if (nums[i] != 0 && zeroPos >= 0) {
                int temp = nums[i];
                nums[i] = 0;
                nums[zeroPos] = temp;
                i = zeroPos;
                zeroPos = -1;
            }
        }
    }
}