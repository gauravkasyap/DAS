class Solution {
     long[][] pascal;
    long mod = 1000000007;
    public int numOfWays(int[] nums) {
          int n = nums.length;
        pascal = new long[n+1][n+1];
        for (int i=0; i<=n; i++){
            pascal[i] = new long[i+1];
            Arrays.fill(pascal[i],1);
            for (int j=1; j<i; j++){
                pascal[i][j] = (pascal[i-1][j-1]+pascal[i-1][j])%mod;
            }
        }
        List<Integer> array = new ArrayList<>();
        for (int j:nums) array.add(j);

      return (int)((solv(array)-1+mod)%mod);
    }
     public long solv(List<Integer> nums){
        int n =nums.size();
        if (n<3) return 1;
        List<Integer> leftArray= new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();
        int root = nums.getFirst();
        for (int i=1;i<n; i++){
            if (root>nums.get(i)) leftArray.add(nums.get(i));
            else rightArray.add(nums.get(i));
        }

        long x = solv(leftArray)%mod;
        long y = solv(rightArray)%mod;

        long z = pascal[n-1][leftArray.size()];

        return (((x*y)%mod)*z)%mod;
    }
}