class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for (int i = 0; i < details.length; i++) {
            String s = "" + details[i].charAt(11) + details[i].charAt(12);
            int age = Integer.parseInt(s);
            if (age > 60) {
                count++;
            }
        }
        return count;
    }
}