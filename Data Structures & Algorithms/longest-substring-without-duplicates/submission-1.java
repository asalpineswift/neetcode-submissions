class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longStrLength=0;
        for (int i=0;i<s.length(); i++){
            Set<Character> set = new HashSet<Character> ();
            for (int j=i; j<s.length();j++){
                if(set.contains(Character.valueOf(s.charAt(j)))){ 
                    break;
                }
                set.add(Character.valueOf(s.charAt(j)));
            }
            if(set.size()>longStrLength){
                longStrLength=set.size();
            }
            
        }
        return longStrLength;
    }
}
