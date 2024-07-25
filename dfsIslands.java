public class dfsIslands {
    void dfs(int i, int j, int m, int n, char[][] grid) {
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] != '1') {
            return;
        }

        grid[i][j] = '2';
        dfs(i + 1, j, m, n, grid);
        dfs(i - 1, j, m, n, grid);
        dfs(i, j + 1, m, n, grid);
        dfs(i, j - 1, m, n, grid);
    }

    public int numIslands(char[][] grid) {

        int n = grid.length;

        int m = grid[0].length;

        int c = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    dfs(i, j, n, m, grid);
                    c++;
                }
            }
        }

        return c;
    }
}
