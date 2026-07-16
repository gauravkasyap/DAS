class Solution {
    public long gcdSum(int[] nums) {
           int n = nums.length;
        int[] PGCD= new int[n];
        int mx = 0;
        for (int i =0; i<n; i++){
           if (mx<nums[i]) mx = nums[i];
           PGCD[i] = gcd(nums[i],mx);
        }
        Arrays.sort(PGCD);
        long ans =0;

        for (int i = 0, j = PGCD.length - 1; i < j; i++, j--){
            ans +=gcd(PGCD[i],PGCD[j]);
        }

        return ans;
    }

    public int gcd(int i, int j){
        while (j>0){
            int k = i%j;
            i=j;
            j=k;
        }
        return i;
    }
}