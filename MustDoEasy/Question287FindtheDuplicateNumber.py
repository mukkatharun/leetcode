class Solution:
    def findDuplicate(self, nums: List[int]) -> int:
      # using hashmap
        visited={}
        for i in range(0, len(nums)):
            if nums[i] in visited:
                return nums[i]
            else:
                visited[nums[i]]=i
        return -1
#         using set
        seen = set()
        for num in nums:
            if num in seen:
                return num
            seen.add(num)
