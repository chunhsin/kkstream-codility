/**
 * @author jamesliao
 * @since 2019-07-30
 */
public class Solution {

    public int solution(int[] T) {

        int firstWinterTemperature = T[0];
        int maxWinterLength = 1;
        boolean seasonChange = false;
        for (int i = 1; i < T.length - 1; i++) {
            if (T[i] <= firstWinterTemperature && !seasonChange) {
                maxWinterLength++;
            }
            else {
                seasonChange = true;
            }
        }

        return maxWinterLength;
    }

}
