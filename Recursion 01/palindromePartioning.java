class Solution {

    public boolean isPal(String s){  //check if string is palindrome or not
            int left=0;
            int right= s.length()-1;
            while(left<= right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }

            left++;
            right--;


            
        }
        return true;
        }
        
    

    public void Part(String s, List<String> ds, List<List<String>> ans){
        if(s.length()==0){
            ans.add(new ArrayList<> (ds));  //copy for ds (reference)
            return;
        }

        for(int i=0; i<s.length(); i++){
            String part= s.substring(0, i+1);
            if(isPal(part)){
                ds.add(part); //storing part if palindrome

                Part(s.substring(i+1), ds, ans);
                 
                ds.remove(ds.size()-1); //backtrack

            }
        }
    }

    public List<List<String>> partition(String s) {

        List<String> ds= new ArrayList <>();
        List<List<String>> ans= new ArrayList<>();

        Part(s,ds, ans);

        return ans;

        
    }
}