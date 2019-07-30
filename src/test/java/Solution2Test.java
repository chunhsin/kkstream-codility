import org.junit.Assert;
import org.junit.Test;

/**
 * @author jamesliao
 * @since 2019-07-30
 */
public class Solution2Test {
    private Solution2 solution2 = new Solution2();

    @Test
    public void test_NullTree() throws Exception {
        // given
        // when
        int visibleCount = this.solution2.solution(null);
        // then
        Assert.assertEquals(0, visibleCount);
    }

    @Test
    public void test_Example1Tree() throws Exception {
        // given
        Tree exampleTree1 = getExampleTree1();
        // when
        int visibleCount = this.solution2.solution(exampleTree1);
        // then
        Assert.assertEquals(4, visibleCount);
    }

    @Test
    public void test_Example2Tree() throws Exception {
        // given
        Tree exampleTree2 = getExampleTree2();
        // when
        int visibleCount = this.solution2.solution(exampleTree2);
        // then
        Assert.assertEquals(2, visibleCount);
    }

    private Tree getExampleTree2() {
        Tree l2 = new Tree(2, new Tree(8), new Tree(7));
        Tree r2 = new Tree(6);
        return new Tree(8, l2, r2);
    }

    private Tree getExampleTree1() {
        Tree l2 = new Tree(3, new Tree(20), new Tree(21));
        Tree r2 = new Tree(10, new Tree(1), null);
        return new Tree(5, l2, r2);
    }
}