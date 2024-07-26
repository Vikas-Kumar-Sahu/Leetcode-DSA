// int[] empty = [];
//         sort(nums,0,nums.length);
//         for(int i=0; i<nums.length; i++){
//            if(nums[i] != value){
//                empty[i] = nums[i];
//            }
//         }
//         return empty;

class Solution {
    public int removeElement(int[] nums, int val) {
        int result=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }
}
