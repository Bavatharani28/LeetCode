class Solution {
    static void subset(List<List<Integer>> list,List<Integer> lis,int[] nums,int n,int i){
        list.add(new ArrayList(lis));
        if(i==n)
        return;
        for(int j=i;j<n;j++){
            lis.add(nums[j]);
            subset(list,lis,nums,n,j+1);
            lis.remove(Integer.valueOf(nums[j]));
        }


    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> lis=new ArrayList<>();
        int i=0;
        subset(list,lis,nums,nums.length,i);
        return list;
    }
}