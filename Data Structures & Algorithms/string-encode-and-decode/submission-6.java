class Solution {

    public String encode(List<String> strs) {
        if(strs == null || strs.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length()).append('#').append(str);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> strList = new ArrayList<String>();
        if(str==null || str.length()==0) return strList;
        int i=0;
        
        while(i<str.length()){
            int j = i;
            while (str.charAt(j)!= '#'){
                j++;
            }
            int l = Integer.parseInt(str.substring(i,j));
            i = j + 1;
            j = i + l;
            strList.add(str.substring(i,j));
            i = j;
        }
        return strList;
    }
}
