class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        List<Integer> unique = new ArrayList<>();
        int max = 0,currMax=0;
        for (int num: nums){
            numSet.add(num);
        }
        for(int num:nums){
            if(!numSet.contains(num-1)){
                unique.add(num);
            }
        }
        for(Integer num: unique){
            int numValue = num;
            while(numSet.contains(numValue)){
                currMax++;
                numValue++;
            }
            max = Math.max(currMax, max);
            currMax = 0;
        }
        return max;
    }
}
