class Solution {

    void helper(int i, int[] candidates, List<Integer> ds, List<List<Integer>> ans, int target){
        if(i==candidates.length){
            if(target==0){
                ans.add(new ArrayList (ds));
            }
            return;
        }
        if(candidates[i]<= target){
            ds.add(candidates[i]);
            helper(i, candidates, ds, ans, target - candidates[i]);  //take

            ds.remove(ds.size()-1); //// backtracking
            } 

            helper(i+1, candidates, ds, ans, target);
        
    }


    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<Integer> ds= new ArrayList<>();
        List<List<Integer>> ans= new ArrayList<>();

        helper(0, candidates, ds, ans, target);

        return ans;

        
    }
}