package pris.list;

import pris.model.ListNode;

public class ReverseLinkedList206 {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode current = null;
        ListNode tmp = null;
        while(head!=null){
            tmp = head.next;
            head.next = current;
            current = head;
            head = tmp;
        }
        return current;
    }
}
