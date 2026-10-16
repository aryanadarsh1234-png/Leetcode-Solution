class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int num : nums){
            freq.put(num , freq.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)->freq.get(a)-freq.get(b));

        for(int num : freq.keySet()){
            minHeap.add(num);
            if(minHeap.size()>k) minHeap.poll();
        }
        int [] ans = new int[k];
        for(int i = 0 ; i < k ; i++){
            ans[i] = minHeap.poll();
        }
        return ans;
        
    }
}