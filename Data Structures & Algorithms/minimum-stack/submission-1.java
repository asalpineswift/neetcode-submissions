class MinStack {
    private Stack<MinInt> arr;

    class MinInt {
        public int val;
        public int min;
        public MinInt( int val, int min){
            this.val = val;
            this.min = min;
        }
    }

    public MinStack() {
        arr = new Stack<>();
    }
    
    public void push(int val) {
        int min = val;
        if(!arr.isEmpty()){
            min = Math.min(arr.peek().min, val);
        }
        arr.push(new MinInt(val,min ));
    }
    
    public void pop() {
        arr.pop();
    }
    
    public int top() {
        return arr.peek().val;
    }
    
    public int getMin() {
        return arr.peek().min;
    }
}
