class Solution {
    static void subsets(List<Integer> list,List<List<Integer>> llist,int i,int[] nums,int n){
        llist.add(new ArrayList(list));
        if(n==i){
            return;
        }
        for(int j=i;j<n;j++){
            list.add(nums[j]);
            subsets(list,llist,j+1,nums,n);
            list.remove(Integer.valueOf(nums[j]));
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> longlist=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        subsets(list,longlist,0,nums,nums.length);
        return longlist;
    }
}