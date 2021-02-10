from collections import defaultdict

class Solution:
    def sumOfUnique(self, nums: List[int]) -> int:
        counts = defaultdict(int)
        n = len(nums)
        result = 0

        for i in range(n):
            counts[nums[i]] += 1

        for key in counts:
            if counts[key] == 1:
                result += key

        return result