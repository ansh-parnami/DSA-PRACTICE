import java.util.Arrays;

public class INC_LCS {
    public int lengthOfLIS(int[] nums) {
        int m = nums.length;
        int[][] dp = new int[m + 1][m + 1];

        for (int[] rows : dp) {
            Arrays.fill(rows, -1);
        }

        return helper(dp, 0, nums, -1);
    }

    private int helper(int[][] dp, int index, int[] nums, int prevIndex) {
        if (index == nums.length) {
            return 0;
        }

        if (dp[index][prevIndex + 1] != -1) {
            return dp[index][prevIndex + 1];
        }

        int take = 0;
        if (prevIndex == -1 || nums[index] > nums[prevIndex]) {
            take = 1 + helper(dp, index + 1, nums, index);
        }

        int notTake = helper(dp, index + 1, nums, prevIndex);

        return dp[index][prevIndex + 1] = Math.max(take, notTake);
    }
}
