class Solution {
    public boolean canJump(int[] nums) {
        int reachpos=0;
        for(int i=0;i<nums.length;i++){
           if(i>reachpos){
            return false;
           } 
           reachpos=Math.max(reachpos,i+nums[i]);
        }
        return true;
    }
}