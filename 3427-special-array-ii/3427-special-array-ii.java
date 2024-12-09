class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] ans = new boolean[queries.length];
        int[] ids = new int[nums.length];
        int id = 0;
        ids[0] = id;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] % 2 == nums[i - 1] % 2) {
                id++;
            }
            ids[i] = id;
        }
        for (int i = 0; i < queries.length; i++) {
            int from = queries[i][0];
            int to = queries[i][1];
            ans[i] = ids[from] == ids[to];
        }
        return ans;
    }
}