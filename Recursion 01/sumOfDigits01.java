class sumOfDigits01{
    static void summ(int num, int sum){
        if(num==0){ // base case
            System.out.println( sum); // sum ek hi bar print hoga (final output)
            return;
        }
        int digit=num%10; // last digit extract kari   |
        sum= sum+digit;   // sum mai digit add kari    |----> logic 
        summ(num/10, sum); // num ko chota kiya        |
    }
    public static void main(String[] args) {
        summ(456, 0); // pass sum as well in parameter.
    }
}