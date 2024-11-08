class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int[] arr = new int[n];
        int k = 0;
        int mb = (int) Math.pow(2, maximumBit);
        for (int i = 0; i < n; i++) {
            k ^= nums[i];
            arr[n - i - 1] = k ^ (mb - 1);
        }
        return arr;
    }
}