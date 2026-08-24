class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>(nums.length * 4 / 3 + 1);
        for (int i : nums) {
            if (!seen.add(i))
                return true;
        }
        return false;
    }
}