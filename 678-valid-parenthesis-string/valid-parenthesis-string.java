class Solution {
    public boolean checkValidString(String s) {
       int count =0,count1=0; 
      for(int i=0; i<s.length(); i++){
        count+=s.charAt(i)=='('?1:-1;
        count1+=s.charAt(i)==')'?-1:1;

        if(count1<0) return false;

        count = Math.max(count,0);
      }

      return count==0;
    }
}