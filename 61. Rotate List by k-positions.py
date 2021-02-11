# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def rotateRight(self, head: ListNode, k: int) -> ListNode:
        if head is None:
            return None
        if head.next is None:
            return head

        prev = head
        temp = prev.next
        length = 1

        while temp:
            length += 1
            prev = temp
            temp = temp.next
        k = k % length

        if k == 0:
            return head

        # making the list circular
        prev.next = head
        # print("k = ",k, " length = ", length)

        prev = head
        temp = head.next

        for i in range(length - k - 1):
            prev = temp
            temp = temp.next

        head = temp
        prev.next = None

        return head