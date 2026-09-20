class Solution {
    public int mySqrt(int x) { 
        int l = 1, r = x, min = 1;
        if (x < 1) return 0;

        while (l<=r){
            int m = l + (r-l)/2;
            if( (long) m * m <= x){
                min = m;
                l = m+1;
            }else {
                r = m-1;
            }
        }
        return min;
    }
}