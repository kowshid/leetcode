// Problem: 27
// https://leetcode.com/problems/remove-element/

package arrays;

public class RemoveElement {

    public int removeElementCopyNonValues(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }

        return count;
    }

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        int left = 0;
        int right = nums.length - 1;
        int count = nums.length;

        while (left <= right) {
            if (nums[left] == val) {
                count--;

                swap(nums, left, right);

                right--;
            } else {
                left++;
            }
        }

        return count;
    }

    private static void swap(int[] nums, int left, int right) {
        nums[left] = nums[left] ^ nums[right];
        nums[right] = nums[left] ^ nums[right];
        nums[left] = nums[left] ^ nums[right];
    }
}