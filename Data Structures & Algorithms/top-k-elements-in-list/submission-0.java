class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freqMap = new HashMap<Integer,Integer>();
        List<Integer> freqList[] = new List[nums.length];
        

        for(int i: nums){
            freqMap.put(i, freqMap.getOrDefault(i, 0)+1);
        }
        for(int num: freqMap.keySet()){
            int i = freqMap.get(num)-1;
            if(freqList[i]==null){
                freqList[i] = new ArrayList<Integer>();
            }
            freqList[i].add(num);
        }
        List<Integer> finalList = new ArrayList<Integer>();
        for(int pos=freqList.length-1 ; pos>=0; pos--){
            if(freqList[pos]==null){
                continue;
            }
            if(freqList[pos].size() > k){
                break;
            }

            finalList.addAll(freqList[pos]);
            k = k - freqList[pos].size();
        }
        int[] op = finalList.stream().mapToInt(i->i).toArray();
        if(op.length==0){
            op = new int[0];
            op[0] = -1;
        }
        return op; 
    }
}
