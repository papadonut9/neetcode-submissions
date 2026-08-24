class Solution {
  public int[] twoSum(int[] nums, int target) {
    int i1 = -1;
    int i2 = -1;
    Map<Integer, Integer> res = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
      int j = target - nums[i];
      if (res.containsKey(j)) {
        i1 = i;
        i2 = res.get(j);
        break;
 
      } else
        res.put(nums[i], i);
    }
    return new int[] {i2, i1};
  }
}
