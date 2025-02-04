class Solution {
    public int maxAscendingSum(int[] nums) {
        int ans = 0;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                max += nums[i];
            } else {
                ans = Math.max(ans, max);
                max = nums[i];
            }
            
        }
        return Math.max(ans, max);
    }
}