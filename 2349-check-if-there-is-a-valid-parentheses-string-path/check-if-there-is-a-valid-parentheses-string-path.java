class Solution {
    private char[][] grid;
    private byte[][][] memo;
    private int m, n;

    public boolean hasValidPath(char[][] grid) {
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;
        int l= m+n-1;

        if(l %2 !=0 || grid[0][0]!='(' || grid[m-1][n-1] !=')'){
            return false;
        }

        memo = new byte[m][n][l+1];

        return dfs(0,0,0);
    }

    public boolean dfs(int r, int c, int b){
        b += grid[r][c] =='(' ? 1: -1;
        int remain = (m-1-r)+(n-1-c);

        if(b<0 || b>remain) return false;

        if(r == m-1 && c==n-1) return b==0;

        if(memo[r][c][b]!=0){
            return memo[r][c][b]==2;
        }

        boolean poss=(r+1<m && dfs(r+1,c,b)) || (c+1<n && dfs(r,c+1,b));

        memo[r][c][b] = (byte)(poss ?2:1);

        return poss;
    }
}