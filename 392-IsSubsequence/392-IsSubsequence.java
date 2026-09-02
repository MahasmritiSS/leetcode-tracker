// Last updated: 9/2/2026, 12:22:58 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length(),m=t.length();
        if(n>m) return false;
        int i=0,j=0;
        while(i<n && j<m){
            if(s.charAt(i)==t.charAt(j)) { i++;j++;}
            else j++;
        }
        return i==n;
    }
}