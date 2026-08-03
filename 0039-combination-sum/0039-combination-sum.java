class Solution {
    static void com(Set<List<Integer>> llist,List<Integer> list,int[] cand,int tar,int sum,int j){
        if(sum==tar){
            llist.add(new ArrayList(list));
            return ;
        }
        if(sum>tar)
        return ;
        for(int i=j;i<cand.length;i++){
            sum+=cand[i];
            list.add(cand[i]);
            //Collections.sort(list);
            com(llist,list,cand,tar,sum,i);
            sum-=cand[i];
            list.remove(list.size()-1);

        }
    }
    public List<List<Integer>> combinationSum(int[] cand, int tar) {
        Set<List<Integer>> llist=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        // Arrays.sort(cand);
        com(llist,list,cand,tar,0,0);
        return new ArrayList<>(llist);
    }
}