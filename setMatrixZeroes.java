import java.util.HashSet;
import java.util.Set;

public class setMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();

        Set<Integer> cols = new HashSet<>();

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }

            }
        }

        for (Integer r : rows) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[r][i] = 0;
            }
        }

        for (Integer c : cols) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][c] = 0;
            }
        }

    }
}
