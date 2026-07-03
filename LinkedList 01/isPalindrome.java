class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow= head;
        ListNode fast= head;

        while(fast.next!= null && fast.next.next!= null){
            slow=slow.next;
            fast= fast.next.next;  
        }

        ListNode newhead= reverse(slow.next);  //second half ka head ko reverse kro

        ListNode first = head;
        ListNode second= newhead;

        while(second!= null){
            if(first.val!= second.val){
                reverse(newhead);
                return false;
            }
            first= first.next;
            second= second.next;
        }
        reverse(newhead);
        return true;
        
    }

    public   ListNode reverse(ListNode head){  //iterative function to reverse the list

        ListNode prev= null;
        ListNode curr= head;

        while(curr!=null){
            ListNode front = curr.next;
            curr.next= prev;
            prev= curr;
            curr= front;
        }
        return prev;   //prev will be the head of the reversed list

    }
}