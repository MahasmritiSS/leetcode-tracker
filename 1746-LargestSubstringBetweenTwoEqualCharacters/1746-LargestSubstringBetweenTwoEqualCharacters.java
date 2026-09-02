// Last updated: 9/2/2026, 10:20:35 AM
class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max=-1,flag=0;
        int[]freq=new int[26];
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i)-'a';
            if(freq[c]!=0){
                max=Math.max(max,(i)-(freq[c]));
            }
            if(freq[c]==0)freq[c]=i+1;
        }
        return max;
    }
}