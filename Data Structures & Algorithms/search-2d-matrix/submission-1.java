class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length;
        int l = 0;
        int r = matrix.length * matrix[0].length-1;
        while(l<=r){
            int mid = (l+r)/2;
            int i = mid/n;
            int j = mid%n;
            if(matrix[i][j] == target){
                return true;
            }
            else if(matrix[i][j] > target){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return false;
    }
}
