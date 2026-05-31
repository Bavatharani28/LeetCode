class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length(),s=needle.length();
        int ans=-1;
        for(int i=0;i<=n-s;i++){
            int c=0;
            for(int j=i;j<i+s;j++){
                if(haystack.charAt(j)==needle.charAt(j-i))
                c++;
                else
                break;
            }
            if(c==s)
            {
                return i;
            }
        }
       
        return -1;
    }
}