class Solution {
    List<String> ans = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        StringBuilder s = new StringBuilder();

        backtracking(0,s,0,n);

        return ans;
    }

    public void backtracking(int open,StringBuilder s, int close,int n){
        if(s.length()==2*n){
            ans.add(s.toString());
            return;
        }

        if(open<n){
            s.append("(");
            backtracking(open+1,s,close,n);
            s.deleteCharAt(s.length()-1);
        }

        if(close<open){
            s.append(")");
            backtracking(open,s,close+1,n);
            s.deleteCharAt(s.length()-1);
        }
    }
}