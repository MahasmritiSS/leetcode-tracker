// Last updated: 9/2/2026, 10:20:18 AM
class Solution {
    public String truncateSentence(String s, int k) {
        int i,count=0;
        for(i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                count++;
            }
            if(count==k){
                break;
            }
        }
        return s.substring(0,i);
    }
}