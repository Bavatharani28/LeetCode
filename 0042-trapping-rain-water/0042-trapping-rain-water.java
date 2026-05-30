class Solution {
    public int trap(int[] h) {
       int n=h.length;
       int l=0;int r=n-1; 
       int lmax=0,rmax=0,wat=0;
       while(l<r){
        if(h[l]<h[r]){
            lmax=Math.max(lmax,h[l]);
            wat+=lmax-h[l];
            l++;
        }
        else{
            rmax=Math.max(rmax,h[r]);
            wat+=rmax-h[r];
            r--;
        }
       }
       return wat;
    }
}