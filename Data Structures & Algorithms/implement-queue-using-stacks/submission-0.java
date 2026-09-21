class MyQueue {

    Stack<Integer> pushStack;
    Stack<Integer> popStack;

    public MyQueue() {
        pushStack = new Stack<Integer>();
        popStack = new Stack<Integer>();        
    }
    
    public void push(int x) {
        while(!popStack.isEmpty()){
            pushStack.push(popStack.pop());
        }
        pushStack.push(x);

        while(!pushStack.isEmpty()){
            popStack.push(pushStack.pop());
        }

    }
    
    public int pop() {
        return popStack.pop();
    }
    
    public int peek() {
        return popStack.peek();
    }
    
    public boolean empty() {
        return popStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */