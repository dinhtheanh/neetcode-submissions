class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        suffix = [1]
        prefix = [1]
        res = []
        start = 1
        end = len(nums) - 2
        cur_end = 1
        cur_start = 1
        while start < len(nums) and end > -1:
            cur_start = nums[start - 1] * cur_start
            cur_end = nums[end + 1] * cur_end
            prefix.append(cur_start)
            suffix.insert(0, cur_end)
            start += 1
            end -= 1
        for i in range(0, len(nums)):
            res.append(suffix[i] * prefix[i])
        return res