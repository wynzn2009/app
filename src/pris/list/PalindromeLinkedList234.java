package pris.list;

import pris.model.ListNode;

public class PalindromeLinkedList234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        ListNode tmp = help(slow);
        while (tmp != null) {
            if (head.val != tmp.val) {
                return false;
            }
            head = head.next;
            tmp = tmp.next;
        }
        return true;
    }

    private ListNode help(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode current = null;
        ListNode tmp = null;
        while (head != null) {
            tmp = head.next;
            head.next = current;
            current = head;
            head = tmp;
        }
        return current;
    }
}
