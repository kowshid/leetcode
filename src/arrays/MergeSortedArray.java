// Problem#88
// https://leetcode.com/problems/merge-sorted-array/

package arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }

        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }

        int targetIdx = m + n - 1;
        int targetValue;
        m--;
        n--;

        while (m >= 0 && n >= 0) {
            targetValue = nums1[m] > nums2[n]
                    ? nums1[m--]
                    : nums2[n--];

            nums1[targetIdx--] = targetValue;
        }

        if (m < 0) {
            System.arraycopy(nums2, 0, nums1, 0, n + 1);
        }
    }
}