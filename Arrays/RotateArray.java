// Problem: 189
// https://leetcode.com/problems/rotate-array/

class RotateArray {
    public void rotate(int[] nums, int k) {
        if (nums.length <= 1) return;
        k = k % nums.length;
        if (k <= 0) return;
        reverseArray(nums, 0, nums.length - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, nums.length - 1);
    }

    public static void reverseArray(int[] nums, int start, int end) {
        if (start >= end || nums.length <= 1) return;

        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        reverseArray(nums, start + 1, end - 1);
    }
}