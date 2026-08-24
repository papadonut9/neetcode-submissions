class Solution {
    public boolean isAnagram(String s, String t) {
        // length
        if(s.length() != t.length())
            return false;
        // compare each element

        HashMap<Character, Integer> sh = new HashMap<>();
        HashMap<Character, Integer> th = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            sh.put(s.charAt(i), sh.getOrDefault(s.charAt(i), 0)+ 1);
            th.put(t.charAt(i), th.getOrDefault(t.charAt(i), 0)+ 1);
        }
        return sh.equals(th);
    }
}
