class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        length = len(nums)
        k = k%length
        
        #brute force 
        # for i in range(0, k):
        #     curr=nums[0]
        #     for i in range(1, length):
        #         prev = curr
        #         curr=nums[i]
        #         nums[i]=prev
        #     nums[0] = curr
        
        #another way 
        start = count = 0
        while(count<length):
            curr, prev = start, nums[start]
            while True:
                later = (curr+k)%length
                temp = nums[later]
                nums[later] = prev
                prev = temp
                curr=later
                count = count+1
                if(start==curr):
                    break
            start = start + 1
