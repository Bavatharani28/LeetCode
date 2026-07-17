class Solution {
    public void gameOfLife(int[][] board) {
        int[][] dir={
            {-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}
        };
        int m=board.length,n=board[0].length;
        int ans[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int c=0;
                for(int k=0;k<8;k++){
                    int r=i+dir[k][0];
                    int col=j+dir[k][1];
                    if(r>=0&&r<m&&col>=0&&col<n){
                        if(board[r][col]==1)
                        c++;
                    }
                }
                if(board[i][j]==1){
                    if(c<2)
                    ans[i][j]=0;
                    else if(c==2||c==3)
                    ans[i][j]=1;
                    else if(c>3)
                    ans[i][j]=0;
                }
                if(board[i][j]==0){
                    if(c==3)
                    ans[i][j]=1;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                board[i][j]=ans[i][j];
            }
        }
    }
}