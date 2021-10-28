class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> ListNode:
        
        if headA is None or headB is None:
            return null
        pa = headA
        pb= headB
        while pa!=pb:
            pa = headB if pa is None else pa.next
            pb = headA if pb is None else pb.next
        
        return pa;
