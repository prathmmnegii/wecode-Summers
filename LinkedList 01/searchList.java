public class searchList {  
    
    static class Node{
        int val;
        Node next;

        Node(int val){
            this.val= val;
            this.next=null;
        }
    }
    
    public static boolean search(Node head, int key){
        Node temp=  head;
        while(temp !=null){
            if(key==temp.val){
                return true;
            }
            temp= temp.next;
        }
        return false;
}
public static void main(String[] args) {

    Node head = new Node(10);
    head.next= new Node(20);
    head.next.next = new Node(30);

    int key= 30;

    System.out.println(search(head, key));
}

}
