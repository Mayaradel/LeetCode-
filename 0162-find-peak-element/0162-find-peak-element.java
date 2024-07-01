class Solution {
    public int findPeakElement(int[] nums) {

        int maxSoFar = Integer.MIN_VALUE;
        int index=0;

        for(int i = 0 ; i < nums.length; i++){
            if(nums[i]>maxSoFar){
                maxSoFar = nums[i];
                index = i;
            }
        }
        return index;
        
    }
}