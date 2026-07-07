class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min=nums.length+1;
        int l=0;
        int sum=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>=target){
                min=Math.min(min,r-l+1);
                sum-=nums[l];
                l++;
            }
        }
        if(min==nums.length+1)return 0;
        return min;

    }
}