// Problem: 136
// https://leetcode.com/problems/single-number/

package arrays;

import java.util.HashSet;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        if(nums.length <= 1) return nums[0];
        int solution = 0;
        for (int num : nums) {
            solution = solution ^ num;
        }

        return solution;
    }

    public int singleNumberBad(int[] nums) {
        if(nums.length <= 1) return nums[0];
        HashSet<Integer> trackingSet = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            if (!trackingSet.contains(nums[i])) {
                trackingSet.add(nums[i]);
            }
            else {
                trackingSet.remove(nums[i]);
            }
        }

        return (int) trackingSet.toArray()[0];
    }
}