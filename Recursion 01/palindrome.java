public class palindrome {
    static boolean pal(int i, String s){
    int n= s.length();
        if(i>=n/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(n-i-1)){
            return false;
            
        }
        return (pal(i+1, s));

    }
    public static void main(String[] args) {
        String s="naman";
        System.out.println(pal(0, s));
    }
}


