class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        # 시간 복잡도 O(n^^2)
        # for i in range(len(nums)):
        #     for j in range(i + 1, len(nums)):
        #         if nums[i] == nums[j]:
        #             return True
        # return False

        # 시간 복잡도 O(n)
        input_set = set(nums)

        if len(nums) != len(input_set):
            return True
        return False    