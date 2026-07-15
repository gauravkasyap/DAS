class Solution {
    public String reverseWords(String s) {
         String[] strings = s.trim().split(" ");
        StringBuilder Sout = new StringBuilder();

        for (int i =strings.length-1; i>=0;i--) {
            if(!Objects.equals(strings[i], ""))  Sout.append(strings[i]);
          if (0!=i && !Objects.equals(strings[i], ""))Sout.append(" ");
        }
      return Sout.toString();
    }
}