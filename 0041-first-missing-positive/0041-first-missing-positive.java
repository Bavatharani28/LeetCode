class Solution {
    public int firstMissingPositive(int[] nums) {
        int i=0;
        for(i=0;i<nums.length;i++){
        while(nums[i]>0 && nums[i]<=nums.length && nums[nums[i]-1]!=nums[i]){
            
                int crtind=nums[i]-1;
                int t=nums[i];
                nums[i]=nums[crtind];
                nums[crtind]=t;
            
        }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i+1)
             return i+1;
        }
        return nums.length+1;
    }
}