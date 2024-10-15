class Solution {
    public long minimumSteps(String s) {
        long count1 = 0;
        long ans = 0;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '1'){
                count1++;
            } else {
                ans += count1;
            }
        }
        return ans;
    }
}