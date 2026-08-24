class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> arr = new HashMap<>();
        Boolean res = false;
        for(int i: nums){
            if(arr.get(i) == null)
                arr.put(i, 0);
            else
                return true;
        }
        

        return false;
    }
}