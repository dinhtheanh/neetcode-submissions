class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int target = nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int twoSum = nums[left] + nums[right];

                if (twoSum == -target) {
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    while (nums[right - 1] == nums[right] && right > left) {
                        right--;
                    }
                    right--;
                    left = i + 1;
                }
                else if (twoSum < -target) {
                    left++;
                }
                else if (twoSum > -target) {
                    right--;
                }
            }
        }

        return result;
    }
}
