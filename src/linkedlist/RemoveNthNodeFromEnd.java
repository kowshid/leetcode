// Problem: 19
// https://leetcode.com/problems/remove-nth-node-from-end-of-list/

package linkedlist;

public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEndSinglePass(ListNode head, int n) {
        if (n == 1 && head.next == null) return null;

        ListNode fast = head;
        ListNode slow = head;

        while (n > 0) {
            fast = fast.next;
            n--;
        }

        if (fast == null) {
            // delete the head
            return head.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n == 1 && head.next == null) return null;

        ListNode prev = head;
        int indexFromFront = 2;
        while (prev.next.next != null) {
            indexFromFront++;
            prev = prev.next;
        }

        if (n == 1) {
            prev.next = null;
            return head;
        }

        if (n == indexFromFront) {
            return head.next;
        }

        indexFromFront = indexFromFront - n;

        prev = head;
        while (indexFromFront > 1) {
            prev = prev.next;
            indexFromFront--;
        }

        prev.next = prev.next.next;

        return head;
    }
}