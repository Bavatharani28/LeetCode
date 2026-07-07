class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        rev(nums,0,nums.length-1);
        rev(nums,0,k-1);
        rev(nums,k,nums.length-1);
       
    }
    static void rev(int[] arr,int st,int en){
        while(st<=en){
            int t=arr[st];
            arr[st]=arr[en];
            arr[en]=t;
            st++;
            en--;
        }
    }
}