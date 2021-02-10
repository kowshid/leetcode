# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        num1 = 0
        num2 = 0

        temp1 = l1
        temp2 = l2
        listNum = []

        while temp1:
            num1 = num1 * 10 + temp1.val
            temp1 = temp1.next
            print(num1)

        while temp2:
            num2 = num2 * 10 + temp2.val
            temp2 = temp2.next

        result = num1 + num2

        if result == 0:
            listNum.append(0)
        else:
            while result > 0:
                listNum.append(result % 10)
                result //= 10

        m = len(listNum)
        print(listNum)
        listNum.reverse()
        print(listNum)

        head = None
        prev = None
        for i in range(m):
            temp = ListNode(listNum[i])
            if head is None:
                head = temp
            else:
                prev.next = temp

            prev = temp

        prev.next = None

        return head