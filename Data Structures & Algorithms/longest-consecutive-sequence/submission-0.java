class Solution {
    public int longestConsecutive(int[] nums) {
      if(nums.length==0 ) return 0;
        Arrays.sort(nums);
        int max = 0;
        int curr = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                curr++;
            } else if (nums[i] == nums[i + 1]) {
                continue;
            } else {
                max = Math.max(max, curr);
                curr = 0;
            }
        }
        return Math.max(max, curr)+1;  
    }
}
