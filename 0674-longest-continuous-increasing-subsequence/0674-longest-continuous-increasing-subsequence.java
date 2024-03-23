class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0)
            return 0;
        
        int count = 1;
        int ans = 1;
        for (int i=0 ; i<nums.length-1 ; i++){
            if(nums[i]<nums[i+1]){
                count ++;
            }
            else{
                ans = Math.max(ans, count);
                count = 1;
            }
        }
        ans = Math.max(ans,count);

        return ans;
    }
}