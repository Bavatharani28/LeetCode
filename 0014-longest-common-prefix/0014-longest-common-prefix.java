class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
        Arrays.sort(strs);
        String fs=strs[0],ls=strs[strs.length-1];
        for(int i=0;i<fs.length();i++){
            if(fs.charAt(i)==ls.charAt(i))
            s+=fs.charAt(i);
            else
            break;
        }
        return s;
    }
}