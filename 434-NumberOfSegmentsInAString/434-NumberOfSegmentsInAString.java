// Last updated: 9/2/2026, 10:27:14 AM
class Solution {
    public int countSegments(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        if(s.equals("")) return 0;
        return s.split(" ").length;
    }
}