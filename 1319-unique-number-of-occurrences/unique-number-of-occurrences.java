class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> set = new HashMap<>();
        for(int n:arr){
          if(set.containsKey(n)){
            set.put(n,set.get(n)+1);
          }else {
            set.put(n,1);
          }
        }
        HashSet<Integer> ans= new HashSet<>();
        for(int n: set.keySet()){
            int key = set.get(n);
            if(ans.contains(key)){
                return false;
            }else{
                ans.add(key);
            }
        }
        return true;
    }
}