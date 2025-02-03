class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ans = 1;
        int countinc = 1;
        int countdec = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                countinc++;
                countdec = 1;
            } else if (nums[i] < nums[i - 1]) {
                countdec++;
                countinc = 1;
            } else {
                countinc = 1;
                countdec = 1;
            }
            ans = Math.max(ans, Math.max(countinc, countdec));
        }
        return ans;
    }
}