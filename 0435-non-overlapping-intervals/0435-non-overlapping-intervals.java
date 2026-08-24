class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        int n = intervals.length;

        Arrays.sort(intervals,Comparator.comparingInt(i->i[1]));

        int count = 1;
        int end = intervals[0][1];

        for(int i = 1 ; i < n ; i++){


            if(intervals[i][0] >=end){
                count++;
                end = intervals[i][1];
            }
        }
        return n-count;
        
    }
}