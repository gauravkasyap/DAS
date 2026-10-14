class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int maxSum = 0, numSum= sum;
        int[] number = new int[num];
        for(int i=0; i<num; i++){
          if(numSum>0){ 
            while (number[i]<9 && numSum>0){
                number[i]++;
                maxSum++;
                numSum--;
            }
          }
        }

        StringBuilder ans = new StringBuilder();
       if(maxSum==sum){ for(int i=0; i<num; i++){
          if(number[0]>0)  ans.append(number[i]);
        }}

        return ans.toString();
    }
}