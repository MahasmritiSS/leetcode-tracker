// Last updated: 9/2/2026, 12:24:07 PM
class Solution {
    public boolean isIsomorphic(String s, String t) {
     Map<Character, Integer> map1 = new HashMap<>();
     Map<Character, Integer> map2 = new HashMap<>();

     for(Integer i = 0; i <s.length(); i ++) {
         if(map1.put(s.charAt(i), i) != map2.put(t.charAt(i), i))
         return false;
     }
     return true;
    }
}