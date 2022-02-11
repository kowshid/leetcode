// Problem: 26
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

package Arrays;

class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            nums[k++] = nums[i];
        }

        return k;
    }
}