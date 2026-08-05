class Solution {
    public int longestSubarray(int[] nums) {
       int ans=0;
        int count=0, ind=0;
        int[] DP= new int[nums.length];
        for (int i=0; i<nums.length; i++){
            if (nums[i]==1) count++;
            if (nums[i]==0){
                DP[ind]=count;
                count=0;
                ind++;
            }
            if (i== nums.length-1 && nums[i]==1){
                DP[ind]=count;
            }
        }

        for (int i=1; i< DP.length; i++){
            ans = Math.max(ans,DP[i-1]+DP[i]);
        }

        if (ans== nums.length) return ans-1;

        return ans;
    }
}