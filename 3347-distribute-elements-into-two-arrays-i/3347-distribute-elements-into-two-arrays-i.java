class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1 = new int[nums.length];
        int[] arr2 = new int[nums.length];
        int x = 0; 
        int y = 0;
        arr1[0] = nums[0];
        arr2[0] = nums[1];
        for (int i = 2; i < nums.length; i++){
            if (arr1[x] > arr2[y]){
                ++x;
                arr1[x] = nums[i];
            } else {
                ++y;
                arr2[y] = nums[i];
            }
        }
        for (int i = 0; i <= y; i++){
            arr1[x + 1] = arr2[i];
            x++;
        }
        return arr1;
    }
}