// Last updated: 9/2/2026, 12:21:01 PM
class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> set = new HashSet<Character>();
        for(char ch : s.toCharArray()) set.add(ch);
        return set.size();
    }
}