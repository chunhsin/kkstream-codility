import org.junit.Assert;
import org.junit.Test;

/**
 * @author jamesliao
 * @since 2019-07-30
 */
public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    public void test_example1() throws Exception {
        // given
        int[] T = new int[] {5, -2, 3, 8, 6};
        // when
        int maxWinterDay = this.solution.solution(T);
        // then
        Assert.assertEquals(3, maxWinterDay);
    }

    @Test
    public void test_example2() throws Exception {
        // given
        int[] T = new int[] {-5, -5, -5, -42, 6, 12};
        // when
        int maxWinterDay = this.solution.solution(T);
        // then
        Assert.assertEquals(4, maxWinterDay);
    }

    @Test
    public void test_example3() throws Exception {
        // given
        int[] T = new int[] {7, -5, -5, -5, -42, 6, 12};
        // when
        int maxWinterDay = this.solution.solution(T);
        // then
        Assert.assertEquals(6, maxWinterDay);
    }

    @Test
    public void test_example4() throws Exception {
        // given
        int[] T = new int[] {7, -5, -5, -5, -42, 7, 12};
        // when
        int maxWinterDay = this.solution.solution(T);
        // then
        Assert.assertEquals(6, maxWinterDay);
    }

    @Test
    public void test_maxExample() throws Exception {
        // given
        int[] T = new int[] {-1_000_000_000, -5, -5, -42, 6, 1_000_000_000};
        // when
        int maxWinterDay = this.solution.solution(T);
        // then
        Assert.assertEquals(1, maxWinterDay);
    }

}