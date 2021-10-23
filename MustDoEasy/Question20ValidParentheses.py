class Solution:
    def isValid(self, s: str) -> bool:
        stac = []
        lookup = {'(':')', '[':']','{':'}'}
        
        for i in s:
            if(i not in lookup):
                if stac==[] or lookup[stac.pop()]!=i:
                    return False
            else:
                stac.append(i)
        return stac ==[]
        
