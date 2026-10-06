class Solution {
    static void dfs(int[] vis,List<List<Integer>> list,List<Integer> lis,int n,int[] nums){
        if(lis.size()==n){
        list.add(new ArrayList<>(lis));
        return;
        }
        for(int j=0;j<n;j++){
            if(vis[j]!=1){
                vis[j]=1;
                lis.add(nums[j]);
                dfs(vis,list,lis,n,nums);
                lis.remove(lis.size()-1);
                vis[j]=0;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> lis=new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        int n=nums.length;
        int[] vis=new int[n];
        Arrays.fill(vis,0);
        dfs(vis,list,lis,n,nums);
        return list;
    }
}