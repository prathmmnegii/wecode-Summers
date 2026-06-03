class helloworld{
    static void hw(int n){
        if(n==0){
            return;
        }
        System.out.println("HelloWorld "+ n);
        hw(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        hw(9);
    }
}