class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> dset = new HashSet<>();

        for(int n : nums){
            dset.add(n);
        }

        if(dset.size() == nums.length) return false;
        return true;
    }
}