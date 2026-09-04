class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max =0;
        for(int i=0; i<nums.length; i++){
          if(nums[i]>max) max = nums[i];
          int min = Integer.MAX_VALUE;
          int j=i;
          while(j<nums.length){
            if(min>nums[j]){
                min = nums[j];
            }
            j++;
          }
          int stable = max-min;

          if(stable<=k) return i;
        }

        return -1;
    }
}