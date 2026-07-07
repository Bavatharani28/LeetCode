class Solution {
    public int hIndex(int[] citations) {
        //if(citations.length==1&&citations[0]==1)return 1;
        Arrays.sort(citations);
        for(int r=0;r<citations.length;r++){
            int rem=citations.length-r;
            int c=0;
            for(int i=0;i<citations.length;i++){
                if(citations[i]>=rem)
                c++;
            }
            if(c>=rem)
            return rem;
        }
        return 0;
    }
}