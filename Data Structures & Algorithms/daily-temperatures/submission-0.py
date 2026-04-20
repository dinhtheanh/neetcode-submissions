class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        res = []
        for i in range(0, len(temperatures)):
            for j in range(i, len(temperatures)):
                if temperatures[i] < temperatures[j]:
                    res.append(j-i)
                    break
                if j == len(temperatures) - 1:
                    res.append(0)
        return res