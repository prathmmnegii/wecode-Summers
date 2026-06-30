import java.util.*;

public class arrayToList{

    public static LinkedList<Integer> toLL(int[] arr){

        LinkedList<Integer> ll= new LinkedList<>();
        for(int i : arr){
            ll.add(i);
        }

        return ll;
    }

    public static void main(String[] args) {
        int[] arr= {2, 3, 4, 6};
        
        LinkedList<Integer> ans= toLL(arr);  //ise linked list return ho gyi 
        System.out.println(ans);  //returned list print ho gyi
    }
}