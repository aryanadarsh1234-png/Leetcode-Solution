class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));

        List<int[]> res= new ArrayList<>();

        int[] cur_interval = intervals[0];

        res.add(cur_interval);

        for(int[] interval : intervals){

            if( cur_interval[1] >= interval[0]){
                cur_interval[1] = Math.max(cur_interval[1], interval[1]);
            }
            else{
                cur_interval = interval;
                res.add(cur_interval);
            }
        }
        return res.toArray(new int[res.size()][]);     
    }
}