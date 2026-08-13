class Solution {
    public int findMinArrowShots(int[][] points) {

        if(points.length==0){
            return 0;
        }

        Arrays.sort(points,Comparator.comparingInt(i->i[1]));
        int arrows =1;

        int current_pos = points[0][1];

        for(int i =1 ; i < points.length ;i++){
            if(current_pos < points[i][0] ){
                arrows++;
                current_pos=points[i][1];
            }
        }
        return arrows;
    }
}