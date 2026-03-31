class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int n = heights.length;
        for (int l=0;l<n;l++){
            int r = l+1;
            while (r<n){
                maxArea = Math.max(maxArea, (r-l)* Math.min(heights[l],heights[r]));
                    r++;
            }
        }
        
        return maxArea;
        
    }
}
