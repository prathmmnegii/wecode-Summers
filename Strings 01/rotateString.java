class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length()!= goal.length()){  //length hi equal nahi hai to return false
            return false;
        }

        String doubled= s+s; //original string ko khud se concatenate karvao

        return doubled.contains(goal); //agar concatenated string mai goal vali string aa rahi --> return true
        
    }
}
