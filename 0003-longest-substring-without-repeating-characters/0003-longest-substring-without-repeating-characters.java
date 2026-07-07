class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hset=new HashSet<>();
        int l=0;
        int max=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            while(hset.contains(ch)){
                hset.remove(s.charAt(l));
                l++;
            }
            hset.add(ch);
            max=Math.max(max,r-l+1);
        }
        return max;
    }
}