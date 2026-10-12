class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for(String w: strs){
            char[] l = w.toCharArray();
            Arrays.sort(l);

            String k = new String(l);

            List<String> group = res.get(k);
            if(group == null){
                group = new ArrayList<>();
                res.put(k, group);
            }
            group.add(w);
        }
        return new ArrayList<>(res.values());
    }
}
