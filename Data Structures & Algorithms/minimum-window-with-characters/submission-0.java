class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length())
            return "";
        char[] sChar = s.toCharArray();
        var tMap = new HashMap<Character, Integer>();
        var sMap = new HashMap<Character, Integer>();

        for (char ch : t.toCharArray()) {
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }
        int have = tMap.keySet().size();
        int need = 0, l = 0, r = 0;
        int[] index = new int[] {0, s.length()};
        int minLen = s.length();

        while (r < s.length()) {
            if (have == need) {
                if (!tMap.containsKey(sChar[l])) {
                    sMap.put(sChar[l], sMap.get(sChar[l]) - 1);
                    if (sMap.get(sChar[l]) <= 0)
                        sMap.remove(sChar[l]);
                    l++;
                    continue;
                }

                if (r - l + 1 < minLen) {
                    index[0] = l;
                    index[1] = r;
                    minLen = r - l + 1;
                }

                if (sChar[r] != sChar[l]) {
                    r++; 
                    continue;
                }else{
                    l++;
                }
                
            } else {
                sMap.put(sChar[r], sMap.getOrDefault(sChar[r], 0) + 1);
                if (sMap.get(sChar[r]) == tMap.get(sChar[r])) {
                    need++;
                }
            }
        }
        return s.substring(l, r);
    }
}
