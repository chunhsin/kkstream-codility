/**
 * @author jamesliao
 * @since 2019-07-30
 */
public class Solution1 {

    private int[][] matrix;

    public int solution(int[][] A) {
        matrix = A;
        int saddlePointCount = 0;
        for (int p = 1; p < A.length - 1; p++) {
            for (int q = 1; q < A[p].length - 1; q++) {
                if (isLocalMinimumInRow(p, q) && isLocalMaximumInColumn(p, q)) {
                    saddlePointCount++;
                }
                else if (isLocalMaximumInRow(p, q) && isLocalMinimumInColumn(p, q)) {
                    saddlePointCount++;
                }
            }
        }
        return saddlePointCount;
    }

    private boolean isLocalMinimumInColumn(int row,
                                           int column) {

        return matrix[row - 1][column] > matrix[row][column] && matrix[row + 1][column] > matrix[row][column];
    }

    private boolean isLocalMaximumInRow(int row,
                                        int column) {
        return matrix[row][column - 1] < matrix[row][column] && matrix[row][column + 1] < matrix[row][column];
    }

    private boolean isLocalMaximumInColumn(int row,
                                           int column) {
        return matrix[row - 1][column] < matrix[row][column] && matrix[row + 1][column] < matrix[row][column];
    }

    private boolean isLocalMinimumInRow(int row,
                                        int column) {

        return matrix[row][column - 1] > matrix[row][column] && matrix[row][column + 1] > matrix[row][column];
    }
}
