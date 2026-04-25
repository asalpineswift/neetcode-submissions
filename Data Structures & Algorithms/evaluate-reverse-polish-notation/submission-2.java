class Solution {
    public int evalRPN(String[] tokens) {
        Set<String> operators = Set.of("+", "-", "/" ,"*");
        Stack<Integer> cal = new Stack<>();
        for(int i =0;i<tokens.length;i++){
            if(operators.contains(tokens[i])){
                int after = cal.pop();
                int before = cal.pop();
                cal.push(operation(tokens[i], after, before));
            }else{
                cal.push(Integer.parseInt(tokens[i]));
            }
        }
        return cal.pop();

    }
    public int operation(String operator, int after, int before){
        switch (operator){
            case "+": return before + after;
            case "-": return before - after;
            case "/": return before / after;
            case "*": return before * after;
        }
        return 0;
    }
    
    
}
