class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;
        int[] count = new int[n + 1];
        for (int i = 0; i < n; i++) {
            if (arr[i] <= n) {
                count[arr[i]]++;
            }
        }
        for (int i = n; i >= 1; i--) {
            if (count[i] == i) {
                return i;
            }
        }
        return -1;
    }
}