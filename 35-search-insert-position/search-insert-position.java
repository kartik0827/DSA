class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int mid = start + (end - start)/2;

        while( start <= end) {
            if(target == nums[mid]){
                return mid;
            }
            else if( target > nums[mid]){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
            mid = start + (end - start)/2;
        }

        return start;
    }
}