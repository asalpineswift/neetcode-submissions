class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null || t.length() != s.length()){
            return false;
        }
        Map<Character, Integer> sMap = toMap(s);
        Map<Character, Integer> tMap = toMap(t);
        for(Character ch: tMap.keySet()){
            if(!sMap.containsKey(ch) || sMap.get(ch).intValue() != tMap.get(ch).intValue()){
                return false;
            }
        }
        return true;
    }

    public HashMap<Character, Integer> toMap(String str) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        for (char ch: str.toCharArray()){
            if(sMap.containsKey(ch)){
                sMap.put(ch, sMap.get(ch).intValue()+1);
            }else{
                sMap.put(ch, 1);
            }
        }
        return sMap;
    }
}