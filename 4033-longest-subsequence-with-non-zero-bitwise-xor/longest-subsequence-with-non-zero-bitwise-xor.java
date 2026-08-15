class Solution {
    public int longestSubsequence(int[] nums) {
        int total=0,n = nums.length;
        boolean nonZero =false;
        for(int x:nums){
            nonZero |=x>0;
            total^=x;
        }

        if(!nonZero) return 0;

        return total == 0? n-1:n;
    }
}