class Solution {
    public int[] productQueries(int n, int[][] queries) {
        int[] ans = new int[queries.length];
        int kmax = 30;
        List<Integer> powers = new ArrayList<>();
        for (int i = 0; i < kmax; i++) {
            if ((n >> i & 1) == 1) {
                powers.add(1 << i);
            }
        }
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            long product = 1;
            for (int j = left; j <= right; j++) {
                product *= powers.get(j);
                product %= 1000000007;
            }
            ans[i] = (int) product;
        }
        return ans;
    }
}