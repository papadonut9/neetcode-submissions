class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> arr = new HashSet<>(nums.length * 4 / 3 + 1);
        for(int i: nums){
            if(!arr.add(i))
                return true;
        }
        return false;
    }
}