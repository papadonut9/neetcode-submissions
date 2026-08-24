class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> arr = new HashSet<>();
        for(int i: nums){
            if(arr.contains(i))
                return true;
            arr.add(i);
        }
        return false;
    }
}