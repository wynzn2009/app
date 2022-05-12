package pris.dp;

public class MaximumSubarray53 {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int dp[][] = new int[nums.length][2];
        dp[0][0] = nums[0];
        dp[0][1] = Integer.MIN_VALUE;        
        for(int i=1;i<nums.length;i++){
            dp[i][0] = Math.max(dp[i-1][0]+nums[i], nums[i]);
            dp[i][1] = Math.max(dp[i-1][0], dp[i-1][1]);
        }
        return Math.max(dp[nums.length-1][0], dp[nums.length-1][1]);
    }


    public int maxSubArray1(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int dp[] = new int[2];
        dp[0] = nums[0];
        dp[1] = Integer.MIN_VALUE;        
        for(int i=1;i<nums.length;i++){
            dp[1] = Math.max(dp[0], dp[1]);
            dp[0] = Math.max(dp[0]+nums[i], nums[i]);
        }
        return Math.max(dp[0], dp[1]);
    }
}
