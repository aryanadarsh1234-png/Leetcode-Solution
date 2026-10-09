class Solution {
    public boolean isMiddleElementUnique(int[] nums) {

        int middleElement  = nums[(nums.length)/2];
        int count = 0;
        for(int num : nums){
            if(num==middleElement) count++;
        }
        return count==1;

        
    }
}