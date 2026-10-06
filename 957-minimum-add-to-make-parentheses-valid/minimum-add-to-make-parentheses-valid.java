class Solution {
    public int minAddToMakeValid(String s) {
        int count0=0,count1=0;

        for(char c:s.toCharArray()){
            if(c=='(') count0++;
            else{
              if(count0>0)  count0--;
              else count1++;
            }
        }

        return count1+count0;
    }
}