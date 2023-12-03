class Solution {
    public int searchInsert(int[] nums, int target) {
       int i=0;
       int j=nums.length-1;
       if(target>nums[j])
       return j+1;
       while(i<j){
           if(nums[i]<target){
               i++;
           }
           else if(nums[j]>target){
               j--;
           }
       }
       
        return i;
    }
}