class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            int j = 0;
            while (j < arr.length) {
                if(arr[i] == 2 * arr[j] && j != i){
                    return true;
                } else {
                    j++;
                }
            }
        }
        return false;
    }
}