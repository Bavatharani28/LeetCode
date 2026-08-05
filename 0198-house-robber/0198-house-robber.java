class Solution {
    static int bc(int[] nums,int i,int[] dp){
        if(i>=nums.length)
        return 0;
        if(dp[i]!=-1)return dp[i];
        int a=nums[i]+bc(nums,i+2,dp);
        int b=bc(nums,i+1,dp);
       return dp[i]=Math.max(a,b);
    }
    public int rob(int[] nums) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        return bc(nums,0,dp);  
    }
}