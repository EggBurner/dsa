package linkedList.linkedListCycle.brute;

import java.util.HashSet;

import linkedList.ListNode;

public class linkedListCycle {
    public boolean linkedListCycleF(ListNode head) {

        HashSet<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) {
                return true;
            }

            set.add(head);
            head = head.next;
        }

        return false;
    }
}
