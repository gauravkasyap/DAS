class Solution {
    public int maximumLengthSubstring(String s) {
        int ans=0;

        for(int i=0; i<s.length(); i++){
            HashMap<Character, Integer> count = new HashMap<>();
            int length=0;
            for(int j=i; j<s.length(); j++){
                if(count.containsKey(s.charAt(j))){
                    if(count.get(s.charAt(j))>=2) break;
                    count.put(s.charAt(j),count.get(s.charAt(j))+1);
                }else{
                    count.put(s.charAt(j),1);
                }
                length++;
            }
            ans = Math.max(ans,length);
        }
        return ans;
    }
}