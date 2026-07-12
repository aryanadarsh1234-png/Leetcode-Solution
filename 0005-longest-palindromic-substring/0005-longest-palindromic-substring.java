class Solution {
    public String longestPalindrome(String s) {


        int maxLen = 1;
        int first =0;

        for(int i = 0 ; i < s.length() ; i++){
            for(int j = i ; j < s.length() ; j++){

                if(isPalin(s,i,j) && (j-i+1)>maxLen){
                    first = i;
                    maxLen = j-i+1;
                }

            }
        }
        return s.substring(first,first+maxLen);
        
    }
    private boolean isPalin(String s , int start , int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}