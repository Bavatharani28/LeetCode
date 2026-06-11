class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hmap=new HashMap<>();
        for(String str:strs){
            char[] ch=str.toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            if(!hmap.containsKey(s)){
                hmap.put(s,new ArrayList<>());
            }
            hmap.get(s).add(str);
        }
         List<List<String>> list=new ArrayList<>();
        for(List<String> val:hmap.values()){
            list.add(val);
        }
        return list;
    }
}