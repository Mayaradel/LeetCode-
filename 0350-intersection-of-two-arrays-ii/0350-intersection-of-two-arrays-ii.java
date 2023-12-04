class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) return new int[0];

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = Math.min(nums1.length, nums2.length);
        int k = 0;
        int i=0;
        int j=0;

        int[] intersection = new int[n];

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j])
                i++;
            else if(nums1[i]>nums2[j]){
                j++;
            }

            else{
                intersection[k]=nums1[i];
                i++;
                j++;
                k++;
            }
            
        }


return Arrays.copyOfRange(intersection,0,k);
    }
}
