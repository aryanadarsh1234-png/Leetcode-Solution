class Solution {
    public int numDecodings(String s) {


        int n = s.length();
        if(n==0 || s.charAt(0)=='0') return 0;

        int prev1 = 1;
        int prev2 = 1;
        for(int i = 1 ; i < n ; i++){

            int cur =0;
            char curChar = s.charAt(i);
            char prevChar = s.charAt(i-1);

            if(curChar != '0'){
                cur = cur + prev1; 
            }
            if(prevChar == '1' || (prevChar == '2' && curChar <='6')){
                cur = cur + prev2;
            }
            if(cur==0) return 0;
            prev2 = prev1;
            prev1 = cur;

        }
        return prev1;
    }
}