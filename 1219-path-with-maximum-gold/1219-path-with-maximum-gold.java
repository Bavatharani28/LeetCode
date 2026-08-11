class Solution {
    static int bc(int[][] arr,int n,int m,int i,int j,boolean[][] vis){
        if(i>n-1||j>m-1||i<0||j<0||vis[i][j]==true||arr[i][j]==0){
            return 0;
        }
        vis[i][j]=true;
        int sum=arr[i][j];
        int left=bc(arr,n,m,i,j-1,vis);
        int right=bc(arr,n,m,i,j+1,vis);
        int up=bc(arr,n,m,i-1,j,vis);
        int down=bc(arr,n,m,i+1,j,vis);
        vis[i][j]=false;
        return sum+Math.max(Math.max(left,right),Math.max(up,down));
    }
    public int getMaximumGold(int[][] grid) {
        int n=grid.length,m=grid[0].length;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0){
                    boolean vis[][]=new boolean[n][m];
                    max=Math.max(max,bc(grid,n,m,i,j,vis));
                }
            }
        }
        return max;
    }


}