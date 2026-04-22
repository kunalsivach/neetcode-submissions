class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();
        hs.add(-777);
        for(int i=0; i<nums.length; i++)
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