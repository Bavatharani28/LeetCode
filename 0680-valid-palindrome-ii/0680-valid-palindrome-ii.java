class Solution {
    public boolean validPalindrome(String s) {
       int left=0,right=s.length()-1;
       while(left<=right){
        if(s.charAt(left)==s.charAt(right)){
            left++;
            right--;
        }
        else{
            return palindrome(s,left+1,right)|| palindrome(s,left,right-1);
        }
       }
       return true;
    }
    boolean palindrome(String s,int st,int en){
        while(st<=en){
            if(s.charAt(st)!=s.charAt(en)){
                return false;
            }
            st++;
            en--;
        }
        return true;
    }
}