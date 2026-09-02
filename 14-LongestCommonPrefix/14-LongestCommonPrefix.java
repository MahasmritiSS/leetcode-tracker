// Last updated: 9/2/2026, 12:27:13 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s=strs[0];
        int n=strs.length;
        for(int i=0;i<n;i++){
            while(strs[i].indexOf(s)!=0){
                s=s.substring(0,s.length()-1);
                if(s.isEmpty()) return "";
            }
        }
        return s;
    }
}