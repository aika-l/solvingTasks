package recap.problemSolving;

import java.util.Arrays;
import java.util.List;

public class MinValueToGetPositiveStepByStepSum {
    /*
     Input: nums = [-3,2,-3,4,2]
        Output: 5
        Explanation: If you choose startValue = 4, in the third iteration
        your step by step sum is less than 1.
                step by step sum
                startValue = 4 | startValue = 5 | nums
                  (4 -3 ) = 1  | (5 -3 ) = 2    |  -3
                  (1 +2 ) = 3  | (2 +2 ) = 4    |   2
                  (3 -3 ) = 0  | (4 -3 ) = 1    |  -3
                  (0 +4 ) = 4  | (1 +4 ) = 5    |   4
                  (4 +2 ) = 6  | (5 +2 ) = 7    |   2
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(-3,2,-3,2,4,2);
        System.out.println(minStartValue(list));
    }

    public static long minStartValue(List<Integer> arr) {
        long min = 0;
        long sum = 0;
        for (long num : arr) {
            sum += num;
            min = Math.min(min, sum);
        }
        return 1 - min;
    }
}
