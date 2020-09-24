/*
 * @lc app=leetcode.cn id=36 lang=java
 *
 * [36] 有效的数独
 */

// @lc code=start
class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][10]; // 记录行
        int[][] col = new int[9][10]; // 记录列
        int[][] box = new int[9][10]; // 记录九宫格
        init(row);
        init(col);
        init(box);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                int compare = board[i][j] - '0';
                if (row[i][compare] != 0) return false;
                if (col[j][compare] != 0) return false;
                if(box[i/3+(j/3)*3][compare] != 0) return false; //利用int特性分离九宫格

                row[i][compare]++; // 标记查询过的行
                col[j][compare]++; // 标记查询过的列
                box[i/3+(j/3)*3][compare]++;


            }
        }
        return true;
    }

    // 初始化
    private int[][] init(int[][] matrix) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                matrix[i][j] = 0;
            }
        }
        return matrix;
    }
}
// @lc code=end

