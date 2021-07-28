/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) 
                n++;
            nums[i - n] = nums[i];
        }
        return nums.length - n;
    }
}
// @lc code=end

