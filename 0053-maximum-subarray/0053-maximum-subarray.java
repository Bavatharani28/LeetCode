class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=nums[0],cursum=0;
        for(int i=0;i<nums.length;i++){
            cursum=Math.max(nums[i],cursum+nums[i]);
            maxsum=Math.max(cursum,maxsum);
        }
        return maxsum;
    }
}