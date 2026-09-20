class MyStack {
    // receiver queue becomes empty,
    // retriever queue becomes - full, but interchangeably.
    Queue<Integer> receiverQueue;
    Queue<Integer> retrieverQueue;

    public MyStack() {
        receiverQueue = new LinkedList<Integer>();
        retrieverQueue = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        receiverQueue.offer(x);
        while(!retrieverQueue.isEmpty()){
            receiverQueue.offer(retrieverQueue.poll());
        }
        Queue<Integer> temp = receiverQueue;
        receiverQueue = retrieverQueue;
        retrieverQueue = temp;
    }
    
    public int pop() {  
        return retrieverQueue.poll();
    }
    
    public int top() {
        return retrieverQueue.peek();
    }
    
    public boolean empty() {
        return retrieverQueue.isEmpty();
    }

}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */