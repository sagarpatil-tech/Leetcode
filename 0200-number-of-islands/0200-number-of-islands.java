class Solution {

    int[] dr = {-1, 1, 0, 0};
    int[] dc = {0, 0, -1, 1};

    public boolean valid(char[][] grid, int i, int j) {
        return i >= 0 && i < grid.length &&
               j >= 0 && j < grid[0].length &&
               grid[i][j] == '1';
    }

    public void dfs(char[][] grid, int i, int j) {

        if (!valid(grid, i, j)) {
            return;
        }

        grid[i][j] = '0';

        for (int k = 0; k < 4; k++) {
            dfs(grid, i + dr[k], j + dc[k]);
        }
    }

    public int numIslands(char[][] grid) {

        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {

                if (valid(grid, i, j)) {
                    count++;
                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }
}