// Problem: 1
// https://leetcode.com/problems/two-sum/

package arrays;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 2)
            return new int[]{0, 1};

        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (indexMap.get(target - nums[i]) != null) {
                return new int[]{indexMap.get(target - nums[i]), i};
            }
            indexMap.put(nums[i], i);
        }

        return null;
    }

    public int[] twoSumBad(int[] nums, int target) {
        if (nums.length == 2)
            return new int[]{0, 1};

        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (indexMap.get(nums[i]) == null) {
                indexMap.put(nums[i], i);
            } else if (nums[indexMap.get(nums[i])] + nums[i] == target) {
                return new int[]{indexMap.get(nums[i]), i};
            }
        }

        for (int index : indexMap.keySet()) {
            if (indexMap.get(target - index) != null) {
                return new int[]{indexMap.get(target - index), indexMap.get(index)};
            }
        }

        return null;
    }
}