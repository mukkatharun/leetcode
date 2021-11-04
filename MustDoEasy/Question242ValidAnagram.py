class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # sorted(s)
        return sorted(s)==sorted(t)
