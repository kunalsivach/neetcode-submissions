class Solution {
    public boolean isAnagram(String s, String t) {

        //create char array of both
        //create hashmap <char,integer> for both
        //navigate through the chararray, 
            //if hashmap contains key character , then increment the value by 1
            //else hashmap.add(char , 1)
        
        //do same for the other char array and hashmap
        //compare the 2 hashmap , if equal return true, else return false


        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        if(sArray.length!= tArray.length) return false;
        HashMap<Character, Integer> sHashMap = new HashMap<>();
        HashMap<Character, Integer> tHashMap = new HashMap<>();


        for(int i=0; i<sArray.length; i++)
        {
            if(sHashMap.containsKey(sArray[i])) sHashMap.put(sArray[i] , sHashMap.get(sArray[i])+1 );
            else sHashMap.put(sArray[i] , 1);

            if(tHashMap.containsKey(tArray[i])) tHashMap.put(tArray[i] , tHashMap.get(tArray[i])+1 );
            else tHashMap.put(tArray[i] , 1);
        }

        //  for(int i=0; i<tArray.length; i++)
        // {
        //     if(tHashMap.containsKey(tArray[i])) tHashMap.put(tArray[i] , tHashMap.get(tArray[i])+1 );
        //     else tHashMap.put(tArray[i] , 1);
        // }
        

        if(sHashMap.equals(tHashMap)) return true;
        else return false;


    }
}
