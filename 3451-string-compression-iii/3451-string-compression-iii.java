class Solution {
    public String compressedString(String word) {
        StringBuilder ans = new StringBuilder();
        int count = 1;
        int n = word.length();
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if (i < n - 1 && ch == word.charAt(i + 1)) {
                if (count == 9) {
                    ans.append(count);
                    ans.append(ch);
                    count = 0;
                }
                count++;
            } else {
                ans.append(count);
                ans.append(ch);
                count = 1;
            }
        }
        return ans.toString();
    }
}