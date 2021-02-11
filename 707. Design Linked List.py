class Node:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class MyLinkedList:
    def __init__(self):
        self.head = None

    def get(self, index: int) -> int:
        """
        Get the value of the index-th node in the linked list. If the index is invalid, return -1.
        """
        temp = self.head
        i = 0
        while temp and i < index:
            i += 1
            temp = temp.next
        if temp is not None:
            return temp.val
        return -1

    def addAtHead(self, val: int) -> None:
        """
        Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
        """
        node = Node(val)
        node.next = self.head
        self.head = node

    def addAtTail(self, val: int) -> None:
        """
        Append a node of value val to the last element of the linked list.
        """
        node = Node(val)
        if self.head == None:
            self.head = node
            return

        temp = self.head
        while temp.next is not None:
            temp = temp.next

        temp.next = node

    def addAtIndex(self, index: int, val: int) -> None:
        """
        Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
        """
        if index == 0:
            self.addAtHead(val)
            return

        temp = self.head
        count = 0
        while temp:
            temp = temp.next
            count += 1

        if index == count:
            self.addAtTail(val)
            return
        if index > count:
            return

        node = Node(val)
        prev = self.head
        temp = prev.next

        for i in range(index - 1):
            prev = temp
            temp = temp.next

        prev.next = node
        node.next = temp

    def deleteAtIndex(self, index: int) -> None:
        """
        Delete the index-th node in the linked list, if the index is valid.
        """
        if self.head is None:
            return

        if index == 0:
            temp = self.head
            self.head = self.head.next
            temp.next = None
            return

        temp = self.head
        count = 0
        while temp:
            temp = temp.next
            count += 1

        if index >= count:
            return

        prev = self.head
        temp = prev.next
        for i in range(index - 1):
            prev = temp
            temp = temp.next

        prev.next = temp.next
        temp.next = None

# Your MyLinkedList object will be instantiated and called as such:
# obj = MyLinkedList()
# param_1 = obj.get(index)
# obj.addAtHead(val)
# obj.addAtTail(val)
# obj.addAtIndex(index,val)
# obj.deleteAtIndex(index)