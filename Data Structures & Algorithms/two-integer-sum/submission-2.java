class Solution {
    public int[] twoSum(int[] nums, int target) {
        //brut force

        int[] ans = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i< nums.length ; i++ )
        {
           if(hm.containsKey(target-nums[i])) return new int[] {hm.get(target-nums[i]) , i};
           else  hm.put(nums[i],i);
            
        }

        return ans;
    }
}
