// Problem: 169
// https://leetcode.com/problems/majority-element/

package arrays;

import java.util.HashMap;

public class MajorityElement {

    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> counterMap = new HashMap<>();

        for (int num : nums) {
            counterMap.put(num, counterMap.getOrDefault(num, 0) + 1);
        }

        int goal = nums.length / 2;

        for (int num : nums) {
            if (counterMap.get(num) > goal) {
                return num;
            }
        }

        return 0;
    }


}
