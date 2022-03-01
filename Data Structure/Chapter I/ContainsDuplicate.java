// Problem: 217
// https://leetcode.com/problems/contains-duplicate
// Solved with HashMap here: https://leetcode.com/submissions/detail/639281100/

class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
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