class Solution {
    public int removeDuplicates(int[] nums) {
    int k=0;
    int i=1;
    while (i<nums.length){
        if(nums[k]!=nums[i]){
            nums[k+1] = nums[i];
            k++;
        }
        i++;
    }
    return k+1;
        
    }
}