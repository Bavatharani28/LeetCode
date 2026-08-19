class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char c:t.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int l=0,st=0,c=t.length(),min=Integer.MAX_VALUE;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            if(map.containsKey(ch))
            {
                if(map.get(ch)>0)
                c--;
                map.put(ch,map.get(ch)-1);
            }
            while(c==0){
                if(r-l+1<min)
                {
                    min=r-l+1;
                    st=l;
                }
                char left=s.charAt(l);
                if(map.containsKey(left)){
                    map.put(left,map.get(left)+1);
                    if(map.get(left)>0)
                    c++;
                }
                l++;

            }
        }
        if(min!=Integer.MAX_VALUE)
        return s.substring(st,st+min);
        else
        return "";
    }
}