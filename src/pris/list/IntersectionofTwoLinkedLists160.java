package pris.list;

import pris.model.ListNode;

public class IntersectionofTwoLinkedLists160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = length(headA);
        int lenB = length(headB);
        int min = Math.abs(lenA-lenB);
        if(lenA>lenB){
            while(min-->0){
                headA = headA.next;
            }
        }else{
            while(min-->0){
                headB = headB.next;
            }
        }
        while(headA!=null){
            if(headA==headB){
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }

    private int length(ListNode head){
        int len = 0;
        while(head!=null){
            len++;
            head = head.next;
        }
        return len;
    }
}
