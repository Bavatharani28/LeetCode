// class Solution {

//     static void bc(int[] nums,int tar,int[] k,int i,int sum,boolean[] vis){
//         if (k[0] == 0) return;
//         if(sum==tar)
//         {
//             k[0]--;
//             bc(nums, tar, k, 0, 0, vis); 
//             return;
//         }
//         if(sum>tar)
//         return;
//         for(int j=i;j<nums.length;j++){
//             if(!vis[j]){
//                 vis[j]=true;
//                 if (j > i && nums[j] == nums[j - 1] && !vis[j - 1]) {
//                     continue;
//                 }
//             sum+=nums[j];
//             bc(nums,tar,k,j+1,sum,vis);
//             if (k[0] == 0) return; 
//             vis[j]=false;
//             sum-=nums[j];
//             }
//         }
//     }
//     public boolean canPartitionKSubsets(int[] nums, int k) {
//         int sum=0;
//         for(int i=0;i<nums.length;i++){
//             sum+=nums[i];
//         }
//         boolean[] vis = new boolean[nums.length]; 
//         int[] kWrapper = new int[]{k};
//         if(sum%k==0)
//         {
//             bc(nums,sum/k,kWrapper,0,0,vis);
//             //if(k==0)return true;
//         }
//         System.out.print(k);
//         if(kWrapper[0]==0)return true;
//         else
//         return false;
//     }
// }
class Solution {

    static void bc(int[] nums, int tar, int[] k, int i, int sum, boolean[] vis) {

        if (k[0] == 0)
            return;

        if (sum == tar) {
            k[0]--;
            bc(nums, tar, k, 0, 0, vis);
            if(k[0]==0)
            
            return;
             k[0]++;return;
        }

        if (sum > tar)
            return;

        for (int j = i; j < nums.length; j++) {

            if (vis[j])
                continue;

            vis[j] = true;

            bc(nums, tar, k, j + 1, sum + nums[j], vis);

            if (k[0] == 0)
                return;

            vis[j] = false;
        }
    }

    public boolean canPartitionKSubsets(int[] nums, int k) {

        int sum = 0;

        for (int x : nums)
            sum += x;

        if (sum % k != 0)
            return false;

        Arrays.sort(nums);

        boolean[] vis = new boolean[nums.length];

        int[] wrap = {k};

        bc(nums, sum / k, wrap, 0, 0, vis);

        return wrap[0] == 0;
    }
}