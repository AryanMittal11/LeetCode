class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {
            int sub = nums[i] - nums[i - 1];
            if (sub < ans) {
                ans = sub;
            }
        }

        return ans;
    }
}