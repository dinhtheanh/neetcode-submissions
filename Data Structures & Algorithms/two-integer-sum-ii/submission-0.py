class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        head = 0
        tail = len(numbers) - 1
        while (head < tail):
            s = numbers[head] + numbers[tail]
            diff = target - s
            if diff == 0:
                return [head + 1, tail + 1]
            if diff > 0:
                head += 1
            else:
                tail -= 1

        return []