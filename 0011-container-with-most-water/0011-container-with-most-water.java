class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0,r=n-1;
        int ma=0;
        while(l<r){
            int w=r-l;
            int h=Math.min(height[l],height[r]);
            ma=Math.max(ma,w*h);
            if(height[l]<height[r])
            l++;
            else
            r--;
        }
        return ma;
    }
}