/*
 * @lc app=leetcode id=1491 lang=java
 *
 * [1491] Average Salary Excluding the Minimum and Maximum Salary
 */

// @lc code=start
import java.util.Arrays;

class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double output = 0.0;

        for (int i = 1; i < salary.length - 1; i++) {
            output += salary[i];
        }

        return output / (salary.length - 2);
    }
}
// @lc code=end

