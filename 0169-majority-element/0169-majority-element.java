class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int ans = nums[0];
        int count = 1;
        int max = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                    ans = nums[i - 1];
                }
                count = 1;
            }
        }
        if (count > max) {
            ans = nums[nums.length - 1];
        }
        return ans;
    }
}