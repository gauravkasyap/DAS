class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
       int totalSum =0;
       for(int ns:nums){
        totalSum+=ns;
       }

       int leftSum=0;
        for(int k=0; k<n; leftSum +=nums[k++]){
            if(leftSum*2 == totalSum-nums[k]) return k;
        }

        return -1;
    }
}