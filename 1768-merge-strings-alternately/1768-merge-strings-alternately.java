class Solution {
    public String mergeAlternately(String word1, String word2) {
        Stack<Character> st1=new Stack<>();
        Stack<Character> st2=new Stack<>();
        for(int i=word1.length()-1;i>=0;i--){
            char ch=word1.charAt(i);
            st1.push(ch);
        }
        for(int i=word2.length()-1;i>=0;i--){
            char ch=word2.charAt(i);
            st2.push(ch);
        }
        String str="";
        while(true){
            if(!st1.isEmpty())
            str+=st1.pop();
            if(!st2.isEmpty())
            str+=st2.pop();
            if(st1.isEmpty()&&st2.isEmpty())
            break;
        }
        return str;
    }
}