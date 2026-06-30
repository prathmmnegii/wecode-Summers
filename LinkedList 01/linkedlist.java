    import java.util.*;
    class linkedlist {

        static class Node{
            int val;
            Node next;

            public Node(int val, Node next){
            this.val=val;
            this.next= next;
        }

        public Node(int val){
            this.val= val;
            this.next= null;
        }
        }
        

    public static Node createll(int[] arr){

        Node head= new Node(arr[0]);
        Node mover= head;

        for(int i=1; i<arr.length; i++){
            Node temp= new Node(arr[i]);
            mover.next= temp;
            mover=temp;
        }
        return head;
    }

    public static void main(String[] args) {
        int [] arr= {2, 3, 4, 8};

        Node head= createll(arr);

        Node temp=head;
        while(temp!= null){
            System.out.print(temp.val+" ");
            temp= temp.next;
        }
        
    }
}