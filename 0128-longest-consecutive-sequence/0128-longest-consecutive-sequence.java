class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0){
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int longestStreak =1;

        for(int curr : set){
            if(!set.contains(curr-1)){
                int currStart = curr;
                int currStreak = 1;

                while(set.contains(currStart+1)){
                currStart++;
                currStreak++;
                }
                longestStreak = Math.max(longestStreak , currStreak);
            }
        }
        return longestStreak;
        
    }
}