public class oddEven02 {
    static int[] evenodd(int n){
        if(n==0){
            return new int[2]; // evencount, oddcount
        }
        int [] result= evenodd(n-1); // small problem
        if(n%2==0){
            result[0]++;
        }
        else{
            result[1]++;
        }
        return result;
    }
    public static void main(String[] args) {
        int n=10;
        int[] result= evenodd(n);
        System.out.println("Even " +result[0]);
        System.out.println("Odd " + result[1]);
    }
    
}
