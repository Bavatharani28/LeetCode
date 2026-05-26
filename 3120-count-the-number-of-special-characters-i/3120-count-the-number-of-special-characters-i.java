class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer> hs=new HashMap<>();
        HashMap<Character,Integer> hs1=new HashMap<>();
        int c=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch>='a'&&ch<='z') 
            {
                hs.put(ch,hs.getOrDefault(ch,0)+1);
            }
            else{
                hs1.put(ch,hs1.getOrDefault(ch,0)+1);
            }
        
        }
        for(Map.Entry<Character,Integer> e:hs.entrySet()){
            char ch=e.getKey();
            char ch1=Character.toUpperCase(ch);
            if(hs1.containsKey(ch1)){
                c++;
            }
        }
        return c;

    }
}