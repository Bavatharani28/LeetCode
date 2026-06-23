class Solution {
     static List<List<Integer>> list;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        list=new ArrayList<>();
        List<Integer> lis=new ArrayList<>();
        backtrack(candidates,target,0,lis); 
        return list;
    }
    public static void backtrack(int[] cand,int target,int in,List<Integer> lis){
        if(target==0)
        {
            list.add(new ArrayList<>(lis));
            return;
        }
        if(target<0)return;
        for(int i=in;i<cand.length;i++){
            lis.add(cand[i]);
            backtrack(cand,target-cand[i],i,lis);
            lis.remove(lis.size()-1);
        }
    }
    
}