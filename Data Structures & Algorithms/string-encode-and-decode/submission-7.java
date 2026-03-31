class Solution {

    public String encode(List<String> strs) {
        StringBuffer sb = new StringBuffer();
        for(String str:strs){
            if(str.contains("&")){
                str=str.replace("&","@&");
            }
            sb.append("_&");
            sb.append(str);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> arr = new ArrayList();
        int begin=str.indexOf("_&") + 2;
        for(int i=begin;i<str.length(); i++){
            if(str.charAt(i)== '_'
                 &&  i+1 < str.length() 
                    &&  str.charAt(i+1)== '&'){
                String s = str.substring(begin,i);
                arr.add(s.replaceAll("@&", "&"));
                begin = i+2;
                i++;
            }
        }
        if(begin <= str.length()){
            arr.add(str.substring(begin,str.length()).replaceAll("@&", "&"));
        }
       // if(str.length()>0 && 
        return arr;

    }
}
