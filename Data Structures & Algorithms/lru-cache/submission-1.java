class LRUCache {

    Queue<Integer> que = new LinkedList<Integer>();
    Map<Integer, Integer> map = new HashMap<>();
    int capacity = 0;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        return map.getOrDefault(key, -1);
    }
    
    public void put(int key, int value) {
        if(que.size()>=capacity){
            int r = que.remove();    
            map.remove(r);
            
        }
        que.add(key);
        map.put(key, value);
    }
}
