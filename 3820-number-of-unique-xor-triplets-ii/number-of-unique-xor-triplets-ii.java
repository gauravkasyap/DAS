class Solution {
    public int uniqueXorTriplets(int[] nums) {
        HashSet<Integer> set =new HashSet<>();
        for(int i=0; i<nums.length; i++){
            for(int j =i; j<nums.length; j++){
              set.add(nums[i]^nums[j]);
            }
        }
        HashSet<Integer> ans =new HashSet<>();

        for(int n:set){
        for(int num:nums){
            ans.add(n^num);
        }
        }

        return ans.size();
    }
}