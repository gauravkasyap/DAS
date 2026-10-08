class Solution {
    public String removeOuterParentheses(String s) {
        String str="";
        int count=0;
        for(char c: s.toCharArray()){
            if(c=='('){
                if(count==0){
                    count++;
                    continue;
                }else{
                    str+='(';
                }
                count++;
            }else{
                if(count==1){
                    count--;
                    continue; 
                }else{
                    str+=')';
                }
                count--;
            }
        }

        return str;
    }
}