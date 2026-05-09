class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> test = new HashSet<>();
        for (int num : nums) {
            if (!test.add(num))
                return true;
            test.add(num);
        }
        if(nums.length > test.size()) return true;
        return false;
    }
}