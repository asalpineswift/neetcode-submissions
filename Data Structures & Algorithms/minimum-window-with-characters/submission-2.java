class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> tMap = new HashMap<>();
        HashMap<Character, Integer> sMap = new HashMap<>();

        IntStream.range(0,t.length()).forEach(num -> tMap.put(t.charAt(num), tMap.getOrDefault(t.charAt(num), 0)+1));

        int have = tMap.size();
        int[] index = {-1, -1};
        int min = s.length()+1;
        int need = 0, l = 0 ;

        for( int r = 0; r < s.length() ; r++){
            char ch = s.charAt(r);
            if(tMap.containsKey(ch)){
                sMap.put(ch, sMap.getOrDefault(ch, 0) +1);
            }

            if(tMap.containsKey(ch) && tMap.get(ch) == sMap.get(ch)){
                need++;
            }

            while(have == need){
                if(min > (r-l+1)){
                    index[0] = l;
                    index[1] = r;
                    min = r-l+1;
                }
                char lCh = s.charAt(l);
                if(tMap.containsKey(lCh)){
                    sMap.put(lCh, sMap.get(lCh)-1);
                   if(tMap.get(lCh) > sMap.get(lCh)) need--;
                }
                l++;

            }
        }
        return  (min == s.length()+1) ? "" : s.substring(index[0], index[1]+1); 
    }
}
