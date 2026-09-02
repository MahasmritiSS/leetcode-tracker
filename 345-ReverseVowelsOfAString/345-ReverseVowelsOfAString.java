// Last updated: 9/2/2026, 12:23:16 PM
class Solution {
    public static String reverseVowels(String s) {
        
    	int n =  s.length();
    	
    	int  l = 0;
    	int  r = n - 1;
    	
    	char c[] = s.toCharArray();
    	
    	while(l<r) {
    		
    		if(!isVowel(c[l])) {
    			l++;
    		}
    		
    		else  if (!isVowel(c[r])) {
    			r--;
    		}
    		
    		else {
    			
    			char temp = c[l];
    			
    			c[l] =  c[r];
    			c[r] = temp;
    			
    			l++;
    			
    			r--;
    			
    		}
    	}
    	
    	return new String(c);
    }
    
    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}