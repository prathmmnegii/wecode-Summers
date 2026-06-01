// class sumOfDigits02{
//     static int summ(int num){
//         if(num==0){
//             return 0;
//         }
//         return (num%10) + summ(num/10);
//     }
//     public static void main(String[] args) {
//         System.out.println(summ(456));
//     }

// }
class sumOfDigits02{
    static int summ(int num){
        if(num==0){
            return 0;
        }
        return (num%10)+summ(num/10);
    }
    public static void main(String[] args) {
        
        System.out.println(summ(12345));
    }
}