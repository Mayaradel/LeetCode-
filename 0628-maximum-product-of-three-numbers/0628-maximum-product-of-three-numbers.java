class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int a= nums[0]*nums[1]*nums[n-1];
        int b= nums[n-3]*nums[n-2]*nums[n-1];
        return a>b? a:b;
        
    }
}