class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        int first = 0;
        int second = 0;
        for (int i = 0; i < nums.length; i++) {
            if (m.get(target - nums[i]) != null) {
                if (i < m.get(target - nums[i])) {
                    first = i;
                    second = m.get(target - nums[i]);
                } else {
                    second = i;
                    first = m.get(target - nums[i]);
                }
                
            }
            else {
                m.put(nums[i], i);
            }
        }
        int [] result = {first, second};
        return result;
    }
}
