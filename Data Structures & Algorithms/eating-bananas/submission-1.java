class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles)
                    .max()
                    .getAsInt(); // this is a hard ceiling as per the requirement. so no choice.
        int res = r;

        // There is only one option here, find all the possible matches through binary search
        while (l <= r) {
            int th = 0; 
            int m = l + (r -l)/2;
            for (int pile : piles) {
                th += Math.ceil((double) pile / m);
            }
            if (th <= h) {
                res = m;
                r = m - 1;
            } else{
                l = m+1;
            }
        }
        return res;
    }
}
