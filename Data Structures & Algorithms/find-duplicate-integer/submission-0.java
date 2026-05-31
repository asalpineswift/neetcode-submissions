class Solution {
    public int findDuplicate(int[] nums) {
        int max = 0;
        int sum = 0;
        int l = nums.length;
        for(int num:nums){
            max = Math.max(num, max);
            sum += num;
        }
        int uniqSum = max * (max+1) / 2;
        int r = l - max;
        return (sum-uniqSum)/r;
    }
}
