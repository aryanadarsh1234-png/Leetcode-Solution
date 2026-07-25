class Solution {
    public int[] searchRange(int[] nums, int target) {

        int [] res = new int[]{-1,-1};
        res[0] = search(nums,target,true);

        if(res[0]!=-1){
            res[1] = search(nums,target,false);
        }
        return res;
    }
    private int search(int[] nums , int target , boolean isFirst){

        int left = 0;
        int right = nums.length-1;
        int ans = -1;

        while(left <= right){
            int mid = left + (right-left)/2;
            if(target==nums[mid]){
                ans = mid;

                if(isFirst){
                right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            else if(target > nums[mid]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return ans;

    }
}