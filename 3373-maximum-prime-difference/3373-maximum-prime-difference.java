class Solution {
    public int maximumPrimeDifference(int[] nums) {
        int min = -1;
        int max = -1;
        for (int i = 0; i < nums.length; i++){
            if (prime(nums[i])){
                if (min == -1){
                    min = i;
                }
                max = i;
            }
        }
        return Math.abs(max-min);
    }

    public static boolean prime(int n){
        if (n == 1){
            return false;
        }
        for (int i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}