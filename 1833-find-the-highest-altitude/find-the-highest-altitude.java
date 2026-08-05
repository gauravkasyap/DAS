class Solution {
    public int largestAltitude(int[] gain) {
        int ans=0,max=0;
        for(int n:gain){
            max+=n;
            ans=Math.max(ans,max);
        }
        return ans;
    }
}