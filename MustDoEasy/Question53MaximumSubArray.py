#using kadane's algo

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        globalMax = nums[0]
        interMax = nums[0]
        for i in range(1, len(nums)):
            interMax = max(nums[i], interMax+nums[i])
            globalMax = max(globalMax, interMax)
        return globalMax
