# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reverse(self, node):
        if node is None:
            return None
        if node.next is None:
            return node

        ret = self.reverse(node.next)
        node.next.next = node
        node.next = None

        return ret

    def reverseList(self, head: ListNode) -> ListNode:
        return self.reverse(head)