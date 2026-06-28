package linkedList.linkedListCycle.optimal;

import linkedList.ListNode;

public class linkedListCycle {
    public boolean linkedListCycleF(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
