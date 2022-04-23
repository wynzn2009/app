package pris.list;

import pris.model.ListNode;

public class RemoveLinkedListElements203 {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        ListNode re = new ListNode();
        ListNode current = re;
        while(head!=null){
            if(head.val != val){
                current.next = head;
                current = current.next;
            }
            head = head.next;
        }
        current.next = null;
        return re.next;
    }
}
