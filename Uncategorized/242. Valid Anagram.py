class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        count1 = [0] * 26
        count2 = [0] * 26

        lens = len(s)
        lent = len(t)

        if lens != lent:
            return False

        for i in range(lens):
            count1[ord(s[i]) - ord('a')] += 1
            count2[ord(t[i]) - ord('a')] += 1

        for i in range(26):
            if count1[i] != count2[i]:
                return False

        return True