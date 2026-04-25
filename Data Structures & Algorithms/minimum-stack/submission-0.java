class MinStack {
    public List<MinInt> arr;

    class MinInt {
        public int val;
        public int min;
        public MinInt( int val, int min){
            this.val = val;
            this.min = min;
        }
    }

    public MinStack() {
        arr = new ArrayList<>();
    }
    
    public void push(int val) {
        int min = val;
        if(arr.size() >0 ){
            min = Math.min(arr.getLast().min, val);
        }
        arr.add(new MinInt(val,min ));
    }
    
    public void pop() {
        arr.remove(arr.size()-1);
    }
    
    public int top() {
        return arr.getLast().val;
    }
    
    public int getMin() {
        return arr.getLast().min;
    }
}
