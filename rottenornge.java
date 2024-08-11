import java.util.LinkedList;
import java.util.Queue;

public class rottenornge {
    static class pair {
        int i, j;

        pair(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    // Function to find minimum time required to rot all oranges.
    public int orangesRotting(int[][] grid) {
        Queue<pair> q = new LinkedList<>();
        int freshOranges = 0;

        // Add all initially rotten oranges to the queue and count fresh oranges
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    q.add(new pair(i, j));
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }

        // If there are no fresh oranges, return 0
        if (freshOranges == 0)
            return 0;

        int time = 0;

        while (!q.isEmpty()) {
            int s = q.size();
            boolean flag = false;

            for (int k = 0; k < s; k++) {
                pair p = q.remove();
                int i = p.i;
                int j = p.j;

                // Rot adjacent fresh oranges if they are within bounds
                if (i - 1 >= 0 && grid[i - 1][j] == 1) { // Up
                    grid[i - 1][j] = 2;
                    q.add(new pair(i - 1, j));
                    flag = true;
                }

                if (i + 1 < grid.length && grid[i + 1][j] == 1) { // Down
                    grid[i + 1][j] = 2;
                    q.add(new pair(i + 1, j));
                    flag = true;
                }

                if (j - 1 >= 0 && grid[i][j - 1] == 1) { // Left
                    grid[i][j - 1] = 2;
                    q.add(new pair(i, j - 1));
                    flag = true;
                }

                if (j + 1 < grid[0].length && grid[i][j + 1] == 1) { // Right
                    grid[i][j + 1] = 2;
                    q.add(new pair(i, j + 1));
                    flag = true;
                }
            }

            if (flag)
                time++;
        }

         
        // After BFS, check if any fresh oranges are left
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return -1; // Impossible to rot all oranges
                }
            }
        }

        return time;
    }
}
