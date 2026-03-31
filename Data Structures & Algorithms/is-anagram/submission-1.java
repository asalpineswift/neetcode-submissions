class Solution {
    public boolean isAnagram(String s, String t) {
         if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> charMapS = getCount(s);
        Map<Character,Integer> charMapT = getCount(t);

        for(Character key: charMapS.keySet()){
            if(!charMapS.containsKey(key)){
                return false;
            }
            if(!charMapS.get(key).equals(charMapT.get(key))){
                return false;
            }
        }
        return true;
    }
    public static HashMap<Character,Integer> getCount(String str){
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for (char character : str.toCharArray()){
            if(map.containsKey(character)){
                map.put(character, map.get(character)+1);
            }else{
                map.put(character,1);
            }
        }
        return map;
    }
}
