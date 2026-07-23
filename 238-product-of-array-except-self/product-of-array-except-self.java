class Solution {
    public int[] productExceptSelf(int[] nums) {
        long total =1;
        int count=0;
        for(int n : nums){
            if(n==0){
                count++;
                continue;
            }else{
                total*=n;
            }
        }

        if(count>1){
            for(int i=0; i<nums.length; i++){
                nums[i]=0;
            }
        }else if(count==1){
            for(int i =0; i<nums.length; i++){
                if(nums[i]==0)nums[i]=(int)total;
                else nums[i]=0;
            }
        }else{
            for(int i=0; i<nums.length; i++){
                nums[i] = (int)total/nums[i];
            }
        }

        return nums;
    }
}