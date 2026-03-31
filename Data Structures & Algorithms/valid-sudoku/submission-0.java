class Solution {
    public boolean isValidSudoku(char[][] board) {
        return rowCheck(board) && columnCheck(board) && boxCheck(board);
        
    }

    // row check, - column fixed
    public boolean rowCheck(char[][] board){
        for(int i=0;i<9;i++){
            Set<Character> num = new HashSet();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.' && num.contains(board[i][j])){
                    return false;
                }else{
                    num.add(board[i][j]);
                }
            }
        }
        return true;
    }
    public boolean columnCheck (char[][] board){
         for(int i=0;i<9;i++){
            Set<Character> num = new HashSet();
            for(int j=0;j<9;j++){
                if(board[j][i]!='.' && num.contains(board[j][i])){
                    return false;
                }else{
                    num.add(board[j][i]);
                }
            }
        }
        return true;

    }
    public boolean boxCheck(char[][] board){
        int i=0,j=0;
        while(i<3){
            while(j<3){
                Set<Character> num = new HashSet();
                for(int x=0+(i*3);x<3+(i*3);x++){
                    for(int y=0+(j*3);y<3+(j*3);y++){
                        if(board[x][y]!='.' && num.contains(board[x][y])){
                            return false; 
                        }else{
                            num.add(board[x][y]);
                        }
                    }
                }
                j++;
            }
            i++;
            j=0;
        }
        return true;
    }
}
