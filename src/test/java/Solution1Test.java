import org.junit.Assert;
import org.junit.Test;

/**
 * @author jamesliao
 * @since 2019-07-30
 */
public class Solution1Test {
    @Test
    public void test_defaultExample() throws Exception {
        // given
        Solution1 solution1 = new Solution1();
        int[][] A = createTestMatrix();
        // when
        int saddlePointNumber = solution1.solution(A);
        // then
        Assert.assertEquals(2, saddlePointNumber);

    }

    @Test
    public void test_maxExample() throws Exception {
        // given
        Solution1 solution1 = new Solution1();
        int[][] A = createMaxMatrix(Integer.MAX_VALUE);
        // when
        int saddlePointNumber = solution1.solution(A);
        // then
        Assert.assertEquals(0, saddlePointNumber);
    }
    @Test
    public void test_minExample() throws Exception {
        // given
        Solution1 solution1 = new Solution1();
        int[][] A = createMaxMatrix(Integer.MIN_VALUE);
        // when
        int saddlePointNumber = solution1.solution(A);
        // then
        Assert.assertEquals(0, saddlePointNumber);
    }

    private int[][] createMaxMatrix(int value) {
        int[][] A = new int[500][500];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = value;
            }
        }
        return A;
    }

    private int[][] createTestMatrix() {
        int[][] A = new int[4][4];
        A[0][0] = 0;
        A[0][1] = 1;
        A[0][2] = 9;
        A[0][3] = 3;
        A[1][0] = 7;
        A[1][1] = 5;
        A[1][2] = 8;
        A[1][3] = 3;
        A[2][0] = 9;
        A[2][1] = 2;
        A[2][2] = 9;
        A[2][3] = 4;
        A[3][0] = 4;
        A[3][1] = 6;
        A[3][2] = 7;
        A[3][3] = 1;
        return A;
    }
}