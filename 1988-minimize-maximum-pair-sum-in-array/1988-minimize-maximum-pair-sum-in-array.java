class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        return maximum(nums, 0, nums.length - 1);
    }

    public int maximum(int[] nums, int i, int j){
        if (i > j){
            return 0;
        }
        return Math.max(nums[i] + nums[j], maximum(nums, ++i, --j));
    }
}