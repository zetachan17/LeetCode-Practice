/*
 * @lc app=leetcode id=152 lang=java
 *
 * [152] Maximum Product Subarray
 */

// @lc code=start
class Solution {
    int max = Integer.MIN_VALUE;

    public int maxProduct(int[] nums) {
        
    if (nums.length == 1) {
        return nums[0];
    }

        for (int i = 0; i < nums.length - 1; i++) {
            int left = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (left > max) {
                    max = left;
                }
                if (left == 0) {
                    left = 1;
                }
                left *= nums[j];
                if (left > max) {
                    max = left;
                }
            }
        }
        if (nums[nums.length - 1] > max) {
            max = nums[nums.length - 1];
        }
        return max;
    }
}
// @lc code=end

