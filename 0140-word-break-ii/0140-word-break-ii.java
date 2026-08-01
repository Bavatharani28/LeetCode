class Solution {
    List<String> list=new ArrayList<>();
    Set<String> set;
    public List<String> wordBreak(String s, List<String> wordDict) {
        set=new HashSet<>(wordDict);
        backtrack(s,0,new ArrayList<>());
        return list;
    }
    public void backtrack(String s,int start,List<String> path){
        if(start==s.length()){
            list.add(String.join(" ",path));
            return;
        }
        for(int end=start+1;end<=s.length();end++){
            String str=s.substring(start,end);
            if(set.contains(str)){
                path.add(str);
                backtrack(s,end,path);
                path.remove(path.size()-1);
            }
        }
    }
}