class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();

        Arrays.sort(arr);
        int minValue = Integer.MAX_VALUE;

        for(int i = 0 ; i<arr.length-1 ; i++){
            minValue = Math.min(minValue,arr[i+1]-arr[i]);
        }
        
        for(int i = 0 ; i< arr.length-1 ; i++){
            if(minValue == arr[i+1]-arr[i]){
                res.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return res;
    }
}