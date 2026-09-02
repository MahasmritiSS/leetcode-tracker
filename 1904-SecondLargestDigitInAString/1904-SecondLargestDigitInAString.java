// Last updated: 9/2/2026, 12:21:30 PM
class Solution {
    public int secondHighest(String s) {
        int largest = -1;
        int second = -1;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch >= '0' && ch <= '9'){
                int digit = ch -'0';

                if(digit > largest){
                    second = largest;
                    largest = digit;
                }
                else if(digit > second && digit != largest){
                    second = digit;
                }
            }
        }


    return second;
        
    }
}