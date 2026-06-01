public class countevenOdd01 {
    static void evenOdd(int range, int even, int odd){
        if(range==0){ // base case
            System.out.println("Even: " +even+ " Odd: " +odd);
            return;
        }
        //logic
        if(range%2==0){
            even++;
        }
        else{
            odd++;
        }
        // small problem
        evenOdd(range-1, even,odd);

    }
    public static void main(String[] args) {
        evenOdd(10,0,0);
    }
    
}
