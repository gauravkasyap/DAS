class Solution {
    public int maxLength(int[] nums) {
      int n = nums.length;
        int ans =0;
        for (int i=0; i<n; i++){
            int prod= 1, gcd= nums[i],lcm= nums[i], count=0;;
            for (int j=i; j<n; j++){
                gcd = GCD(gcd, nums[j]);
                lcm = LCM(lcm, nums[j]);
                prod*= nums[j];
                count++;
                if ((prod==gcd*lcm)){
                 ans = Math.max(ans,count);
               }
            }
        }

        return ans;
    }

    public int GCD(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int LCM(int a, int b){
        int x =a;
        int y=b;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return (x*y)/a;
    }
}