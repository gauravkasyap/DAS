class Solution {
    List<String> ans = new ArrayList();
    String[] alp = {"","","abc","def", "ghi","jkl", "mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        StringBuilder s = new StringBuilder();
        backtracking(s,0, digits);

        return ans;
    }

    public void  backtracking( StringBuilder s, int n, String digits ){
        if(s.length()==digits.length()){
           ans.add(s.toString());
           return;
        }
        
        String temp = alp[digits.charAt(n)-'0'];
        for(char c: temp.toCharArray()){
            s.append(c);

            backtracking(s,n+1,digits);
            s.deleteCharAt(s.length()-1);
        }
    }
}