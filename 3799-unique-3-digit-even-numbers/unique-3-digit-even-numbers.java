class Solution {
    public int totalNumbers(int[] digits) {
        int n =digits.length;
       HashSet<Integer> checkNum = new HashSet<>();
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
               for(int k=0; k<n && i!=j; k++){
                int num = digits[i]*100+digits[j]*10+digits[k];
                if(j!=k && i!=k && !checkNum.contains(num)&& num>99 &&num%2==0){
                    checkNum.add(num);
                }
               }
            }
        }

        return checkNum.size();
    }
}