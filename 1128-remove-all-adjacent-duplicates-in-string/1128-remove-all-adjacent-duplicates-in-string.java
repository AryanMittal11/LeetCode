class Solution {
    public String removeDuplicates(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int n = sb.length();
            if (n > 0 && ch == sb.charAt(n - 1)) {
                sb.deleteCharAt(n - 1);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}