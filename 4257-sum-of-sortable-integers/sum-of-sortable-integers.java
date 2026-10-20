class Solution {
    public int sortableIntegers(int[] nums) {
       int n = nums.length;
        int ans=0;
        int[] sortabel= Arrays.copyOf(nums,n);
        Arrays.sort(sortabel);
        for (int k=1; k<=n; k++){

           if (n%k==0) {
               boolean fina= true;
               for (int i = 0; i <n; i += k) {
                   int[] block = Arrays.copyOfRange(nums, i, i + k);
                   int[] sortB = Arrays.copyOfRange(sortabel, i, i + k);

                   if(!isRotation(block,sortB)){
                       fina = false;
                       break;
                   }
               }
               if (fina) ans+=k;
           }
        }

        return ans;
    }
   public void computeLPS(int[] pattern, int[] lps) {
        int M = pattern.length;
        int len = 0;
        lps[0] = 0;

        int i = 1;
        while (i < M) {
            if (pattern[i] == pattern[len]) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }

   public boolean search(int[] pat, int[] txt) {
        int N = txt.length;
        int M = pat.length;

        int[] lps = new int[M];
        computeLPS(pat, lps);

        int i = 0;
        int j = 0;

        while (i < N) {
            if (pat[j] == txt[i]) {
                i++;
                j++;
            }

            if (j == M) {
                return true;
            } else if (i < N && pat[j] != txt[i]) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return false;
    }

   public boolean isRotation(int[] vec1, int[] vec2) {
        int[] txt = new int[vec2.length * 2];
        System.arraycopy(vec2, 0, txt, 0, vec2.length);
        System.arraycopy(vec2, 0, txt, vec2.length, vec2.length);
        return search(vec1, txt);
    }
}