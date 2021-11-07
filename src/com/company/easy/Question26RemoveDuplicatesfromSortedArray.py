class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        curr=fut=1
        for i in range(1, len(nums)):
            if(nums[curr] == nums[curr-1]):
                curr = curr + 1
            else:
                nums[fut] = nums[curr]
                curr = curr + 1
                fut = fut + 1
        return fut
