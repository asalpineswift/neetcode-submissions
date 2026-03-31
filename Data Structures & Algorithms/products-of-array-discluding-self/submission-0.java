class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        // only approach I could think of is solving it through division
        // log is doable but the problem is it's complex computation
        int multiply = 1;
        int zeroIndex = -1;
        boolean isTwice= false;

        for (int i=0;i<nums.length;i++){
            if(nums[i] !=0){
                multiply*=nums[i];
            }else{
                if(zeroIndex>=0){
                    multiply = 0;
                }else{
                    zeroIndex = i;
                }
            }
        }
        int[] arr = new int[nums.length];
        for ( int i=0;i<nums.length;i++){
            if(zeroIndex >=0 && i!=zeroIndex){
                arr[i] = 0;
            }else if(nums[i]!=0){
                arr[i] = multiply/nums[i];
            }else{
                arr[i] = multiply;
            }
        }
        return arr;
    }
}  
