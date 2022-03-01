// Problem: 217
// https://leetcode.com/problems/contains-duplicate/

import java.util.HashMap;

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
}