// Last updated: 9/2/2026, 12:25:37 PM
class Solution {
    public int mySqrt(int x) {
        long left = 1;
        long right= x/2;
        if(x==1){
            return 1;
        }
        while(left<=right){
            long mid = (left+right)/2;
            if(mid*mid==x){
                return (int)mid;
            }
            else if(mid*mid>x){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return (int)right;
    }
}