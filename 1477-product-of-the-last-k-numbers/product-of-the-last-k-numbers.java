class ProductOfNumbers {
    List<Integer> nums= new ArrayList<>();
    public ProductOfNumbers() {
        
    }
    
    public void add(int num) {
        nums.add(num);
    }
    
    public int getProduct(int k) {
        int ans=1;
        for(int i= nums.size()-1; i>=0 && k>0; i--){
            ans*=nums.get(i);
            k--;
        }

        return ans;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */