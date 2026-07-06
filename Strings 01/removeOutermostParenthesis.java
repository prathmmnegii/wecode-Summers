class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder ans= new StringBuilder();

        int opened=0; 

        for(char ch: s.toCharArray()){
            if(ch=='('){  //open bracket mile to count badhao
                opened++;

                if(opened>1){   //ek se jyada open bracket to answer append kro
                    ans.append(ch);
                }
            }
            else{
                opened--;  //agar close bracket ho toh count minus -1 karo

                if(opened>0){  //agr opened ka count more than 0 hua
                    ans.append(ch); //ans mai append kro
                }
            }
        }
        return ans.toString();  //ans ko return krdo(string mai convert krke)
        
    }
}