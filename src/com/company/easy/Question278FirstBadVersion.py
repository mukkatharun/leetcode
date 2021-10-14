class Solution:
    def firstBadVersion(self, n):
        """
        :type n: int
        :rtype: int
        """
        low, high = 1, n
        bad = 1
        while(low<=high):
            mid = (low+high)//2
            res = isBadVersion(mid);
            if(res):
                high=mid-1
                bad=mid
            else:
                low=mid+1
        return bad
