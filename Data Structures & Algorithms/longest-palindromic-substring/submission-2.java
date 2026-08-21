class Solution {
    public String longestPalindrome(String s) {
        int[] res = new int[2];
        for(int i=0; i<s.length(); i++){
            //odd length
            res = findPalindrome(i, i, res, s);
            //even length
            res = findPalindrome(i, i+1, res, s);
            return s.subString(res[0], res[0]+res[1]);
        }
        
    }

    private int[] findPalindrome(int l, int r, int[] res, String s){
        int resIdx = res[0];
        int resLen = res[0];
         while (l >= 0 && r < s.length() &&
                   s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > resLen) {
                    resIdx = l;
                    resLen = r - l + 1;
                }
                l--;
                r++;
            }
        return new int[]{resIdx, resLen};
    }
}
