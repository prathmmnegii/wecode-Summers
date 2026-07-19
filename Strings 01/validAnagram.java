class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

    HashMap <String, List<String>> map = new HashMap<>();
    //map kya kya store karega -> sorted string
                            // -> uss string ke sare words


    for(String str : strs){
        char[] arr= str.toCharArray(); 
        //sort krne ke leye string ko array banaya

        Arrays.sort(arr);
        //sort kiya

        String key= new String (arr);
        // sorted string

        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
            // key map mai nahi hai to add kro   
        }
        map.get(key).add(str);
        // str vahi unsorted string hai use as-it-is store krdia

    }
    return new ArrayList<>(map.values());
    //map ki values return kardo

        
    }
}