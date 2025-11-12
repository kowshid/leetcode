// Problem: 206
// https://leetcode.com/problems/reverse-linked-list/

package linkedlist;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        return reverse(head);
    }

    private ListNode reverse(ListNode node) {
        if (node == null || node.next == null) return node;

        ListNode ret = reverse(node.next);
        node.next.next = node;
        node.next = null;

        return ret;
    }
}