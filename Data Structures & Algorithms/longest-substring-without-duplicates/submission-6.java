class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = -1;
        int i = 0, j=1;
        Map<Character, Integer> chMap = new HashMap<>();        
        if(s.length() <= 1){
            return Math.max(max, s.length());
        }
        chMap.put(s.charAt(i), i);
        while ( i < j && j<s.length()){
            
            if(chMap.containsKey(s.charAt(j))){
                i = chMap.get(s.charAt(j))+1;   
            }
            chMap.put(s.charAt(j), j);
            max = Math.max(j-i+1, max); 
            j++;
        }
        return max;
    }
}
