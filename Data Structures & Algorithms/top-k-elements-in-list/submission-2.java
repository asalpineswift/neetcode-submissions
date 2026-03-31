class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num: nums){
            freq.put(num, freq.getOrDefault(num, 0) +1);
        }
        List<Integer>[] bkt = new ArrayList[nums.length+1];
        
        for(Integer num: freq.keySet()){
            if(bkt[freq.get(num)] ==null){
                bkt[freq.get(num)] = new ArrayList();
            }
            bkt[freq.get(num)].add(num);
        }
        int n = nums.length;
        int[] arr = new int[k];
        int i =0;
        
        while (n>=0 && i<k){
            if(bkt[n] !=null &&  bkt[n].size()>0){
                for(int num:bkt[n] ){
                    if(i>=k){
                        break;
                    }
                    arr[i] = num;
                    i++;

                }
            }
            n--;
        }
        return arr;
    }
}
