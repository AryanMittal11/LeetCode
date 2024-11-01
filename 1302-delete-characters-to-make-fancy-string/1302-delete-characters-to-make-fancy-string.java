class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (i < 2 || ch != ans.charAt(ans.length() - 1) || ch != ans.charAt(ans.length() - 2)) {
                ans.append(ch);
            } 
        }
        return ans.toString();
    }
}