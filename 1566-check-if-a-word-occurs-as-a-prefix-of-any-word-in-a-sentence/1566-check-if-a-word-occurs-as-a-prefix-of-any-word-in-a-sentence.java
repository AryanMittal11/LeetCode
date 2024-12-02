class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int j = 0;
        int count = 1;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch == ' ') {
                j = i + 1;
                count++;
            } else {
                String s = sentence.substring(j, i + 1);
                if (s.equals(searchWord)) {
                    return count;
                }
            }
        }
        return -1;
    }
}