class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for(int i=0;i<operations.length;i++){
            switch(operations[i]){
                case "+":{
                    Integer a =  stack.pop();
                    Integer b =  stack.peek();
                    stack.push(a);
                    stack.push(a+b);
                    break;
                }
                case "C":{
                    stack.pop();
                    break;
                }
                case "D":{
                    stack.push(stack.peek()*2);
                    break;
                }
                default:{
                    stack.push(Integer.parseInt(operations[i]));
                }
            }
        }
        while (!stack.isEmpty()){
            sum +=stack.pop();
        }
        return sum;
        
    }
}