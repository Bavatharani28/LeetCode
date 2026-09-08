class Solution {
    static void ck(int i,int j,char[][] grid){
        if(i<0||j<0||i>grid.length-1||j>grid[0].length-1||grid[i][j]=='0')
        return;
        grid[i][j]='0';
        ck(i,j+1,grid);
        ck(i+1,j,grid);
        ck(i-1,j,grid);
        ck(i,j-1,grid);

    }
    public int numIslands(char[][] grid) {
        if(grid.length==0)
        return 0;
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    c++;
                    ck(i,j,grid);
                }
            }
        }
        return c;
    }
}