class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans= Integer.MIN_VALUE;
        double totalK=0;
        for(int i=0; i<k; i++){
          totalK+=nums[i];
          ans =totalK/k;
        }
        int i=0;
        for(int j=k; j<nums.length; j++){
            double sum = totalK+nums[j]-nums[i];
            totalK=sum;
            ans = Math.max(ans, sum/k);
            i++;
        }
        return ans;
    }
}