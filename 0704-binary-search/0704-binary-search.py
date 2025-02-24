from typing import List

class Solution:
    def search(self, nums: List[int], target: int) -> int:
        l, r = 0, len(nums)  

        while l < r:
            m = l + (r - l) // 2  
            if nums[m] >= target:
                r = m  # 왼쪽으로 범위를 좁힘
            else:
                l = m + 1  # 오른쪽으로 범위를 좁힘

        if l < len(nums) and nums[l] == target:
            return l
        return -1
        