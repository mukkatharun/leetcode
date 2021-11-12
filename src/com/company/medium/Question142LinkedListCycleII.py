class Solution:
    def detectCycle(self, head: ListNode) -> ListNode:
        slow=head
        fast=head
        while fast!=None and fast.next!=None:
            slow=slow.next
            fast=fast.next.next
            if(slow==fast):
                slow1=head
                while slow1!=fast:
                    slow1=slow1.next
                    fast=fast.next
                return slow1
        return None
