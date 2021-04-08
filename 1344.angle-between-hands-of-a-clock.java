/*
 * @lc app=leetcode id=1344 lang=java
 *
 * [1344] Angle Between Hands of a Clock
 */

// @lc code=start
class Solution {
    public double angleClock(int hour, int minutes) {
        double minAngle = (double) minutes / 60 * 360;
        double hourAngle = (double) hour / 12 * 360 + minAngle / 360 * 30;

        double result = Math.abs(minAngle - hourAngle);

        if (result > 180) {
            result = 360 - result;
        }

        return result;
    }
}
// @lc code=end

