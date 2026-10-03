class Solution {
    public int longestValidParentheses(String s) {
        if (s.isEmpty()) return 0;
        Stack<Integer> set = new Stack<>();
        set.push(-1);
        int ans = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                set.push(i);
            }else {
                set.pop();
                if(set.isEmpty()){
                    set.push(i);
                }else{
                    ans = Math.max(ans,i-set.peek());
                }
            }
        }
        return ans;
    }
}