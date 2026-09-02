// Last updated: 9/2/2026, 12:25:52 PM
class Solution {
    public int lengthOfLastWord(String s) {
        int count=0,n=s.length()-1;
        while(n>=0 && s.charAt(n)==' '){
            n--;
        }
        while(n>=0 && s.charAt(n)!=' '){
            count++;
            n--;
        }
        return count;
    }
}