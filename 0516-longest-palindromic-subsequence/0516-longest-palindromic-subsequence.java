class Solution {
    public int longestPalindromeSubseq(String s) {

        String s2="";

        for(int i=s.length()-1;i>=0;i--){
            s2 = s2 +s.charAt(i);
        }

        int [][] matrix = new int[s.length()+1][s2.length()+1];

        for(int i = s.length()-1 ; i>=0 ; i--){
            for(int j = s2.length()-1 ; j >=0 ; j--){
                if(s.charAt(i) == s2.charAt(j)){
                    matrix[i][j] = 1 + matrix[i+1][j+1];
                }
                else{
                    matrix[i][j] = Math.max(matrix[i][j+1],matrix[i+1][j]);
                }

            }
        }

        return matrix[0][0];
        
    }
}