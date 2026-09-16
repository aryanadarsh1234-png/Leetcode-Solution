class Solution {
    public int lengthOfLIS(int[] nums) {

        int max =1;

        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans,1);

        for(int i = 1 ; i < n ; i++){
            for(int j = 0 ; j < i ; j++){
                if(nums[j] < nums[i]){
                    ans[i] = Math.max(ans[i] , 1 + ans[j]);
                }
                max = Math.max(max,ans[i]);
            }
        }
        return max;

        
    }
}