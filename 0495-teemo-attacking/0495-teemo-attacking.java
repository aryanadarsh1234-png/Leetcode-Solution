class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {

        int ans=0;

        for(int i =0; i < timeSeries.length-1; i++){

           if( timeSeries[i+1] - timeSeries[i] > duration){
            ans = ans+ duration; // no overlap
           } 
           else{
            ans = ans+timeSeries[i+1] - timeSeries[i]; // overlapping interval, so there differnce is equal to amount of time enemy was poisoned just before overlap.
           }

        }
        return ans+duration; // adding duration for the last attack
        
    }
}