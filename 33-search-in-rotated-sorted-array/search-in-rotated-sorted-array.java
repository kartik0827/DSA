class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int s =0;
        int e = n-1;

        while( s<=e){
            int mid = s + (e-s)/2;
            //target found
            if(nums[mid] == target){
                return mid;
            }

            if(nums[s] <= nums[mid]){
                if(nums[s] <= target && target < nums[mid]){
                    // move left
                    e = mid - 1;
                }
                else{
                    s = mid + 1;
                }
            }
            else{
                if(target > nums[mid] && target <= nums[e]){
                    s = mid + 1;
                }
                else{
                    e = mid-1;
                }
            }
        }
        return -1;
        
    }
}