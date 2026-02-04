class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int i = start + (end - start) / 2;

            if (nums[i] == target) {
                return i; 
            }

            if (nums[i] > target) {
                end = i - 1; 
            } else {
                start = i + 1; 
            }
        }

        return -1; 
    }
}