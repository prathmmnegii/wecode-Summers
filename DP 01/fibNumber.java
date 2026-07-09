// Solution using DP

class Solution {
    public int fib(int n) {

        int[] dp= new int[n+1]; //dp array
        Arrays.fill(dp, -1);  //fill with -1

        return helper(n, dp);  
    }

    int helper(int n, int[] dp){
        if(n==1 || n==0){  //base case
            return n;
        }

        if(dp[n]!= -1){
            return dp[n];  //agar iska result phle se computed hai to use return krdo
        }

        int fn1= helper(n-1, dp);  //fn-1 ke leye recursive call
        int fn2= helper(n-2, dp);  //fn-2 ke leye recursive call

        dp[n]= fn1+ fn2;   //dono ko add krke dp array mai store krao

        return dp[n]; //value return krdo
    }
}