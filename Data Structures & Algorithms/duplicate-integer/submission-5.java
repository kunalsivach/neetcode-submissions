class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();
        if(nums.length== 0) return false;
        hs.add(nums[0]);
        for(int i=1; i<nums.length; i++)
        {    
          
               if(hs.contains(nums[i])) return true;  

                hs.add(nums[i]);
                
           
        }

        // if(hs.size()== nums.length)
        // {
        //     return false;
        // }

        return false;
    }
}