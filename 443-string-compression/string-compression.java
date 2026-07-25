class Solution {
  public int compress(char[] chars) {
    int i = 0; 
    for (int j = 0; j < chars.length;) {
      final char letter = chars[j]; 
      int count = 0; 
      while (j < chars.length && chars[j] == letter) {
        ++count;
        ++j;
      }

      chars[i++] = letter;

      if (count > 1) {
        for (final char c : String.valueOf(count).toCharArray()) {
          chars[i++] = c;
        }
      }
    }

    return i;
  }
}