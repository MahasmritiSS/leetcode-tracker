// Last updated: 9/2/2026, 12:24:48 PM
class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int n:nums){
            res ^= n;
        }
        return res;
    }
}