// <-----Approach-01-------->
/*
class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>(); //set banaya

        for(int num: nums){  //enhanced for loop
            if(set.contains(num)){  // agar set mai phle se hai to true return
                return true;
            }
            set.add(num);  //set mai nahi hai to add kro
        }

        return false;  //pure array mai koi duplicate nahi hai


        
    }
}
*/
//<------Approach-02------->

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set= new HashSet<>();

        for(int num: nums){
            set.add(num);  //set mai elements add kare
        }

        if(set.size()<nums.length){  
            //agar set ka size chota hai original array se mtlb duplicates bhi hai uss array mai, as set only will contains distinct elements
            return true;  //true--> duplicates hai
        }
        return false;  // false--> nahi hai

    }
}