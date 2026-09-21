class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
            if (count.size() > 2) {
                Map<Integer, Integer> newCount = new HashMap<>();
                for(Integer k : count.keySet()){
                    int val = count.get(k).intValue();
                    if (val > 1) newCount.put(k, val-1);
                } 
                count = newCount;
            }
        }
        List<Integer> arr = new ArrayList<>();
        for(Integer k: count.keySet()) count.put(k, 0);
        for(Integer num: nums){
            if(count.containsKey(num)){
                count.put(num, count.get(num) +1);                
            }
        }
        for(Integer k: count.keySet()) {
            if(count.get(k) > nums.length/3)  arr.add(k);
        }
        return arr;
    }
}