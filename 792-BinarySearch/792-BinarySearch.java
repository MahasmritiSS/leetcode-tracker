// Last updated: 9/2/2026, 10:26:15 AM
class Solution {
    public int search(int[] nums, int target) {
       int left = 0;
       int right = nums.length-1;
       while(left<=right){
        int mid = (left+right)/2; 
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){//5<9
            left = mid+1;
        }
        else{
            right = mid-1;
        }
       }
       return -1;
    }
}