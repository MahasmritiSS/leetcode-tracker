// Last updated: 9/2/2026, 12:24:10 PM
class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        while(n!=0){
            sum=0;
            while(n!=0){
                int last=n%10;
                sum=sum+last*last;
                n=n/10;
            }
            if(sum<=9){
                n=sum;
                break;
            }
            n=sum;
        }
        if(n==1 || n==7){
            return true;
        }
        else{
            return false;
        }
       
    }
}