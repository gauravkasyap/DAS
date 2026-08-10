class Solution {
    public boolean winnerSquareGame(int n) {
        int max = 100000;
        boolean[] dp = new boolean[max+1];
        for(int i=0; i<=max; i++){
            if(dp[i]) continue;

            for(int j=1;j*j<=max-i; j++){
                dp[i+ j*j] =true;
            }
        }
       
       return dp[n];
    }
}