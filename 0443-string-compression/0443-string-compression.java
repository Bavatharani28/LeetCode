class Solution {
    public int compress(char[] chars) {
        if(chars.length==1)return 1;
        String str="";
        int c=1;
        for(int i=1;i<chars.length;i++){
            if(chars[i]!=chars[i-1])
            {
                str+=chars[i-1];
                if(c!=1)
                str+=Integer.toString(c);
                c=1;
            }
            else
            c++;
            if(i==chars.length-1){
                str+=chars[i];
                 if(c!=1)
                str+=Integer.toString(c);

            }
           
        }
        System.out.print(str+" "+c);
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            chars[i]=ch;
        }
        return str.length();
    }
}