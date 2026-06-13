import java.util.*;

class subsequenceK{
    public static void seq (int index, int sum, int k, int[] nums, List<Integer> ds){
        if(index==nums.length){
            if(sum==k){
                System.out.println(ds);
            }
            return;
        }

        ds.add(nums[index]);
        sum+= nums[index];
        seq(index+1, sum, k, nums, ds); // take

        ds.remove(ds.size()-1);
        sum-= nums[index];

        seq(index+1, sum, k, nums, ds);


    }
    public static void main(String[] args) {
        
        List<Integer> ds= new ArrayList<>();

        int k=2;
        int[] nums={ 1,2 ,-1, 3};
        seq(0,0,k,nums,ds);
    }
}