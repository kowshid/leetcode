# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverse(self, head, curCount, maxCount):
        if head is None:
            return None
        curCount += 1
        if curCount > maxCount:
            return head
        ret = self.reverse(head.next, curCount, maxCount)
        ret.next = head
        head.next = None

        return head

    def reverseBetween(self, head: ListNode, m: int, n: int) -> ListNode:
        if head is None:
            return None
        if head.next is None:
            return head
        if m == n:
            return head

        m_1thNode = None
        mthNode = None
        n_1thNode = None
        nthNode = None

        length = 0
        temp = head
        while temp:
            length += 1
            temp = temp.next

        temp = head
        for i in range(1, length + 1):
            if i == m - 1:
                m_1thNode = temp
            if i == m:
                mthNode = temp
            if i == n:
                nthNode = temp
            if i == n + 1:
                n_1thNode = temp
            temp = temp.next

        # print(m_1thNode.val, mthNode.val, nthNode.val, n_1thNode.val)
        maxCount = n - m
        self.reverse(mthNode, 0, maxCount)

        # handling the head
        ans = None
        if m_1thNode:
            ans = head
        else:
            ans = nthNode

        if m_1thNode:
            m_1thNode.next = nthNode

        mthNode.next = n_1thNode

        return ans