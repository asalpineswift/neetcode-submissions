class Solution {
    public int majorityElement(int[] nums) {
                int count = 1, target=nums[0];
        for(int i=1;i<nums.length;i++){
            if(target==nums[i]){
                count++;
            }else{
                count--;
            }
            if(count<1){
                count = 1;
                target = nums[i];
            }
        }
        return target;
    }
}