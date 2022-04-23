package pris.list;

import pris.model.ListNode;

public class ConvertBinaryNumberinaLinkedListtoInteger1290 {
    public int getDecimalValue(ListNode head) {
        int re = 0;
        while (head != null) {
            if (re == 0) {
                re = head.val;
            } else {
                re <<= 1;
                re += head.val;
            }
            head = head.next;
        }
        return re;
    }
}
