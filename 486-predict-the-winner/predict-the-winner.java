class Solution {
    public boolean predictTheWinner(int[] nums) {
        int totalSum = 0;
        for (int n:nums){
            totalSum+=n;
        }
        int player1= solve(0,nums.length-1, nums);
        int player2 = totalSum-player1;

      return player1>=player2;
    }

    public int solve(int i,int j, int[] n){

     if (i>j) return 0;

     if (i==j) return n[i];
     
     
     int take_i= n[i]+ Math.min(solve(i+2,j,n),solve(i+1,j-1,n));
     int take_j = n[j]+ Math.min(solve(i,j-2,n),solve(i+1,j-1,n));

     return Math.max(take_i,take_j);
    }
}