class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            str+=Character.toLowerCase(ch);
        }
        System.out.println(str);
        StringBuilder sb=new StringBuilder(str);
        String sb1=sb.reverse().toString();
        System.out.print(sb1);
        if(str.equals(sb1))
        return true;
        return false;
    }
}