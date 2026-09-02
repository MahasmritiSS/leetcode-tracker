// Last updated: 9/2/2026, 12:40:26 PM
class Solution {
    public int[] findArray(int[] pref) {
        int [] x=new int [pref.length];
        int or=0;
        for(int i=0;i<pref.length;i++){
            or^=pref[i];
            x[i]=or;
            or=pref[i];
        }return x;
    }
}