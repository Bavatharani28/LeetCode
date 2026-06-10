class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hmap=new HashMap<>();
        HashMap<Character,Integer> hmap1=new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            hmap1.put(ch,hmap1.getOrDefault(ch,0)+1);
        }
        int c=0;
        for(Map.Entry<Character,Integer> e:hmap.entrySet()){
            if(hmap1.containsKey(e.getKey())){
                int val=hmap1.get(e.getKey());
                if(val>=e.getValue())
                c++;
            }
        }
        if(c==hmap.size())
        return true;
        else
        return false;
    }
}