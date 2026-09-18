class Solution {
    public boolean validWordSquare(List<String> words) {
        int col = 0
        int row = words.size();

        for(String word:words){
            col = Math.max(col, word.size());
        }
        int[][] arr= new int[row][col];
        
        int i =0;
        for(int word: words){
            for(int j=0; j<word.length(); j++){
                arr[i][j] = word.charAt(i);
            }
            i++;
        }
        // compare the arr;
        int i=0;
        for( int j = 0; j< col; j++){
            i
        }

    }
}
