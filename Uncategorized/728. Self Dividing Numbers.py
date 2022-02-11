class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        low = left
        high = right + 1

        result = []
        for i in range(low, high):
            if i < 10:
                result.append(i)
            elif '0' in str(i):
                continue
            else:
                flag = True
                for n in str(i):
                    if i % int(n) != 0:
                        flag = False
                        break
                if flag:
                    result.append(i)

        return result
