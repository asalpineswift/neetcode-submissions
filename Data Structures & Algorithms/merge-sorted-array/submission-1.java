class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1;
        int p=m+n-1;
        int min = Math.min(m,n);
        while(i>=0 && j>=0){
            int tar;
            if(nums1[i] > nums2[j]){
                tar = nums1[i];
                i--;
            }else{
                tar = nums2[j];
                j--;
            }
            nums1[p] = tar;
            p--;
        }
        while(i>=0){
            nums1[p]=nums1[i];
            i--;
            p--;
        }
        while(j>=0){
            nums1[p]=nums2[j];
            j--;
            p--;
        }
        
    }
}