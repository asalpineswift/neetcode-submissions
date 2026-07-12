class LRUCache {
    Queue<Integer> que;
    int capacity;
    HashMap<Integer, Integer> map;

    public LRUCache(int capacity) {
        que = new LinkedList<Integer>();
        this.capacity = capacity;
        this.map = new HashMap<Integer, Integer>();
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            addElementAndEvictIfFull(key); 
            return map.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(!map.containsKey(key)){
            addElementAndEvictIfFull(key);
        }
        map.put(key, value);
    }

    private void addElementAndEvictIfFull(int key){
        que.add(key);
        if(que.size() > capacity){
            map.remove(que.poll());
        }
        
    }
}
