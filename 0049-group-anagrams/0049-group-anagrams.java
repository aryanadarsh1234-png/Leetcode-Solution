class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();

        for(String str : strs){

            char[] strArr = str.toCharArray();
            Arrays.sort(strArr);
            String key = new String(strArr);

            map.putIfAbsent(key , new ArrayList<>());
            map.get(key).add(str);
        }
           
        for (List<String> group : map.values()) {
            ans.add(group);
        }

        return ans;
        
    }
}