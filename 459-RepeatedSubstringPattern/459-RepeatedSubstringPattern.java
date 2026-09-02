// Last updated: 9/2/2026, 10:27:07 AM
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String t = s + s;
        if (t.substring(1, t.length() - 1).contains(s)) {
            return true;
        }
        return false;
    }
}