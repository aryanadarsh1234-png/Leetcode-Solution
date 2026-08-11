class Solution {
    public int lengthOfLIS(int[] nums) {


        int [] ans = new int [nums.length];
        int max=1;
        Arrays.fill(ans,1);

        for(int i = 1 ; i < nums.length ; i++){
            for(int j = 0 ; j < i ; j++){
                if(nums[j]<nums[i]){
                    ans[i] = Math.max(ans[i],ans[j]+1);
                }
                max = Math.max(max,ans[i]);
            }
        }
        return max;
    }
}