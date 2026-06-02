// class printName{
//     static void printname(int n){
//         if(n==0){ //base case
//             return;
//         }
//         System.out.println("Pratham"); //logic
//         printname(n-1); // small problem
//     }
//     public static void main(String[] args) {
//         int n=5;
//         printname(5);
//     }
// }
class printName{
    static void pn(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(n);
        pn(i,n-1);
    }
    public static void main(String[] args) {
        pn(3, 10);
    }
}