class Solution {
    static boolean safe(int n,char[][]queen,int r,int c){
        for(int i=0;i<n;i++){
            if(queen[i][c]=='Q')
            return false;
        }
        for(int i=r-1,j=c-1;i>=0&&j>=0;i--,j--){
            if(queen[i][j]=='Q')
            return false;
        }
        for(int i=r-1,j=c+1;i>=0&&j<n;i--,j++){
            if(queen[i][j]=='Q')
            return false;
        }
        return true;
    }
    static void bc(int n,char[][] queen,List<List<String>> list,int i){
        if(i==n){
            List<String> ls=new ArrayList<>();
            for(char[] ch:queen){
                ls.add(new String(ch));
            }
            list.add(ls);
            return;
        }
        for(int j=0;j<n;j++){
            if(safe(n,queen,i,j)){
                queen[i][j]='Q';
                bc(n,queen,list,i+1);
                queen[i][j]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list=new ArrayList<>();
        char[][] queen=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                queen[i][j]='.';
            }
        }
        bc(n,queen,list,0);
        return list;
    }
}