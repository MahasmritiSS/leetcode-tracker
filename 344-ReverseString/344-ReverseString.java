// Last updated: 9/2/2026, 12:23:21 PM
class Solution {
    public void reverseString(char[] s) {
        int l=s.length-1;
        for(int i=0;i<=l/2;i++)
        {
            char ch=s[i];
            s[i]=s[l-i];
            s[l-i]=ch;
        }
    }
}