/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int result = 0;
        
        if (x == 0){
            return 0;
        }
        else if (x < 0) {
            x = -x;
            int digit = (int)(Math.log10(x) + 1);
            for (int i = 1; i <= digit; i++) {
                int k = (int) ((x % Math.pow(10, i)) / (Math.pow(10, i - 1)));
                result += k * (Math.pow(10, digit - i));
            }
            if (result == Math.pow(2, 31) - 1){
                result = 0;
            }
            result *= -1;
            return result;
        }
        else {
            int digit = (int)(Math.log10(x) + 1);
            for (int i = 1; i <= digit; i++) {
                int k = (int) ((x % Math.pow(10, i)) / (Math.pow(10, i - 1)));
                result += k * (Math.pow(10, digit - i));
            }
            if (result == Math.pow(2, 31) - 1){
                result = 0;
            }
            return result;
        }
    }
}
// @lc code=end

