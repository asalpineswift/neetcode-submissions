class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        Map<Character, Character> hp = new HashMap<>();
        hp.put('[',']');
        hp.put('{','}');
        hp.put('(',')');

        for(int i=0;i<s.length(); i++){
            if(hp.containsKey(s.charAt(i))){
                st.push(hp.get(s.charAt(i)));
            }else if(st.peek() == s.charAt(i)){
                st.pop();
            }else{
                return false;
            }
        }
        return true;
        
    }
}
