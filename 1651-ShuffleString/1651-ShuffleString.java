// Last updated: 9/2/2026, 10:20:48 AM
class Solution {
    public String restoreString(String s, int[] indices) {
        char ch[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            ch[indices[i]]=s.charAt(i);
        }
        return new String(ch);
    }
}