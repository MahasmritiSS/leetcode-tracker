// Last updated: 9/2/2026, 12:19:09 PM
1class Solution {
2    public int maxDistinct(String s) {
3        HashSet<Character> set = new HashSet<Character>();
4        for(char ch : s.toCharArray()) set.add(ch);
5        return set.size();
6    }
7}