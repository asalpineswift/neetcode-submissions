class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length;
        int COLS = matrix[0].length;

        int fI = 0, lI = ROWS-1;
        int row=0;
        while(fI<=lI){
            row = fI + (lI-fI)/2;
            if(target > matrix[row][COLS-1]){
                fI = row+1;
            }else if (target < matrix[row][0]){
                lI = row-1;
            }else{
                break;
            }
        }
        fI = 0;
        lI = COLS-1;
        while (fI<=lI){
            int mid = fI + (lI-fI)/2;
            if(target > matrix[row][mid]){
                fI = mid+1;
            }else if( target < matrix[row][mid]){
                lI = mid-1;
            }else {
                return true;
            }
        }
        return false;
        
    }
    
}
