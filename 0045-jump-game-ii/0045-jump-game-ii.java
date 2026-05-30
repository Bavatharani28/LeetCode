class Solution {
    public int jump(int[] nums) {
        int j=0;
        int cur=0;
        int step=0;
        for(int i=0;i<nums.length-1;i++){
            step=Math.max(step,i+nums[i]);
            if(i==cur){
                j++;
                cur=step;
            }
        }
        return j;
    }
}