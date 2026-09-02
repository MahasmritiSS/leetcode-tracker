// Last updated: 9/2/2026, 10:26:41 AM
class Solution {
    public String reverseWords(String s) {

        String words[]=s.split(" ");
        StringBuilder sb=new StringBuilder();

        for(String str : words)
        {
            String rev=new StringBuilder(str).reverse().toString();
            sb.append(rev).append(" ");
        }
        return sb.toString().trim();
    }
}