class Solution {
    public boolean sumGame(String num) {
          int countL = 0,countR=0, leftSum=0, rightSum=0;
        for(int i=0; i<num.length(); i++){
            if(i<num.length()/2 && num.charAt(i)!='?'){
                leftSum += num.charAt(i)-'0';
            }else if ('?'==num.charAt(i) && i<num.length()/2) {
                countL++;
            }else if ('?'==num.charAt(i) && i>=num.length()/2) {
                countR++;
            }else {
                rightSum+=num.charAt(i)-'0';
            }
        }
        if((countL+countR)%2!=0) return true;
        else {
         int diff = leftSum-rightSum;
         int target = (countR-countL)/2*9;
         if(diff==target){
            return false;
         }else{
            return true;
         }
        }
    }
}