class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int n:nums)
        hs.add(n);
        int longest=0;
        for(int num:hs){
            if(!hs.contains(num-1)){
                int curr=num;
                int con=1;
                while(hs.contains(curr+1)){
                    curr++;
                    con++;
                }
                longest=Math.max(longest,con);
            }
        }
        return longest;
    }

}