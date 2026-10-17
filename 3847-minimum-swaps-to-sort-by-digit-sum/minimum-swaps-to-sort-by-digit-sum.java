class Solution {
    public int minSwaps(int[] nums) {
         int ans =0;
        Integer[] digSum= new Integer[nums.length];
        HashMap<Integer,Integer> set = new HashMap<>();
        for (int i=0; i< nums.length; i++){
            digSum[i] = nums[i];
        }
        Arrays.sort(digSum,this::compareBySum);
        for (int i=0; i<nums.length; i++){
            set.put(nums[i],i);
        }
        for (int i=0; i<nums.length; i++){
            int expectVal = digSum[i];
            int currVal= nums[i];
            if (currVal!=expectVal){
                int idx = set.get(expectVal);

                nums[i] = expectVal;
                nums[idx] = currVal;

                set.put(expectVal,i);
                set.put(currVal,idx);
                ans++;
            }

        }

        return ans;
    }

     public int compareBySum(int num1, int num2){
         int a = getDigitSum(num1);
         int b = getDigitSum(num2);

         if (a!=b) return Integer.compare(a,b);

         return Integer.compare(num1,num2);
     }

     public int getDigitSum(int n){
         int sum = 0;
         while (n>0){
             sum+=n%10;
             n/=10;
         }
         return sum;
     }
}