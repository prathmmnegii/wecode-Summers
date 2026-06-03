// class sumofN{
//     static void fun(int n, int sum){
//         if(n<0){
//             System.out.println(sum);
//             return;
//         }
//         fun(n-1, sum+n);
//     }
//     public static void main(String[] args) {
//         fun(3, 0); 
//     }
// }
class sumofN{
    static int summ(int n){
        if (n==0){
            return 0 ;
        }
        return n + summ(n-1);
        
    }
    public static void main(String[] args) {
        summ(5);
    }
}