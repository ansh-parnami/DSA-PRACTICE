import java.util.Arrays;

public class LCS {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length()-1;
        int n=text2.length()-1;
        int[][] dp=new int[m+1][n+1];
        for(int[] rows : dp){
            Arrays.fill(rows,-1);
        }

        return helper(dp,m,n,text1,text2);
    }
    int helper(int[][] dp,int m,int n,String text1,String text2){
        if(m<0 || n<0){
            return 0;
        }
        if(text1.charAt(m)==text2.charAt(n)){
            return 1+helper(dp,m-1,n-1,text1,text2);
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        int left=helper(dp,m-1,n,text1,text2);
        int right=helper(dp,m,n-1,text1,text2);
        return dp[m][n]=Math.max(left,right);

    }
}
