// Last updated: 9/2/2026, 12:24:24 PM
class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>0){
            n=n/5;
            count=count+n;
            }
            return count;
    }        
}