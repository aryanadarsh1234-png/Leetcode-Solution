class Solution {
    public int largestInteger(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
                map.put(num , map.getOrDefault(num,0)+1);
        }

        int n = nums.length;
        if(n==k){
            int maxValue = nums[0];

            for(int num : nums){
                maxValue = Math.max(maxValue,num);
            }
            return maxValue;
        }
        if(k==1){
            
            int maxValue=-1;
            for(int num : nums){
                if(map.get(num)==1){
                    maxValue = Math.max(maxValue,num);
                }
            }
            return maxValue;
        }

        int firstCount = map.get(nums[0]);
        int lastCount = map.get(nums[n-1]);
        int maxValue = -1;

        if(firstCount==1 && lastCount==1){
            return Math.max(nums[0],nums[n-1]);
        }
        else if(firstCount==1){
            return Math.max(maxValue,nums[0]);
        }
        else if(lastCount==1){
            return Math.max(maxValue,nums[n-1]);
        }
        return maxValue;
      



        
    }
}