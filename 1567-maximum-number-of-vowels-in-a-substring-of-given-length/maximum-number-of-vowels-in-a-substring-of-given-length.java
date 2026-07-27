class Solution {
    public int maxVowels(String s, int k) {
        int ans=0;
        int totals=0;
        for(int i=0; i<k;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
             totals+=1;
            }
        }
       ans = totals;
       if(k==ans) return ans;
       int j=0;
        for(int i=k; i<s.length(); i++){
            if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u'){
             ans = Math.max(ans,totals-1);
             totals--; 
            }

          if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
             ans = Math.max(ans,totals+1);
             totals++;
            }
            
            if(k==ans) return ans;
            j++;
        }

        return ans;
    }
}