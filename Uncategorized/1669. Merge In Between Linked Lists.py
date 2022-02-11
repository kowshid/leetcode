# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeInBetween(self, list1: ListNode, a: int, b: int, list2: ListNode) -> ListNode:
        a_1thNode = None
        athNode = None
        b_1thNode = None
        bthNode = None

        lenA = 0
        temp = list1
        while temp:
            lenA += 1
            temp = temp.next
        # print(lenA)

        temp = list1
        for i in range(lenA):
            if i == a - 1:
                a_1thNode = temp
            if i == a:
                athNode = temp
            if i == b + 1:
                b_1thNode = temp
            if i == b:
                bthNode = temp
            temp = temp.next

        head2 = list2
        tail2 = head2
        while tail2.next is not None:
            tail2 = tail2.next

        a_1thNode.next = head2
        tail2.next = b_1thNode
        bthNode.next = None

        return list1