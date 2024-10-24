class Solution {
    public String removeStars(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            if (s1 == '*') {
                ans.deleteCharAt(ans.length() - 1);
            } else {
                ans.append(s1);
            }
        }
        return ans.toString();
    }
}