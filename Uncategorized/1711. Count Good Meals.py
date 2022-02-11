from collections import defaultdict

class Solution:
    def nC2(self, n):
        return n * (n - 1) // 2

    def countPairs(self, deliciousness):
        p = 1
        powers = [int] * 41
        for i in range(41):
            powers[i] = p
            p *= 2

        counts = defaultdict(int)
        length = len(deliciousness)

        for i in range(length):
            counts[deliciousness[i]] += 1

        result = 0
        for key in counts:
            for j in range(41):
                if abs(powers[j] - key) in counts and abs(powers[j] - key) >= key:
                    if abs(powers[j] - key) == key:
                        result += self.nC2(counts[key])
                    else:
                        result += counts[key] * counts[abs(powers[j] - key)]
        return result