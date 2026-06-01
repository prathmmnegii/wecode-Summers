class printNameRecursion{
    public static void main(String[] args) {
        name(5);
    }
   static void name(int num){
            if(num==0){ // base case
                return;
            }
            System.out.println("Pratham" + num);
            name(num-1);
            System.out.println("Negi" + num);
        }

}