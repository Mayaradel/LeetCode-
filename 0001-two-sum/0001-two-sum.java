class Solution {

    public int[] twoSum(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target)
        //         return new int[]{i,j};
        //     }
        // }
        // return new int[]{};

    int n = nums.length;
    int ans[] = new int[2];
    
    HashMap<Integer, Integer> mp = new HashMap<>();
    
    for(int i = 0; i < n; i++){
        if(mp.containsKey(target - nums[i])){
            ans[0] = i;
            ans[1] = mp.get(target - nums[i]);
            return ans;
        }
        else{
            mp.put(nums[i], i);
        }
    }
    return ans;
    
}
        
    }
