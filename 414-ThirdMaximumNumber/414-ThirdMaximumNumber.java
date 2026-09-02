// Last updated: 9/2/2026, 10:27:28 AM
import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for (int n : nums) s.add(n);
        
        if (s.size() < 3) return Collections.max(s);
        
        s.remove(Collections.max(s));
        s.remove(Collections.max(s));
        
        return Collections.max(s);
    }
}