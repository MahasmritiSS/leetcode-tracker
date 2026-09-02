// Last updated: 9/2/2026, 12:24:02 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        while(n%2==0){
            n=n/2;
        }
        if(n==1){
            return true;
        }
        else{
            return false;
        }

       
    }
}