class Solution {
    public int maxProduct(int n) {
        int[] nums = new int[10];
        int i=0;
        while(n>0){
         nums[i] =n%10;
         i++;
         n/=10; 
        }
        Arrays.sort(nums);

        return nums[nums.length-2]*nums[nums.length-1];
    }
}