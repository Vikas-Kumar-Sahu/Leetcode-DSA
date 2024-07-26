class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        // becuase if we don't found the target
        // then only left return the output were inserted target in order. 
        return left;
    }
}