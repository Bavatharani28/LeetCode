class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0,high=0;
        for(int n:nums){
            low=Math.max(n,low);
            high+=n;
        }
        while(low<=high){
            int mid=(low+high)/2;
            int ans=1,sum=0;
            for(int n:nums){
                if(sum+n>mid)
                {
                    ans++;
                    sum=n;
                }
                else
                sum+=n;
            }
            if(ans<=k)
            high=mid-1;
            else
            low=mid+1;
        }
        return low;
    }
}