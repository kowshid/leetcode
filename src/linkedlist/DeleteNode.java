// Problem: 237
// https://leetcode.com/problems/delete-node-in-a-linked-list/

package linkedlist;

public class DeleteNode {
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            return;
        }

        ListNode nextNode = node.next;
        node.val = nextNode.val;
        node.next = nextNode.next;
        nextNode.next = null;
    }
}