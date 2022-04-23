package pris.list;

import pris.model.ListNode;

public class RemoveDuplicatesfromSortedList83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode root = new ListNode(head.val);
        ListNode current = root;
        head = head.next;
        while(head!=null){
            if(head.val != current.val){
                current.next = new ListNode(head.val);
                current = current.next;
            }
            head = head.next;
        }
        return root;
    }
}
