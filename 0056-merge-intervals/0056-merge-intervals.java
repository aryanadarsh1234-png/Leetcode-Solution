class Solution {
    public int[][] merge(int[][] intervals) {

        if(intervals.length <=1){
            return intervals;
        }
        List<int[]> result = new ArrayList<>();
        Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));

        int[] current_interval = intervals[0];

        result.add(current_interval);

        for(int[] interval : intervals){
            if(current_interval[1]>=interval[0]){
                current_interval[1]=Math.max(current_interval[1],interval[1]);
            }
            else{
                current_interval = interval;
                result.add(current_interval);
            }

        }
        return result.toArray(new int[result.size()][]);
    }
}