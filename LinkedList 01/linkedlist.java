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

    static void print(Node head){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }

    public static Node removeHead(Node head){
        if(head==null){
            return head;
        }
        Node temp = head;
        head= head.next;
        return head;
    }

    public static Node removetail(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node temp= head;
        while(temp.next.next!= null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    public static Node  removeposition(Node head, int k){
        
        if(head==null){
            return head;
        }

        if(k==1){
            Node temp =head;
            head=head.next;
            return head;
        }
       
        int cnt=1;
        Node temp= head;
        Node prev = null;
        while(temp!=null){      
        if(cnt==k){
            prev.next= prev.next.next;
            break;

        }
        prev=temp;
        temp=temp.next;
        cnt++;
    }
    return head;

    }

    public static Node removeele(Node head, int ele){

        if(head==null){
            return head;
        }
        if(head.val==ele){
            head= head.next;
            return head;
        }
        Node temp= head; 
        Node prev=null;

        while(temp !=null){
                    if(temp.val==ele){
            prev.next=prev.next.next;  //prev.next=temp.next bhi likh skte hai
            break;
        }
        prev=temp;
        temp=temp.next;
        }



        return head;
    }

    /* Node temp=head;
        while(temp!= null){
            System.out.print(temp.val+" "); //traversal for linkled list
            temp= temp.next;
        } */

    public static void main(String[] args) {
        int [] arr= {2, 3, 4, 8};

        Node head= createll(arr);
        head= removeposition(head, 2);
        
        print (head);
  
    }
}