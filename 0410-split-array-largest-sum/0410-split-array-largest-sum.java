class Solution {
    public int splitArray(int[] nums, int k) {
        int l=0,h=0;
        for(int n:nums){
            l=Math.max(n,l);
            h+=n;
        }
        while(l<=h){
            int mid=(l+h)/2;
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
            h=mid-1;
            else
            l=mid+1;
        }
        return l;
    }
}