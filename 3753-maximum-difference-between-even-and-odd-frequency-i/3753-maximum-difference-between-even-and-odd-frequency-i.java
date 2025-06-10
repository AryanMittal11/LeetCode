class Solution {
    public int maxDifference(String s) {
        int count[] = new int[26];
        int maxOdd = 0;
        int minEven = s.length();
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] == 0) {
                continue;
            } else if (count[i] % 2 == 0) {
                minEven = Math.min(minEven, count[i]);
            } else {
                maxOdd = Math.max(maxOdd, count[i]);
            }
        }
        return maxOdd - minEven;
    }
}