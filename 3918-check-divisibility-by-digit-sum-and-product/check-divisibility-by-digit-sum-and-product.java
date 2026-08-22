class Solution {
    public boolean checkDivisibility(int n) {
      int s =0, m =1, t = n;  
      while(t>0){
        s+=t%10;
        m*=t%10;
        t/=10;
      }

      int sum = s+m;

      return n%sum==0;
    }
}