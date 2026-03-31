class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int p = k%n;
        int temp[] = new int[p];
        for (int i = 0;i<p;i++){
            temp[i] =nums[n-p+i];
        }
        int j = n-1;
        for(int i=n-p-1; i>=0;i--){
            nums[j] = nums[i];
            j--;
        } 
        for ( int i = 0; i < p; i++){
            nums[i] = temp[i];
        }
    }
}