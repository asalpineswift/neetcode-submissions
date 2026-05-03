class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return -1;
        }
        return binarySearch(0, nums.length-1, nums, target);
        
    }
    public int binarySearch(int l, int r, int[] nums, int target){
        if(l>r) return -1;
        int mid = l+(r-l)/2;
        if (nums[mid] == target) {
            return mid; 
        }else if( target < nums[mid]){
            return binarySearch(l, mid-1, nums, target);
        }else  {
            return binarySearch(mid+1, r, nums, target);
        }
        
    }
}
