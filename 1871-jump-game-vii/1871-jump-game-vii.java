class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n=s.length();
        boolean dp[]=new boolean[n];
        dp[0]=true;
        int end=0;
        for(int i=0;i<n;i++){
            if (!dp[i]) continue;
                int st=Math.max(end+1,i+minJump);
                int en=Math.min(n-1,i+maxJump);
            
            for(int sh=st;sh<=en;sh++){
                if(s.charAt(sh)=='0')
                dp[sh]=true;
            }
            end=en;
            
        }
        return dp[n-1];
    }
}



// for(int i=1;i<n;i++){
//             if(s.charAt(i)=='0'){
//                 if(i-minJump>=0&&i-minJump<n&&dp[i-minJump]==true)
//                 {
//                     dp[i]=true;
//                 }
//                 if(i-maxJump>=0&&i-maxJump<n&&dp[i-maxJump]==true){
//                     dp[i]=true;
//                 }
//             }
//         }
//         return dp[n-1];