class Solution {
    public String convert(String s, int n) {
        if(n==1)return s;
       StringBuilder[] sb=new StringBuilder[n];
       for(int i=0;i<n;i++){
        sb[i]=new StringBuilder();
       }
       int ind=0,d=-1;
       for(char ch:s.toCharArray()){
        sb[ind].append(ch);
        if(ind==0||ind==n-1){
        d=-d;
        }
        ind+=d;
       }
       StringBuilder res=new StringBuilder();
       for(StringBuilder str:sb){
        res.append(str);
       }
       return res.toString();
    }
}