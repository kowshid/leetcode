// Problem: 217
// https://leetcode.com/problems/contains-duplicate/

package arrays;

import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length <= 1) return false;
        HashMap<Integer, Boolean> mapToTrackNumbers = new HashMap<>();

        for (int num: nums) {
            if (mapToTrackNumbers.get(num) != null) {
                return true;
            }
            mapToTrackNumbers.put(num, true);
        }

        return false;
    }

    public boolean containsDuplicateUsingSet(int[] nums) {
        if (nums.length <= 1) return false;
        HashSet<Integer> numberSet = new HashSet<>();

        for (int num: nums) {
            if (numberSet.contains(num)) {
                return true;
            }
            numberSet.add(num);
        }

        return false;
    }
}