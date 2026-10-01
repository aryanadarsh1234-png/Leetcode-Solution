class Solution {
    public int maxAreaOfIsland(int[][] grid) {

        int maxArea = 0;

        int rows = grid.length;
        int cols = grid[0].length;

        for(int r = 0 ; r < rows ; r++){
            for(int c = 0 ; c < cols ; c++){
                if(grid[r][c]==1){
                    maxArea = Math.max(maxArea,dfs(grid , r , c));
                }
            }
        }
        return maxArea;
        
    }
    public int dfs(int[][]grid , int i , int j){
        int rows = grid.length;
        int cols = grid[0].length;
        if(i < 0 || i >=rows || j <0 || j >=cols || grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;

        return 1 + dfs(grid, i-1 ,j) + dfs(grid,i+1,j) + dfs(grid , i , j-1) + dfs(grid,i,j+1);
    }
}