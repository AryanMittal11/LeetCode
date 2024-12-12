class Solution {
    public long pickGifts(int[] gifts, int k) {
        for (int i = 0; i < k; i++) {
            long max = 0;
            int maxIndex = -1;
            for (int j = 0; j < gifts.length; j++) {
                if (gifts[j] > max) {
                    max = gifts[j];
                    maxIndex = j;
                }
            }
            gifts[maxIndex] = (int) (Math.sqrt(max));
        }
        long ans = 0;
        for (int i = 0; i < gifts.length; i++) {
            ans += gifts[i];
        }
        return ans;
    }
}