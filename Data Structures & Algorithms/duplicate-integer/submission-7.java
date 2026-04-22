class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();
        
        for(int i=0; i<nums.length; i++)
        {    
          try{
               if(hs.contains(nums[i])) return true;  

                hs.add(nums[i]);
          }
          catch(Exception e)
          {
                            hs.add(nums[i]);

          }


                
           
        }

        // if(hs.size()== nums.length)
        // {
        //     return false;
        // }

        return false;
    }
}