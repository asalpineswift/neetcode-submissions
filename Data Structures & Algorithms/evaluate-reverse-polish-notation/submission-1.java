class Solution {
    public int evalRPN(String[] tokens) {
        int before = Integer.parseInt(tokens[0]);
        String after = "0" ;
        boolean isN = true;
        for (int i =1; i<tokens.length; i++){
            if(isN){
                after = tokens[i];
                isN = false;
            }else{
                before = operation(tokens[i], before, after);
                isN = true;
            }
        }
        return before;

    }
    
    public int operation(String operator, int before, String after){
        int afterInt = Integer.parseInt(after);

        switch(operator){
            case "+": return before + afterInt;
            case "-": return before - afterInt;
            case "/": return before / afterInt;
            case "*" : return before * afterInt;
            default:
                return 0;
        }
        
    }
}
