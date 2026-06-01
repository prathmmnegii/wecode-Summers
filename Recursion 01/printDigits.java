class printDigits{
    static void printDigit(int num){
        if(num==0){  // stack fall. 
            return;  // base condition.
        }
        printDigit(num/10); // task perform yaha ho raha hai
        System.out.println(num%10); //stack fall hone ke baad stack unwind ho raha hai
    }
    public static void main(String[] args) {
        printDigit(12345);
    }
}