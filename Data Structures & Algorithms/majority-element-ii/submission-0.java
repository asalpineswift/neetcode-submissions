class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int r = 1;
        int[] curr = {nums[l], 1};
        List<Integer> maxList = new ArrayList<>();

        while (r<nums.length){
            if(nums[r] != nums[l]){
                l = r;
                if(curr[1] > nums.length/3) maxList.add(curr[0]);
                curr = new int[]{nums[l], 0};
            }
            curr[1]++;
            r++;
        }
         if(curr[1] > nums.length/3) maxList.add(curr[0]);
        return maxList;
    }
}