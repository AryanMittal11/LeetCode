class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        boolean[] isBanned = new boolean[10001];
        int sum = 0;
        int count = 0;
        for (int num : banned) {
            isBanned[num] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (!isBanned[i]) {
                sum += i;
                if (sum > maxSum) {
                    return count;
                }
                count++;
            }
        }
        return count;
    }
}