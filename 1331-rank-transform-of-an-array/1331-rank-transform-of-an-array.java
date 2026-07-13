class Solution {
    public int[] arrayRankTransform(int[] arr) {

        int[] sortArr = arr.clone();

        Arrays.sort(sortArr);
        int rank=1;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : sortArr){
            if(!map.containsKey(num)){
                map.put(num , rank++);
            }
        }

        int [] res = new int[arr.length];

        for(int i = 0 ; i < res.length ; i++){
            res[i] = map.get(arr[i]);
        }
        return res;


        
        
    }
}