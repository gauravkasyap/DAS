class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n =Math.max(word1.length(),word2.length());
        String s = "";
        int k=0,l=0,c=0;
        for (int i=0;i<n; i++){
            if (c==0 && k<word1.length()){
                s+=word1.charAt(k);
                c=1;
                k++;
            }else if (k>=word1.length()&& l<word2.length()){
                s+=word2.charAt(l);
                l++;
                c=1;
            }
            if (c==1 && l<word2.length()){
                s+=word2.charAt(l);
                c=0;
                l++;
            }else if (l>=word2.length() && k<word1.length()){
                s+=word1.charAt(k);
                c=0;
                k++;
            }
        }
        return s;
    }
}