// Last updated: 9/2/2026, 10:26:19 AM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        for(int i=0; i<jewels.length(); i++){
            for(int j=0; j<stones.length(); j++){
                if(jewels.charAt(i) == stones.charAt(j)) count++;
            }
        }
        return count;
    }
}