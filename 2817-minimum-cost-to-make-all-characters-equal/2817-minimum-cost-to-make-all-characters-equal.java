class Solution {
    public long minimumCost(String s) {
        long cost = 0;
        int n = s.length();
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                cost += Math.min(i, n - i);
            }
        }
        return cost;
    }
}