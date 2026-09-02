// Last updated: 9/2/2026, 10:26:28 AM
class Solution {
    public String toLowerCase(String s) {
        char[] chars = s.toCharArray();

        for(int i = 0; i < chars.length; i++){
            if(chars[i] >= 'A' && chars[i] <= 'Z'){
                chars[i] = (char)(chars[i] + 32);
            }
        }
        return new String(chars);
    }
}
