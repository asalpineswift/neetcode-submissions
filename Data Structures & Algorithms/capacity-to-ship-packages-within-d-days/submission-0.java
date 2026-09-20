class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 1;
        int r = 500;
        int lcw = r;

        while (l <= r) {
            int m = l + (r - l) / 2;
            int tw =0;
            int d = 0;
            boolean changeL = false;
            
            for(int w : weights) {
                tw += w;
                if( m < w) {
                    changeL = true;
                    break;
                }
                if(tw > m){
                    tw = w;
                    d++;
                }
            }
            if (d > days || changeL){
                changeL = false;
                l = m+1;
            } else if (d < days){
                lcw = m;
                r = m-1;
            }else{
                return m+1;
            }
        }
        return lcw;
    }
}