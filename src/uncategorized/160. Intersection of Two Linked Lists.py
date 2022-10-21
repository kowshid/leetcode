# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> ListNode:
        lenA = 0
        lenB = 0
        tempA = headA
        tempB = headB

        while tempA:
            lenA += 1
            tempA = tempA.next

        while tempB:
            lenB += 1
            tempB = tempB.next

        if lenA > lenB:
            tempA = headA
            tempB = headB

            # print(tempA.val, tempB.val)
            i = lenA - lenB
            while i > 0:
                tempA = tempA.next
                i -= 1
        else:
            tempA = headA
            tempB = headB

            # print(tempA.val, tempB.val)
            i = lenB - lenA
            while i > 0:
                tempB = tempB.next
                i -= 1

        while tempA and tempB:
            if tempA == tempB:
                return tempA
            tempA = tempA.next
            tempB = tempB.next

        return None