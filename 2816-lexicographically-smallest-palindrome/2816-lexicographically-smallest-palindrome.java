class Solution {
    public String makeSmallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char ch1 = sb.charAt(i);
            char ch2 = sb.charAt(j);
            if (ch1 != ch2) {
                if (ch1 > ch2) {
                    sb.setCharAt(i, ch2);
                } else {
                    sb.setCharAt(j, ch1);
                }
            }
            i++;
            j--;
        }
        return sb.toString();
    }
}