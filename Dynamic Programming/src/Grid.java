import java.util.Arrays;

public class Grid {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return helper(0, 0, dp);
    }

    int helper(int m, int n, int[][] dp) {

        if (m == dp.length - 1 && n == dp[0].length - 1) {
            return 1;
        }

        if (m >= dp.length || n >= dp[0].length) {
            return 0;
        }


        if (dp[m][n] != -1) {
            return dp[m][n];
        }


        int down = helper(m + 1, n, dp);
        int right = helper(m, n + 1, dp);

        return dp[m][n] = down + right;
    }
}
