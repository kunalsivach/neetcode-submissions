class Solution {
    public boolean isAnagram(String s, String t) {
        //brut force

        //we can create a hashmap, key = character
        // value = number of times it appears

        //then compare the 2 hashmap, if they are equal, then its a anagram
       

       //real brut force
       HashMap<Character, Integer> shm = new HashMap<>();
              HashMap<Character, Integer> thm = new HashMap<>();


       char[] sArray = s.toCharArray();
       char[] tArray = t.toCharArray();
       if(sArray.length != tArray.length) return false;
        int pos;
        int pos1;
       for(int i=0; i<sArray.length; i++)
       {
            pos =0;
            pos1 =0;
            for(int j=0;j<sArray.length && i!=j; j++)
            {
                if(sArray[i] == sArray[j])
                {
                     pos= pos+1;
                }
                if(tArray[i] == tArray[j])
                {
                     pos1= pos1+1;
                }

            }
        shm.put(sArray[i], pos);
        thm.put(tArray[i], pos1);


       }

        
       
    //    for(int i=0; i<tArray.length; i++)
    //    {
    //         pos1 =0;
    //         for(int j=0;j<tArray.length && i!=j; j++)
    //         {
    //             if(tArray[i] == tArray[j])
    //             {
    //                  pos= pos+1;
    //             }

    //         }
    //     thm.put(tArray[i], pos);
    //    }

       if(shm.equals(thm)) return true;
       else return false;






    }
}
