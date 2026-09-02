// Last updated: 9/2/2026, 10:25:48 AM
class Solution {
    public int[] decompressRLElist(int[] nums) {
       ArrayList<Integer> list = new ArrayList<>();

       for(int i = 0; i < nums.length; i++){
           if(i%2 == 0){
           for(int j = 0; j < nums[i]; j++){
               list.add(nums[i+1]);
           }}
       }

        int[] decomp = new int[list.size()];

       for(int i = 0; i < list.size(); i++){
           decomp[i] = list.get(i);
       } 

       return decomp;
    }
}