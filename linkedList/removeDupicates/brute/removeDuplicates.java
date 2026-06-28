package linkedList.removeDupicates.brute;

import java.util.*;

import linkedList.ListNode;



class removeDupicates {
    public ListNode deleteDuplicatesF(ListNode head) {
        if (head == null) return null;
        ArrayList<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int i = 0; i < list.size(); i++) {

            if (i == 0 || list.get(i) != list.get(i - 1)) {
                curr.next = new ListNode(list.get(i));
                curr = curr.next;
            }
        }

        return dummy.next;
    }

}
