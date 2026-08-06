class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n; i<200; i++){
            int product =1;
            int temp=i;
            while(i>0){
                product*=i%10;
                i/=10;
            }
            i=temp;
            if(product%t==0) return i;
        }

        return n;
    }
}