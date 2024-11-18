class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];
        if (k == 0) {
            return ans;
        }
        if (k > 0) {
            for (int i = 0; i < n; i++) {
                int j = i + 1;
                for (int b = 0; b < k; b++) {
                    if (j == n) {
                        j = 0;
                    }
                    ans[i] += code[j];
                    j++;
                }
            }
        }
        if (k < 0) {
            for (int i = 0; i < n; i++) {
                int j = i - 1;
                for (int b = k; b < 0; b++) {
                    if (j == -1) {
                        j = n - 1;
                    }
                    ans[i] += code[j];
                    j--;
                }
            }
        }
        return ans;
    }
}