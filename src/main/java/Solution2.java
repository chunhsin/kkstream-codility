import java.util.Objects;

/**
 * @author jamesliao
 * @since 2019-07-30
 */
public class Solution2 {

    public int solution(Tree T) {
        if (Objects.isNull(T))
            return 0;
        int visibleCount = 1;

        visibleCount = getNodeVisibleCount(visibleCount, T.x, T.l);
        visibleCount = getNodeVisibleCount(visibleCount, T.x, T.r);

        return visibleCount;
    }

    private int getNodeVisibleCount(int visibleCount,
                                    int v,
                                    Tree t) {
        if(Objects.isNull(t))
            return visibleCount;
        if (t.x >= v)
            visibleCount++;
        visibleCount = getNodeVisibleCount(visibleCount, v, t.l);
        visibleCount = getNodeVisibleCount(visibleCount, v, t.r);
        return visibleCount;
    }
}


class Tree {
    public Tree() {
    }

    public Tree(int value) {
        this.x = value;
    }

    public Tree(int value,
                Tree l,
                Tree r) {
        this.x = value;
        this.l = l;
        this.r = r;
    }

    public int x;
    public Tree l;
    public Tree r;
}
