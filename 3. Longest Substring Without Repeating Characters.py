class Solution:
    def __init__(self):
        self.length = 0
        self.flagForCharsUsed = [False] * 256
        self.lastInstance = [None] * 256

    def lengthOfLongestSubstring(self, s: str) -> int:
        n = len(s)
        currentLength = 0
        iterator = 0

        while iterator < n:
            # in case the char is already available
            if self.flagForCharsUsed[ord(s[iterator])]:
                iterator = self.lastInstance[ord(s[iterator])] + 1
                if self.length < currentLength:
                    self.length = currentLength
                currentLength = 0
                self.flagForCharsUsed = [False] * 256
                self.lastInstance = [None] * 256
            else:
                self.flagForCharsUsed[ord(s[iterator])] = True
                self.lastInstance[ord(s[iterator])] = iterator
                currentLength += 1
                iterator += 1

        if self.length < currentLength:
            self.length = currentLength

        return self.length