class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] < ans) {
                ans = nums[i] - nums[i - 1];
            }
        }
        
        return ans;
    }
}