class Solution {
    public int shortestSubarray(int[] nums, int k) {

        int n = nums.length;
        long[] prefix = new long[n+1];

        for(int i = 1 ; i < n+1 ; i++){
            prefix[i] = prefix[i-1] + nums[i-1];
        }

        Deque<Integer> deque = new ArrayDeque<>();
        int minLength = Integer.MAX_VALUE;
        
        for(int i = 0 ; i < n+1 ; i++){

            while(!deque.isEmpty() && prefix[i] - prefix[deque.peekFirst()] >=k){
                minLength = Math.min(minLength, i - deque.pollFirst());
            }
            while(!deque.isEmpty() && prefix[deque.peekLast()]>=prefix[i]){
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        if(minLength!=Integer.MAX_VALUE) return minLength;
        return -1;
    }
}