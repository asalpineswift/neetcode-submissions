class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> freq = new HashMap<>();
        int l = 0, currMax = 0, max = 0;
        for (int r = 0; r < s.length(); r++) {
            char rCh = s.charAt(r);
            freq.put(rCh, freq.getOrDefault(rCh, 0) + 1);
            currMax = Math.max(currMax, freq.get(rCh));
            while (r - l + 1 - currMax > k) {
                char lCh = s.charAt(l);
                freq.put(lCh, freq.get(lCh) - 1);
                l++;
            }
            max = Math.max(r - l + 1, max);
        }
        return max;
    }
}
