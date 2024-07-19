public class gameOflIfe {

    int count(int a[][], int i, int j) {
        int c = 0;
        if (i - 1 >= 0) {
            if (a[i - 1][j] == 1)
                c++;
        }
        if (i + 1 < a.length) {
            if (a[i + 1][j] == 1)
                c++;
        }

        if (j + 1 < a[0].length) {
            if (a[i][j + 1] == 1)
                c++;
        }

        if (j - 1 >= 0) {
            if (a[i][j - 1] == 1)
                c++;
        }

        if (i - 1 >= 0 && j + 1 < a[0].length) {
            if (a[i - 1][j + 1] == 1)
                c++;
        }

        if (i - 1 >= 0 && j - 1 >= 0) {
            if (a[i - 1][j - 1] == 1)
                c++;
        }

        if (i + 1 < a.length && j - 1 >= 0) {
            if (a[i + 1][j - 1] == 1)
                c++;
        }

        if (i + 1 < a.length && j + 1 < a[0].length) {
            if (a[i + 1][j + 1] == 1)
                c++;
        }

        return c;
    }

    public void gameOfLife(int[][] board) {
        int a[][] = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                a[i][j] = board[i][j];
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                int c = count(a, i, j);

                if (board[i][j] == 1) {
                    if (c < 2 || c > 3)
                        board[i][j] = 0;

                } else {
                    if (c == 3)
                        board[i][j] = 1;
                }
            }
        }

    }
}
