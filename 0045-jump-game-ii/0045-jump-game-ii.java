class Solution {
    public int jump(int[] nums) {
        int j=0,cur=0,step=0;
        for(int i=0;i<nums.length-1;i++){
            step=Math.max(step,nums[i]+i);
            if(cur==i)
            {
                j++;
                cur=step;
            }
        }
        return j;
    }
}