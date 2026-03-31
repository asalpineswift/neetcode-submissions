class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            String s = new String(str);
            if(map.get(s) == null){
                map.put(s, new ArrayList<>());
            }
            map.get(s).add(strs[i]);
        }
        List<List<String>> list = new ArrayList();
        map.forEach( (key,value) -> list.add(value));        
        return list;
    }
}
