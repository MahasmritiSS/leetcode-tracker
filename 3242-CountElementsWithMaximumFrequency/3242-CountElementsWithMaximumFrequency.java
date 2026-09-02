// Last updated: 9/2/2026, 10:20:26 AM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        byte[] freq = new byte[101];
        byte max = 0, res = 0;
        for (int n : nums) {
            byte f = ++freq[n];
            if (f > max) {
                max = f; res = f;
            } else if (f == max) 
                res += f;
        }
        return res;
    }
}