/*
 * @lc app=leetcode id=1652 lang=java
 *
 * [1652] Defuse the Bomb
 */

// @lc code=start
class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];

        if (k == 0) {
            for (int i = 0; i < code.length; i++) {
                code[i] = 0;
            } 
            return code;
        } else if (k > 0) {
            for (int i = 0; i < code.length; i++) {
                if (i + 1 + k > code.length) {
                    for (int j = i + 1; j < code.length; j++) {
                        result[i] += code[j];
                    }
                    for (int j = 0; j < i + 1 + k - code.length; j++) {
                        result[i] += code[j];
                    }
                } else {
                    for (int j = 1; j <= k; j++) {
                        result[i] += code[i + j];
                    }
                }
            }
            return result;
        } else if (k < 0) {
            for (int i = 0; i < code.length; i++) {
                if (i + k < 0) {
                    for (int j = i - 1; j >= 0; j--) {
                        result[i] += code[j];
                    }
                    for (int j = 1; j <= -k - i; j++) {
                        result[i] += code[code.length - j];
                    }
                } else {
                    for (int j = -1; j >= k; j--) {
                        result[i] += code[i + j];
                    }
                }
            }
            return result;
        }
        return null;
    }
}
// @lc code=end

