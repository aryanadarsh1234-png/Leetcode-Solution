class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {

        List<Boolean> ans = new ArrayList<>();

        int n = nums.length;

        long rem = 0;

        for(int i = 0 ; i < n ; i++){
            rem = ((2*rem) + nums[i])%5;
            if(rem  == 0){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
}