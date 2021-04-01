import java.util.ArrayList;

/*
 * @lc app=leetcode id=1380 lang=java
 *
 * [1380] Lucky Numbers in a Matrix
 */

// @lc code=start
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        int[] rowMin = new int[matrix.length];
        int minIndex = 0;
        int result = 0;
        List<Integer> output = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minIndex = j;
                }
            }
            rowMin[i] = minIndex;
        }

        for (int i = 0; i < rowMin.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][rowMin[i]] > max) {
                    max = matrix[j][rowMin[i]];
                }
            }
            if (max == matrix[i][rowMin[i]]){
                result = matrix[i][rowMin[i]];
                output.add(result);
            }
        }
        return output;
    }
}
// @lc code=end

