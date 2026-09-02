// Last updated: 9/2/2026, 10:26:11 AM
class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length()==goal.length() && (s + s).contains(goal);
    }
}