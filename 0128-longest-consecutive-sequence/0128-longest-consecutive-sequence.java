class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length ==0) return 0;

        int longestStreak =1;
        Set<Integer> mySet = new HashSet<>();

        for(int num : nums){
            mySet.add(num);
        }

        for(int num : mySet){
            if(!mySet.contains(num-1)){
                int curr_start = num;
                int curr_streak = 1;

                while(mySet.contains(curr_start+1)){
                curr_start++;
                curr_streak++;
                }
                longestStreak = Math.max(longestStreak,curr_streak);
            }
        }
        return longestStreak; 
    }
}