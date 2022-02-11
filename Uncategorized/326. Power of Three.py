class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        if n < 1:
            return False
        temp = n
        while temp > 1:
            # print("temp / 3 != temp // 3 is ", temp / 3, temp // 3)
            if temp / 3 != temp // 3:
                return False
            temp //= 3
        return True
