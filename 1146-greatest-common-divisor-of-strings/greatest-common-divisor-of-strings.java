class Solution {
    public String gcdOfStrings(String str1, String str2) {
       if (!(str1 + str2).equals(str2 + str1)) return "";
        int a=str1.length(),b=str2.length();
        while (b>0){
            int k = a%b;
            a=b;
            b=k;
        }
        String SubGCD ="";

        for (int i=0; i<a;i++){
            SubGCD +=str1.charAt(i);
        }
        return SubGCD; 
    }
}