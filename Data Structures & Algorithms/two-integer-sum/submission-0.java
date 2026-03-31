class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length ; i++){
            if(map.containsKey(Integer.valueOf(target-nums[i]))){
                int otherValue = map.get(Integer.valueOf(target-nums[i])).intValue();
                return new int[]{otherValue,i};
            }
            map.put(Integer.valueOf(nums[i]),Integer.valueOf(i));
        }
        return null;
    }
}
