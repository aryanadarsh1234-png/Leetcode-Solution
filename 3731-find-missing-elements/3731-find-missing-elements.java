class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int min =nums[0];
        int max= nums[0];

        List<Integer> res = new ArrayList<>();
        HashSet<Integer> mySet = new HashSet<>();

        for(int num : nums){

            min = Math.min(min,num);
            max = Math.max(max,num);
            mySet.add(num);
        }

        for(int i = min+1 ; i < max ; i++){
            if(!mySet.contains(i)){
                res.add(i);
            }

        }
        return res;

        
    }
}