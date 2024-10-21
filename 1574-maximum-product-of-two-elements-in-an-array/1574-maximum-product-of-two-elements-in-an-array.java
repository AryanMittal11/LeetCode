class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        int prevMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                prevMax = max;
                max = nums[i];
            } else if (nums[i] > prevMax) {
                prevMax = nums[i];
            }
        }

        return (prevMax - 1) * (max - 1);
    }
}