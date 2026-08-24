class Solution {
    public boolean isAnagram(String s, String t) {
        char[] as = s.toCharArray();
        char[] at = t.toCharArray();

        Arrays.sort(as);
        Arrays.sort(at);

        if(Arrays.equals(as, at))
            return true;

        return false;
        
    }
}
