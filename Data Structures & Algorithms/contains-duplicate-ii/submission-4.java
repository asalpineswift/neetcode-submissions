class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,List<Integer>> numSet = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            
            numSet.putIfAbsent(nums[i], new ArrayList<Integer>());
            numSet.get(nums[i]).add(i);
        }
        for(int num:numSet.keySet()){
            int prev = -1;
            for(int j:numSet.get(num)){
                if(prev <0){
                    prev = j;
                    continue;
                }
                if(Math.abs(j-prev)<=k) return true;
                prev = j;
            }
        }
        return false;

    }
}