class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        boolean check = true;
        int previous =10;
        while(n>=previous){
          n-=previous;
          previous--;
          check=!check;
        }
        return !check;
    }
}