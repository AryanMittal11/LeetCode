class Solution {
    public String getSmallestString(String s) {
        StringBuilder ans = new StringBuilder(s);
        for (int i = 0; i < s.length() - 1; i++) {
            char ch = s.charAt(i);
            char ch1 = s.charAt(i + 1);
            if (ch % 2 == ch1 % 2) {
                if (ch > ch1) {
                    ans.setCharAt(i, ch1);
                    ans.setCharAt(i + 1, ch);
                    return ans.toString();
                }
            }
        }
        return ans.toString(); 
    }
}