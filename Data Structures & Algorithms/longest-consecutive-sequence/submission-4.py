class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        # 2 3 4 4 5 10 20
        # 0 1 1 2 3 4 5 6

        # 0 1 2 4 6 7 8 9 10
        # for i = 1 to the end - 1:
        # is cur == next ?:
        #     yes: continue
        #     no:
        #     is cur == next - 1 ?
        #         cur_seq += 1
        #         no: if cur_seq.len > max.len:
        #             yes: replace
        #             no: start_counting again from 1
        nums.sort()
        cur_seq = 1
        max_len = 0
        if len(nums) > 0:
            max_len = 1
        else:
            max_len = 0
        print(nums)
        for index in range(1, len(nums)):
            if nums[index] == nums[index - 1]:
                continue
            if nums[index] == nums[index - 1] + 1:
                cur_seq += 1
            else:
                cur_seq = 1
            if cur_seq > max_len:
                max_len = cur_seq
            
        return max_len

