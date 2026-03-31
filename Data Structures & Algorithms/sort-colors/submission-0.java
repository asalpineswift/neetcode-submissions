class Solution {
    public void sortColors(int[] nums) {        
        int k = nums.length-1;
        int i = 0;
        while(k>0){
            while(i<k ){
            if(nums[i]>nums[i+1]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;    
            }
            i++;    
        }
        i=0;
        k--;
        }
        

    }
    

}