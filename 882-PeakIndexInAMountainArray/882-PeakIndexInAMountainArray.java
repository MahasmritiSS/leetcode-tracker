// Last updated: 9/2/2026, 10:26:03 AM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      int left = 1;
      int right = arr.length-2;
      while(left<=right){
        int mid = (left+right)/2;
        if(arr[mid] > arr[mid-1] && arr[mid]>arr[mid+1]){
            return mid;
        }
        else if(arr[mid]<arr[mid-1]){
            right =mid-1;
        }
        else{
            left=mid+1;
        }
      } 
      return -1; 
    }
}