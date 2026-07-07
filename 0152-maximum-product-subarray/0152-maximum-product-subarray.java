class Solution {
    public int maxProduct(int[] nums) {
        int maxpro=nums[0];
        int curmax=nums[0];
        int curmin=nums[0];
        for(int i=1;i<nums.length;i++){
            int t=curmax;
            curmax=Math.max(nums[i],Math.max(curmax*nums[i],curmin*nums[i]));
            curmin=Math.min(nums[i],Math.min(t*nums[i],curmin*nums[i]));
            maxpro=Math.max(curmax,maxpro);
        }
        return maxpro;
    }
}