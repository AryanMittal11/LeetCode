class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ans = new String[n];
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        Collections.sort(list, (a, b) -> Integer.compare(score[b], score[a]));

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                ans[list.get(0)] = "Gold Medal";
            } else if (i == 1) {
                ans[list.get(1)] = "Silver Medal";
            } else if (i == 2) {
                ans[list.get(2)] = "Bronze Medal";
            } else{
                ans[list.get(i)] = String.valueOf(i + 1);
            }
        }

        return ans;
    }
}