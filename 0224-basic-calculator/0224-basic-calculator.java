class Solution {
    public int calculate(String s) {
        Stack<Integer> st=new Stack<>();
        int res=0,num=0,sign=1;
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            else if(c=='+'){
                res+=num*sign;
                sign=1;
                num=0;
            }
            else if(c=='-'){
                res+=num*sign;
                sign=-1;
                num=0;
            }
            else if(c=='('){
                st.push(res);
                st.push(sign);
                res=0;
                sign=1;
            } 
            else if(c==')')
            {
                res+=sign*num;
                num=0;
                int ps=st.pop();
                int pr=st.pop();
                res=pr+ps*res;
            }       
        }
        res+=sign*num;
        return res;
    }
}