class Solution {
    static boolean ispal(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;

    } 
    static void backtrack(List<List<String>> list,List<String> lis,String s,int i,int n){
        if(i==n){
        list.add(new ArrayList(lis));
        return;
        }
        for(int j=i;j<n;j++){
            String str=s.substring(i,j+1);
            if(ispal(s,i,j)){
                lis.add(str);
                backtrack(list,lis,s,j+1,n);
                lis.remove(lis.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> list=new ArrayList<>();
        List<String> lis=new ArrayList<>();
        backtrack(list,lis,s,0,s.length());
        return list;
    }
}