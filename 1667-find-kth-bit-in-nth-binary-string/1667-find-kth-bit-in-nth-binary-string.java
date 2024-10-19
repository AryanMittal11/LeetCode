class Solution {
    public char findKthBit(int n, int k) {
        String ans = s(n);
        return ans.charAt(k-1);
    }

    public String s(int n) {
        if (n == 1) {
            return "0";
        }
        String prev = s(n-1);
        return prev + "1" + invert(prev).reverse();
    }

    public StringBuilder invert(String s) {
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char bit = s.charAt(i);
            if (bit == '0') {
                s1.append('1');
            } else {
                s1.append('0');
            }
        }
        return s1;
    }
}