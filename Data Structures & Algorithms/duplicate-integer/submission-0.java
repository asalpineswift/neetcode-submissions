class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set hashSet = new HashSet<Integer>();
        for(int i=0; i< nums.length; i++){
            Integer integer = Integer.valueOf(nums[i]);
            if(!hashSet.contains(integer)){
                hashSet.add(integer);
            }else{
                return true;
            }
        }
        return false;
    }
}
