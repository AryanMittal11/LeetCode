class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        boolean[] rowFlags = new boolean[m];
        boolean[] colFlags = new boolean[n];

        // Find all rows and columns that need to be zeroed
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rowFlags[i] = true;
                    colFlags[j] = true;
                }
            }
        }

        // Zero the marked rows
        for (int i = 0; i < m; i++) {
            if (rowFlags[i]) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Zero the marked columns
        for (int j = 0; j < n; j++) {
            if (colFlags[j]) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
