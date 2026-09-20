class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int [][] matrix = new int[m+1][n+1];

        for(int i = m-1 ; i >=0 ; i--){
            for(int j= n-1 ; j >=0 ; j--){
                if(text1.charAt(i) == text2.charAt(j)){
                    matrix[i][j] = 1+matrix[i+1][j+1];
                }
                else{
                    matrix[i][j] = Math.max(matrix[i+1][j],matrix[i][j+1]);
                }
            }
        }
        return matrix[0][0];
        
    }
}