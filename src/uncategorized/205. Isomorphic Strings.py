class Solution:
    def __init__(self):
        self.mappedChar = [None] * 256
        self.mappingFlag1 = [False] * 256
        self.mappingFlag2 = [False] * 256

    def isIsomorphic(self, s: str, t: str) -> bool:
        n = len(s)

        for i in range(n):
            if self.mappingFlag1[ord(s[i])] and self.mappingFlag2[ord(t[i])]:
                if self.mappedChar[ord(s[i])] != t[i]:
                    return False
            elif self.mappingFlag1[ord(s[i])] and not self.mappingFlag2[ord(t[i])]:
                return False
            elif self.mappingFlag2[ord(t[i])] and not self.mappingFlag1[ord(s[i])]:
                return False
            else:
                self.mappingFlag1[ord(s[i])] = True
                self.mappingFlag2[ord(t[i])] = True
                self.mappedChar[ord(s[i])] = t[i]

        return True