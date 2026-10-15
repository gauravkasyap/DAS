class Solution {
    public int sumCounts(List<Integer> nums) {
       int ans =0;
     for(int i=0; i<nums.size(); i++){
        HashSet<Integer> contain = new HashSet<>();
        for(int j=i; j<nums.size(); j++){
            contain.add(nums.get(j));
            ans+=contain.size()*contain.size();
        }
     }

     return ans;
    }
}