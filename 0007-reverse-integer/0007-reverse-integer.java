class Solution {
    public int reverse(int x) {

        if(x==0) return 0;
        int ans =0;

        while(x !=0){

            int remainder= x%10;
            if(ans>Integer.MAX_VALUE/10 || ans<Integer.MIN_VALUE/10) return 0;
            ans=ans*10+remainder;
            x=x/10;
        }
        return ans; 
    }
}