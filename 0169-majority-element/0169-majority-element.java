class Solution {
    public int majorityElement(int[] nums) {

        int count =0;
        int candidate = nums[0];

        for(int num : nums){
            if(num == candidate){
                count++;
            }
            else{
                count--;
                if(count==0){
                    candidate = num;
                    count =1;
                }
            }

        }
        return candidate;
    }
}