class Solution {
    public String simplifyPath(String path) {
        String[] arr=path.split("/");
        Stack<String> st=new Stack<>();
        for(String ele : arr){
            if(ele.equals("")||ele.equals("."))continue;
            if(ele.equals(".."))
            {
                if(!st.isEmpty())
                st.pop();
            }
            else
            st.push(ele);
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
        {
            sb.insert(0,"/"+st.pop());
        }
        if(sb.length()==0)
        return "/";
        else
        return sb.toString();
    }
}