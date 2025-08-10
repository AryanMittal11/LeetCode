class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> main = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            if (i > 0) {
                List<Integer> curr =  main.get(i - 1);
                for (int j = 0; j < curr.size() - 1; j++) {
                    list.add(curr.get(j) + curr.get(j + 1));
                } 
                list.add(1);
            }
            main.add(list);
        }
        return main;
    }
}