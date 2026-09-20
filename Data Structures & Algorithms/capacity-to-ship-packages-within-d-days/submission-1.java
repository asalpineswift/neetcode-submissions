class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 1;
        int r = 0;
        for (int w : weights) {
            l = Math.max(l, w);
            r += w;
        }
        int lcw = r;

        while (l <= r) {
            int m = l + (r - l) / 2;
            int tw = 0;
            int d = 1; 
            
            for(int w : weights) {
                if(tw + w > m){
                    tw = 0;
                    d++;
                }
                tw += w;
            }
            
            if (d > days){
                l = m + 1;
            } else {
                lcw = m;
                r = m - 1;
            }
        }
        return lcw;
    }
}