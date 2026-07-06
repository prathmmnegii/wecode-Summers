class Solution {
    public String longestCommonPrefix(String[] strs) {

        String prefix= strs[0];  //phli string ko hi result maan lo

        for(int i=1; i< strs.length; i++){  //traverse karo

            while(!strs[i].startsWith(prefix)){  
                 // jabtak current string prefix se start nahi hoti prefix(current result) ko chhota karo [ek ek size kam karo]

                prefix= prefix.substring(0, prefix.length()-1);
                // prefix chota kara

                if(prefix.length()==0){  //agar prefix ki length 0 ho gyi to return false
                    return "";
                }
            }

        }
        return prefix;
        //prefix retyrn kardo
        
    }
}
