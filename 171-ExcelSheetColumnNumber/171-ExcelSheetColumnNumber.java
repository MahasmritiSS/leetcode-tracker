// Last updated: 9/2/2026, 12:24:27 PM
class Solution {
    public int titleToNumber(String columnTitle) {
        int count=0;
        for(int i=0;i<columnTitle.length();i++){
            int num=columnTitle.charAt(i)-'A'+1;
          count=count*26+num;
        }
        return count;
    }
}