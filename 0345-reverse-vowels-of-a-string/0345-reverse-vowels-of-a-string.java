class Solution {
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int l = 0; 
        int r = s.length() - 1;
        while (l < r) {
            while (l < r && !("aeiouAEIOU".contains(String.valueOf(s.charAt(l))))) {
                l++;
            }
            while (l < r && !("aeiouAEIOU".contains(String.valueOf(s.charAt(r))))) {
                r--;
            }
            sb.setCharAt(l, s.charAt(r));
            sb.setCharAt(r, s.charAt(l));
            l++;
            r--;
        }
        return sb.toString();
    }
}