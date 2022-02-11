from collections import defaultdict

class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        counts = defaultdict(int)
        instance = []

        for key in arr:
            counts[key] += 1

        for key in counts:
            instance.append(counts[key])

        return len(instance) == len(set(instance))