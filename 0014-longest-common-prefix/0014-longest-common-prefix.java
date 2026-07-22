class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s="";
      //  Arrays.sort(strs);
        String fs=strs[0],ls=strs[strs.length-1];
        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(fs)){
                fs=fs.substring(0,fs.length()-1);
            }
        }
        return fs;
    }
}