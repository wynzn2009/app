package pris.dp;

public class ClimbingStairs70 {
    public int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        int[] dp = new int[3];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i=3;i<=n;i++){
            int re = dp[1] + dp[2];
            dp[1] = dp[2];
            dp[2] = re;
        }
        return dp[2];
    }
}
