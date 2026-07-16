class Solution {
    public long gcdSum(int[] nums) {

        int n = nums.length;
        int max =0;

        int[] prefixGcd = new int[n];

        for(int i = 0 ; i < n ; i++){
            max = Math.max(max,nums[i]);
            prefixGcd[i] = gcd(max,nums[i]);
        }
        Arrays.sort(prefixGcd);
        long ans =0;
        for(int i = 0 ; i < n/2 ; i++){
            ans+=gcd(prefixGcd[i],prefixGcd[n-1-i]);
        }
        return ans;
        
    }
    int gcd(int a , int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a =temp;
        }
        return a;
    }
}