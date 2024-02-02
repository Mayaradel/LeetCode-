class Solution {

    public int removeDuplicates(int[] nums) {
        int dup = 1;
        int k=1;
        
        for(int i =1; i<nums.length ; i++){
            if(nums[i-1]==nums[i]){
                dup++;
            }
            else{
                dup=1;
            }
            if(dup<3){
                nums[k]=nums[i];
                k++;
            }
            
        }
        return k ;
     
    }
}
