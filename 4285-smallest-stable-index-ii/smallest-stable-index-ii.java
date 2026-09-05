class Solution {
    public int firstStableIndex(int[] nums, int k) {
       int max = nums[0],m=Integer.MAX_VALUE,tak=0; 
       for(int n=0; n<nums.length; n++ ){
         if(m>=nums[n]){
             m=nums[n];
             tak = n;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(max<nums[i]) max = nums[i];
            if(i>tak){
                int j=i,min=Integer.MAX_VALUE;
                while(j<nums.length){
                    if(min>=nums[j]) {
                        min = nums[j];
                        tak =j;
                    }
                    j++;
                }
                m=min;
            }
            int v = max-m;
            if(v<=k) return i;
        }
        return -1;
    }
}