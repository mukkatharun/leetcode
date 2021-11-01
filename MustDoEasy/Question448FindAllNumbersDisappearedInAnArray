class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        visited = {}
        result=[]
        for i in nums:
            visited[i]=i
        print(visited)
        for i in range(1, len(nums)+1):
            if i not in visited:
                result.append(i)
        return result
