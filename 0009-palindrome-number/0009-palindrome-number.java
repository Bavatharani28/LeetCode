class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        boolean neg=false;
        if(x<0)
        neg=true;
        int rev=0;
        while(x!=0)
        {
            int d=x%10;
            rev=rev*10+d;
            x/=10;
        }
        if(rev==n&&!neg){
            return true;
        }
        else{
            return false;
        }
    }
}