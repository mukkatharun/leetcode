class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        nums.sort()
        print(nums)
        # a = len(num)
        return nums[len(nums)//2]
