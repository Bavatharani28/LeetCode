class Solution {
    public String convert(String s, int n) {
        if(s.length()<=n||n==1)
        return s;
        List<StringBuilder> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new StringBuilder ());
        }
        int ind=0;
        int d=0;
        for(char ch:s.toCharArray()){
            list.get(ind).append(ch);
            if(ind==0)
            d=1;
            if(ind==n-1)
            d=-1;
            ind+=d;
        }
        StringBuilder res=new StringBuilder();
        for(StringBuilder ls:list){
            res.append(ls);
        }
        return res.toString();
    }
}