class Solution {
    public int[] sortArray(int[] nums) {
        // merge sort
        // divide and conquer
 
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }

    public void mergeSort(int[] nums, int lp, int rp){
        if(lp>=rp){
            return;
        }
        int mp = (lp+rp)/2;
        mergeSort(nums, lp, mp);
        mergeSort(nums, mp+1, rp);
        merge(nums, lp, mp, rp);
    }

    public void merge(int[] nums, int lp, int mp, int rp){
        List<Integer> tempList = new ArrayList<Integer>();
        int llp = lp;
        int rlp = mp+1; 
        while(llp<=mp && rlp <=rp){
            if( nums[llp] <= nums[rlp]){
                tempList.add(nums[llp]);
                llp++;
            }else{
                tempList.add(nums[rlp]);
                rlp++;
            }
        }
        while(llp<=mp){
            tempList.add(nums[llp]);
            llp++;
        }
        while(rlp<=rp){
            tempList.add(nums[rlp]);
            rlp++;
        }
        int i=0;
        while(i<tempList.size()){
            nums[i+lp] = tempList.get(i);
            i++;
        }
        
    }
}