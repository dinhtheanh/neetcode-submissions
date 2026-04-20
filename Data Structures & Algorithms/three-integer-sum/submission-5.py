class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        # formula find 3 numbers nums[i] + nums[j] = -nums[k]
        # two sum: pair that sum up equal 0
        # pair equal -nums[k]
        # [-4,-1,-1,0,1,2]
        # -4
        result = []
        cur = 0
        while (cur < len(nums) - 2):
            if cur > 0 and nums[cur] == nums[cur-1]:
                cur += 1
                continue
            target = nums[cur] #target = -4
            start = cur + 1 #start =1
            end = len(nums) - 1 # 5
            while (start < end):
                if nums[start] + nums[end] > - target:
                    end -= 1
                    continue
                if nums[start] + nums[end] < -target:
                    start += 1
                    continue
                result.append([nums[cur], nums[start], nums[end]])
                start += 1
                while start < end and nums[start] == nums[start-1]:
                    start += 1
            cur += 1
            
        return result