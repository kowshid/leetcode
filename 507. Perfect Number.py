class Solution:
    def checkPerfectNumber(self, num: int) -> bool:
        if num < 6:
            return False

        result = 1

        for i in range(2, int(math.sqrt(num)) + 1):
            if num % i == 0 and num // i > i:
                result += i
                result += num // i
                # print("i, num//i = ", i, num//i)
                # print("result = ", result)

        if result == num:
            return True
        else:
            return False