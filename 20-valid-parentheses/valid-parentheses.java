class Solution {
    public boolean isValid(String s) {
      Stack<Character> set = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
               set.push(c);
            } else if(c==')' && set.size()>0){
                char m = set.peek();
               if(m!='(') return false;
               set.pop();
            }else if(c=='}' && set.size()>0){
                char m = set.peek();
                if(m!='{') return false;
                set.pop();
            }else if(c==']' && set.size()>0){
                char m = set.peek();
                if(m!='[') return false;
                set.pop();
            }else{
                return false;
            }
        }
        if(set.size()>0) return false; 
        return true;
    }
}