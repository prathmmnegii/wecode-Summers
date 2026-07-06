class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){  //dono strings ki length hi negative hai to return false
            return false;
        }

        int[] freq= new int[26];  //ek frequency array jo initially all zero hoga

        for(int i=0; i<s.length(); i++){  //dono strings ko ek sath traverse krenge

        freq[s.charAt(i)-'a']++; //phli string ke alphabets ki frequency badhao
        freq[t.charAt(i)-'a']--; //doosri string ke alphabets ki frequency ghatao

        }

        for(int count : freq){

        if(count!=0) return false;  //agar ek bhi alphabet ki freq 0 hai to false return 
        }
        

        return true;  //sare alphabets ki frequency 0 hai, return true


        
    }
}