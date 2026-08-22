class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {


        List<List<String>> res = new ArrayList<>();

        HashMap<String,ArrayList<String>> map = new HashMap<>();


        for(String str : strs){

            char[] charArr = str.toCharArray();

            Arrays.sort(charArr);

            String key = new String(charArr);

           map.putIfAbsent(key,new ArrayList<>());
           map.get(key).add(str);

        }

        for(List<String> group :map.values()){
            res.add(group);
        }
        return res;
        
    }
}