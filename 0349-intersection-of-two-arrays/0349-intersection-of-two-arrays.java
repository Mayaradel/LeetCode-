class Solution {
      public int[] set_intersection(HashSet<Integer> set1, HashSet<Integer> set2) {
        int[] output = new int[set1.size()];
        int i=0;
        for(Integer s : set1){
            if(set2.contains(s)){
                output[i]=s;
                i++;
            }
        }
      
    return Arrays.copyOf(output, i);
    }
    
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            set2.add(nums2[i]);
        }
        if (set1.size() > set2.size()) 
        {
            return set_intersection(set1, set2); 
        }
        else 
        {
            return set_intersection(set2, set1);
        }
    }


  
}
