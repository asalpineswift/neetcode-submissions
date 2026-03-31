class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arrList = new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i] ==nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = nums.length-1;
            boolean match = false;
            while(j<k){
                int sum = nums[j]+nums[k];
                if (sum == -1*nums[i]){
                    arrList.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                }else if( sum < -1* nums[i]){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return arrList;

    }
}
