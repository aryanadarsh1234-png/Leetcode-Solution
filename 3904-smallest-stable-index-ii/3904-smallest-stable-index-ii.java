class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;
        int[] suffix = new int[n];

        suffix[n-1] = nums[n-1];
        for(int i = n-2 ; i >=0 ; i--){
            suffix[i] = Math.min(nums[i], suffix[i+1]);
        } 
        int left_max = 0;
        for(int i = 0 ; i < n ; i++){
            left_max = Math.max(nums[i],left_max);
            int instability = left_max - suffix[i];
            if(instability <=k) return i;
        }
        return -1;
        
    }
}