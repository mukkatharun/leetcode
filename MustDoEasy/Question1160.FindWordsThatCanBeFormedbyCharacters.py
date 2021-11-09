class Solution:
    def countCharacters(self, words: List[str], chars: str) -> int:
        lookup = {}
        
        count = 0
        for i in chars:
            if i in lookup:
                lookup[i]=lookup[i]+1
            else:
                lookup[i] =1
        for i in words:
            check=True
            dummylookup = lookup.copy()
            for j in i:
                if j not in lookup or (j in dummylookup and dummylookup[j] <1):
                    check = False
                if check:
                    dummylookup[j] = dummylookup[j] - 1
            if check:
                count = count+len(i)
        return count
